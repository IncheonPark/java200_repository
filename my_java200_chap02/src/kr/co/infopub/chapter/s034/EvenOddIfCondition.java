// if ���ǹ��� �̿��Ͽ� ¦, Ȧ�� �Ǻ��ϱ�

package kr.co.infopub.chapter.s034;

public class EvenOddIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp = 98;
		if(temp%2 ==1) {
			temp = temp * 3 + 1;
		} else {
			temp = temp/2;
		}
		System.out.printf("��� �� = %d\n", temp);

	}

}
