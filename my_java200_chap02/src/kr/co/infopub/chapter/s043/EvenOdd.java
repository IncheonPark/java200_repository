// while�� �̿��Ͽ� 1�� �� ������ ������ ���ϱ�

package kr.co.infopub.chapter.s043;

public class EvenOdd {
	
	public static void showOddnEvenw(int n) {
		int temp = n;
		while(temp != 1) {
			if (temp%2 == 1) {
				temp = temp * 3 + 1;
			} else {
				temp /= 2; //temp = temp/2;
			}
			System.out.printf("["+temp+"]");
		}
		System.out.println("\n---------------------");
	}
	
	public static void main(String[] args) {
		showOddnEvenw(1);
		showOddnEvenw(122);
	}

}
