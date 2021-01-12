//Calendar로 살아온 날 구하기

package kr.co.infopub.chapter.s074;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	
	public static void main(String[] args) {
		
		long millis = System.currentTimeMillis(); //1970.1.1부터 경과 시간 msec
		System.out.println(millis/1000/60/60/24); //경과한 날의 수
		
		Date date = new Date(); //오늘
		System.out.println("오늘 : " +date);
		Date tomorrow = new Date(date.getTime()+(1000*60*60*24)); //하루 후
		System.out.println("하루 후 : "+tomorrow);
		
		Calendar cal1970 = Calendar.getInstance();
		cal1970.set(1970, 1-1, 1); // 0월 ~ 11월을 입력해서 사용(실제로는 1월에서 12월), 1970.1.1
		
		Calendar cal2017 = Calendar.getInstance();
		cal2017.set(2017, 3-1, 1); //3월 1일
		
		Calendar today = Calendar.getInstance(); //오늘
		printCalendar(today);
		long minus = today.getTimeInMillis() - cal1970.getTimeInMillis();
		System.out.println("몇 밀리 초 : "+minus); // 1970.1.1 ~ 오늘 msec
		System.out.println("며칠 : "+minus/1000/60/60/24); // 1970년부터 며칠 지났는가?
		
		long minus2 = today.getTimeInMillis() - cal2017.getTimeInMillis();
		
		System.out.println("며칠 : "+minus2/1000/60/60/24);
		
	}
	
	// 캘린더 정보
	public static void printCalendar(Calendar c) {
		System.out.println("-------------------");
		System.out.println(c.get(Calendar.YEAR)); //몇 년
		System.out.println(c.get(Calendar.MONTH)); //몇 월
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //며칠
		System.out.println(c.get(Calendar.AM_PM)); // 1 PM, 0 AM
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); // 몇 시 Calendar.HOUR
		System.out.println(c.get(Calendar.MINUTE)); //몇 분
		System.out.println(c.get(Calendar.SECOND)); // 몇 초
	}

}
