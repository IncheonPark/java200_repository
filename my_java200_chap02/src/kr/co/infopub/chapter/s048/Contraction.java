//while�� ���� �����ڸ� �̿��Ͽ� �� �ڸ����� �� ���ϱ�

package kr.co.infopub.chapter.s048;

public class Contraction {
	
	public static int sumEach(int n) {
		int tot =0;
		while(n != 0) {
			tot += n%10;
			n /= 10;
		}
		return tot;
	}
	
	public static void main(String[] args) {
		int number = 123;
		int value = sumEach(number);
		System.out.printf("%d�� ���� �� �ڸ��� ���� �� : %d",number,value);
	}

}