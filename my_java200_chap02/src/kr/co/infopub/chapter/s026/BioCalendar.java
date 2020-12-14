// 상수 사용하기

package kr.co.infopub.chapter.s026;

public class BioCalendar {
	
	public static final int PHYSICAL = 23;
	
	public static void main(String[] args) {
		
		System.out.println(PHYSICAL);
		int index = PHYSICAL;
		// Math.PI 3.14에서 정의되어 있는 상수
		double vals = 2 * Math.PI / index;
		System.out.println(vals + "라디안");
		
	}

}
