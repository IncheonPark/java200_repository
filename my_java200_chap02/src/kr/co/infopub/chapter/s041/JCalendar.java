//논리 연산자(&&, ||)로 윤년 판별하기

package kr.co.infopub.chapter.s041;

public class JCalendar {
	
	public boolean isLeapYear(int year) {
		boolean isS = false;
		if( ((year % 4 ==0) && (year % 100 != 0)) || (year % 400 == 0)) {
			isS = true;
		}
		return isS;
	}
	
	public static void main(String[] args) {
		JCalendar hc = new JCalendar();
		System.out.println(hc.isLeapYear(2020));
		System.out.println(hc.isLeapYear(2021));
		System.out.println(hc.isLeapYear(2022));
		System.out.println(hc.isLeapYear(2023));
		System.out.println(hc.isLeapYear(2024));
		System.out.println(hc.isLeapYear(2025));
		
		System.out.println("--------------------");
		
		System.out.println(hc.isLeapYear(2096));
		System.out.println(hc.isLeapYear(2097));
		System.out.println(hc.isLeapYear(2098));
		System.out.println(hc.isLeapYear(2099));
		System.out.println(hc.isLeapYear(2100));
		System.out.println(hc.isLeapYear(2101));
		System.out.println(hc.isLeapYear(2102));
		System.out.println(hc.isLeapYear(2103));
		System.out.println(hc.isLeapYear(2104));
		
		
	}

}
