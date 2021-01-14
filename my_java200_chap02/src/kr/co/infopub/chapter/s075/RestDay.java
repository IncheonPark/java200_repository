//Calendar와 String 사이 날짜 변환하기

package kr.co.infopub.chapter.s075;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class RestDay {
	
	public static void main(String[] args) {
		
		TimeZone tz = TimeZone.getDefault(); //Asia/Seoul 현재 컴퓨터의 시간존
		String st = "2017-06-13";
		Calendar d2 = todate(st);
		System.out.println(toYMD(d2,tz));
		String st2 = goGo(st, -7, tz); //-7일
		System.out.println(st2);
		Calendar d3 = todate(st2);
		System.out.println(toYMD(d3,tz));
		
		
		Calendar cal = Calendar.getInstance(tz); //타임존에 대한 오늘
		System.out.println("아시아 서울 시간 : "+toYMD2(cal, tz));
		
		// America/New_York,
		TimeZone tzNY = TimeZone.getTimeZone("America/Chicago"); //아메리카, 시카고 타임존 가져오기
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		
		sdf.setTimeZone(tzNY);
		System.out.println("아메리카 시카고 시간 : "+sdf.format(date));
		
		
		Calendar calNY = Calendar.getInstance(); //매개변수가 왜 인식이 안되지? -> 알고보니 인식은 되는데 getTime()쓸 때 date에서 못씀
		//calNY.setTimeZone(tzNY);
		String name = calNY.getTimeZone().getDisplayName();
		
		System.out.println("Current Time Zone:" + name );
		//System.out.println("일 : "+calNY.get(Calendar.DAY_OF_MONTH)); //여기까지는 정상 출력
		//System.out.println("날짜 : "+calNY.getTime()); 
		//getTime은 타임존 설정을 안 타는 것 같다. 이유를 알아보니 date객체는 타임존을 가지고 있지 않다고 한다.
		System.out.println("아메리카 시카고 시간 : "+toYMD2(calNY, tzNY));
		
	}
	
	public static Calendar todate(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dd = new Date();
		try {
			dd = sdf.parse(str);
		} catch (ParseException e) {
			System.out.println("형식을 yyyy-MM-dd로 입력해 주세요."); //오류가 나면 기본 new Date()인 오늘 날짜가 넘어간다.
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(dd);
		return cal;
	}
	
	public static String toYMD(Calendar cal, TimeZone tz) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setTimeZone(tz); //DateFormat객체에 타임존을 세팅했다.
		return sdf.format(cal.getTime());
	}
	
	public static String toYMD2(Calendar cal, TimeZone tz) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.setTimeZone(tz); //위와 같다.
		return sdf.format(cal.getTime());
	}
	
	public static String goGo(String str, int day, TimeZone tz) {
		Calendar cal = todate(str);
		// -7일을 더하면 일주일 전
		cal.add(Calendar.DAY_OF_YEAR, day);
		//캘린더를 문자열로
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setTimeZone(tz); //위와 같다.
		return sdf.format(cal.getTime()); 
	}

}
