// 삼항연산자를 이용하여 짝, 홀수 판별하기

package kr.co.infopub.chapter.s035;

public class EvenOddTriCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 98;
		temp = (temp%2 == 1) ? temp*3+1 : temp/2;
		System.out.printf("계산 후 = %d\n", temp); //B, C, D의 타입이 동일해야 하고, 연산 결과는 D에 대입한다.

	}

}
