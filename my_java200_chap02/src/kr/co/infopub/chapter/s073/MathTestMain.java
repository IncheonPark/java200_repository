//수학 관련 메서드 사용하기

package kr.co.infopub.chapter.s073;

public class MathTestMain {
	
	public static void main(String[] args) {
		
		// constant 상수
		System.out.println("Math.E : " + Math.E);
		System.out.println("Math.PI : " + Math.PI);
		
		//method
		System.out.println("Math.abs(-5) 절대값 : " + Math.abs(-5));
		System.out.println("Math.ceil(4.34) 올림 : " +Math.ceil(4.34));
		System.out.println("Math.round(4.5) 반올림 : "+Math.round(4.5)); //0.5부터 반올림이 된다.
		System.out.println("Math.floor(4.34) 버림 : "+Math.floor(4.34));
		System.out.println("Math.rint(4.50) 반올림 : "+Math.rint(4.50)); //0.51부터 반올림이 된다.
		System.out.println("Math.rint(4.51) 반올림 : "+Math.rint(4.51));
		System.out.println("Math.max(45,78) 최대값 : "+Math.max(45,78)); 
		System.out.println("Math.min(45,78) 최소값 : "+Math.min(45,78)); 
		System.out.println("Math.pow(2,4) 2의 4승: "+Math.pow(2,4));
		System.out.println("Math.log(30) : "+Math.log(30)); //밑수가 Math.E인 로그
		System.out.println("Math.exp(3) : "+Math.exp(3)); //exp(num)는 pow(Math.E, num)로 자연 지수의 승수이다.
		System.out.println("Math.sqrt(10) : "+Math.sqrt(10)); //양의 제곱근을 구한다.
		System.out.println("Math.sin(Math.toRadians(90)) : " +Math.sin(Math.toRadians(90)));
		System.out.println("Math.cos(Math.toRadians(180) : " +Math.cos(Math.toRadians(180)));
		
		
		//Random
		double dRan = Math.random(); // 0 <= dRan < 1 실수 (0과 1사이의 실수)
		System.out.println("Math.random() => " +dRan);
		System.out.println("Math.random()*100 => " + dRan*100);
		
		
	}

}
