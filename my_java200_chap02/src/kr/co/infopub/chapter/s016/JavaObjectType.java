//API���� �����ϴ� ���� Ÿ�� ����ϱ�
package kr.co.infopub.chapter.s016;

import java.util.Calendar;
import java.util.Date;

public class JavaObjectType {
	
	public static void main(String[] args) {
		
		//�⺻ Ÿ���� �迭�� ���� Ÿ��
		int [] m = {1,2,3};
		int [] n = new int[] {1,2,3};
		
		// ���� Ÿ�� - ��ü Ÿ��
		String card = "H8";
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		
		//�ڵ����� toString()�� ����
		System.out.println(card); //card.toString()
		System.out.println(d); //d.toString()
		System.out.println(cal); //cal.toString()
		
		System.out.println(card.toString()); //card.toString()
		System.out.println(d.toString()); //d.toString()
		System.out.println(cal.toString()); //cal.toString()
		
	}

}
