//수학 연산에서 발생하는 예외 처리하기

package kr.co.infopub.chapter.s063;

public class FinallyTryCatch {
	
	public static void main(String[] args) {
		try {
			//Divide by zero
			int x = 5;
			int y = 20 / (5 -x);
			System.out.println(y);
		} catch (ArithmeticException e) { //runtime
			System.out.println(" ==> 0으로 나누었나 확인해 봐");
			e.printStackTrace();
		} finally {
			System.out.println("난 수행되어야만 해");
		}
	}

}
