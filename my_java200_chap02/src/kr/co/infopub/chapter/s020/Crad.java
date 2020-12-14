// 정수 연산하기

package kr.co.infopub.chapter.s020;

// 정수 변수, 연산

public class Crad {
	
	public static void main(String[] args) {
		
		int kor = 90;
		int eng = 80;
		int math = 89;
		int tot=kor+eng+math; //259
		double average = tot/3.0; //정수 연산은 정수 86.3333 -> 86
		System.out.printf("국어 %d점, 영어 %d점, 수학 %d점 => \t", kor,eng,math);
		System.out.printf("총점 %d점", tot);
		System.out.println(average);
		System.out.printf("평균 %f점", average); //double형 지정자는 %f로 한다.
		
	}

}
