// �������� �̿��Ͽ� �Ҽ� �Ǻ��ϱ�

package kr.co.infopub.chapter.s049;

public class PrimeNumber {
	
	public static boolean isPrime(int n) {
		boolean isS = true;
		for (int i = 2; i <=(int)Math.sqrt(n); i++) {
			if(n%i == 0) {
				isS=false;
				break;
			}
		}
		return isS;
	}
	
	public static void main(String[] args) {
		
		int value = 101;
		boolean answer = isPrime(value);
		if(answer) {
			System.out.printf("%d�� �Ҽ��Դϴ�.",value);
		} else {
			System.out.printf("%d�� �Ҽ��� �ƴմϴ�.",value);
		}
		
	}

}
