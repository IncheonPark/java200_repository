// 1���� �迭 �����ϱ�

package kr.co.infopub.chapter.s077;

import java.util.Arrays;

public class ArrayInit {
	
	public static void main(String[] args) {
		
		int[] a;
		a = new int[5];
		a = new int[3];
		a = new int[6];
		a = new int[3];
		a = new int[5];
		a[0] = 2; a[1] = 5; a[2] = 3; a[3] = 9; a[4] = 8;
		
		int[] b = new int[] {2,5,3,9,8};
		b = new int[] {1,3,4,4,5};
		b = new int[] {1,2,3};
		print(b);
		
		int[] c = {2,5,3,9,8}; //���� �迭, �� �ʱ�ȭ �Ұ�
		//c = {1,2,3}; ���ο� �������� �ʱ�ȭ�� �ȵ�
		c = new int[] {3,5,7}; //�������� �������� �ʱ�ȭ�� ��
		print(c);
		
		
		int[] e = new int[5];
		Arrays.fill(e, -1);
		print(e);
		System.arraycopy(c,0,e,0,c.length); //c�迭 0��°���� 5��(c.length)�� -> e�迭 0��°���� 5���� �����Ѵ�.
		print(e);
		Arrays.sort(e);
		print(e);
		
		e = new int[] {1,2,3,4,5,6}; // ���� �迭 �� �ʱ�ȭ ����
		print(e);
		int index = Arrays.binarySearch(e, 5); //e�迭���� 5�� �ִ� ��ġ�� ã�´�. 5�� ��ġ�� index4��.
		System.out.println("index : "+index);
		
		int[] num = new int[5];
		inputValue(num);
		print(num);
		
	}
	
	public static void inputValue(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = i;
			
		}
		
	}
	
	public static void print(int[] a) {
		int n = 0;
		for(int i : a) { //���� for��
			
			System.out.print(n + ":" +i + "\t");
			n++;
		}
		System.out.println();
	}

}
