//Calendar�� String ���� ��¥ ��ȯ�ϱ�

package kr.co.infopub.chapter.s075;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class RestDay {
	
	public static void main(String[] args) {
		
		TimeZone tz = TimeZone.getDefault(); //Asia/Seoul ���� ��ǻ���� �ð���
		String st = "2017-06-13";
		Calendar d2 = todate(st);
		System.out.println(toYMD(d2,tz));
		String st2 = goGo(st, -7, tz); //-7��
		System.out.println(st2);
		Calendar d3 = todate(st2);
		System.out.println(toYMD(d3,tz));
		
		
		Calendar cal = Calendar.getInstance(tz); //Ÿ������ ���� ����
		System.out.println("�ƽþ� ���� �ð� : "+toYMD2(cal, tz));
		
		// America/New_York,
		TimeZone tzNY = TimeZone.getTimeZone("America/Chicago"); //�Ƹ޸�ī, ��ī�� Ÿ���� ��������
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		
		sdf.setTimeZone(tzNY);
		System.out.println("�Ƹ޸�ī ��ī�� �ð� : "+sdf.format(date));
		
		
		Calendar calNY = Calendar.getInstance(); //�Ű������� �� �ν��� �ȵ���? -> �˰��� �ν��� �Ǵµ� getTime()�� �� date���� ����
		//calNY.setTimeZone(tzNY);
		String name = calNY.getTimeZone().getDisplayName();
		
		System.out.println("Current Time Zone:" + name );
		//System.out.println("�� : "+calNY.get(Calendar.DAY_OF_MONTH)); //��������� ���� ���
		//System.out.println("��¥ : "+calNY.getTime()); 
		//getTime�� Ÿ���� ������ �� Ÿ�� �� ����. ������ �˾ƺ��� date��ü�� Ÿ������ ������ ���� �ʴٰ� �Ѵ�.
		System.out.println("�Ƹ޸�ī ��ī�� �ð� : "+toYMD2(calNY, tzNY));
		
	}
	
	public static Calendar todate(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dd = new Date();
		try {
			dd = sdf.parse(str);
		} catch (ParseException e) {
			System.out.println("������ yyyy-MM-dd�� �Է��� �ּ���."); //������ ���� �⺻ new Date()�� ���� ��¥�� �Ѿ��.
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(dd);
		return cal;
	}
	
	public static String toYMD(Calendar cal, TimeZone tz) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setTimeZone(tz); //DateFormat��ü�� Ÿ������ �����ߴ�.
		return sdf.format(cal.getTime());
	}
	
	public static String toYMD2(Calendar cal, TimeZone tz) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.setTimeZone(tz); //���� ����.
		return sdf.format(cal.getTime());
	}
	
	public static String goGo(String str, int day, TimeZone tz) {
		Calendar cal = todate(str);
		// -7���� ���ϸ� ������ ��
		cal.add(Calendar.DAY_OF_YEAR, day);
		//Ķ������ ���ڿ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setTimeZone(tz); //���� ����.
		return sdf.format(cal.getTime()); 
	}

}
