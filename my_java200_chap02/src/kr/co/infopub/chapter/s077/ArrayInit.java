// 1차원 배열 이해하기

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
		
		int[] c = {2,5,3,9,8}; //정적 배열, 재 초기화 불가
		//c = {1,2,3}; 새로운 정적으로 초기화는 안됨
		c = new int[] {3,5,7}; //정적에서 동적으로 초기화는 됨
		print(c);
		
		
		int[] e = new int[5];
		Arrays.fill(e, -1);
		print(e);
		System.arraycopy(c,0,e,0,c.length); //c배열 0번째부터 5개(c.length)를 -> e배열 0번째부터 5개로 저장한다.
		print(e);
		Arrays.sort(e);
		print(e);
		
		e = new int[] {1,2,3,4,5,6}; // 동적 배열 재 초기화 가능
		print(e);
		int index = Arrays.binarySearch(e, 5); //e배열에서 5가 있는 위치를 찾는다. 5의 위치는 index4다.
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
		for(int i : a) { //향상된 for문
			
			System.out.print(n + ":" +i + "\t");
			n++;
		}
		System.out.println();
	}

}
