// varargs(variable arguments)를 이용하여 배열 출력하기

package kr.co.infopub.chapter.s055;

public class ForeachLotto {
	
	public static void print(int ... mm) {
		for (int m : mm) {
			System.out.printf(m + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] mm = {1,6,16,22,23,33};
		print(mm); //배열
		int a = 1, b = 6, c =21 ;
		print(a);
		print(a, b);
		print(a,b,c,a,b,c);
	}

}
