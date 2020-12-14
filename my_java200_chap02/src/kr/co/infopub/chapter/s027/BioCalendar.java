// 연산자를 이용ㅎ아여 바이오리듬 값 구하기

package kr.co.infopub.chapter.s027;

public class BioCalendar {
	
	public static final int PHYSICAL = 23; //상수(개발자 정의), 상수값은 변경 불가
	
	public static void main(String[] args) {
		
		int index = PHYSICAL;
		int days = 1200;
		
		double vals = (days % index) * 2 * Math.PI / index ;
		System.out.println(vals);
		System.out.println(Math.toDegrees(vals) + " 도입니다.");
		
	}

}
