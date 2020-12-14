//API에서 제공하는 참조 타입 사용하기
package kr.co.infopub.chapter.s016;

import java.util.Calendar;
import java.util.Date;

public class JavaObjectType {
	
	public static void main(String[] args) {
		
		//기본 타입의 배열은 참조 타입
		int [] m = {1,2,3};
		int [] n = new int[] {1,2,3};
		
		// 참조 타입 - 객체 타입
		String card = "H8";
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		
		//자동으로 toString()이 붙음
		System.out.println(card); //card.toString()
		System.out.println(d); //d.toString()
		System.out.println(cal); //cal.toString()
		
		System.out.println(card.toString()); //card.toString()
		System.out.println(d.toString()); //d.toString()
		System.out.println(cal.toString()); //cal.toString()
		
	}

}
