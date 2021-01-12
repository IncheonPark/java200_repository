//Calendar�� ��ƿ� �� ���ϱ�

package kr.co.infopub.chapter.s074;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	
	public static void main(String[] args) {
		
		long millis = System.currentTimeMillis(); //1970.1.1���� ��� �ð� msec
		System.out.println(millis/1000/60/60/24); //����� ���� ��
		
		Date date = new Date(); //����
		System.out.println("���� : " +date);
		Date tomorrow = new Date(date.getTime()+(1000*60*60*24)); //�Ϸ� ��
		System.out.println("�Ϸ� �� : "+tomorrow);
		
		Calendar cal1970 = Calendar.getInstance();
		cal1970.set(1970, 1-1, 1); // 0�� ~ 11���� �Է��ؼ� ���(�����δ� 1������ 12��), 1970.1.1
		
		Calendar cal2017 = Calendar.getInstance();
		cal2017.set(2017, 3-1, 1); //3�� 1��
		
		Calendar today = Calendar.getInstance(); //����
		printCalendar(today);
		long minus = today.getTimeInMillis() - cal1970.getTimeInMillis();
		System.out.println("�� �и� �� : "+minus); // 1970.1.1 ~ ���� msec
		System.out.println("��ĥ : "+minus/1000/60/60/24); // 1970����� ��ĥ �����°�?
		
		long minus2 = today.getTimeInMillis() - cal2017.getTimeInMillis();
		
		System.out.println("��ĥ : "+minus2/1000/60/60/24);
		
	}
	
	// Ķ���� ����
	public static void printCalendar(Calendar c) {
		System.out.println("-------------------");
		System.out.println(c.get(Calendar.YEAR)); //�� ��
		System.out.println(c.get(Calendar.MONTH)); //�� ��
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //��ĥ
		System.out.println(c.get(Calendar.AM_PM)); // 1 PM, 0 AM
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); // �� �� Calendar.HOUR
		System.out.println(c.get(Calendar.MINUTE)); //�� ��
		System.out.println(c.get(Calendar.SECOND)); // �� ��
	}

}
