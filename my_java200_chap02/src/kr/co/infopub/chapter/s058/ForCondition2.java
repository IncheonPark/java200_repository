//for와 if를 이용하여 홀수에 대한 제곱의 합 구하기

package kr.co.infopub.chapter.s058;

import java.util.ArrayList;
import java.util.List;

public class ForCondition2 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int s=0;
		for (int i=1; i <= 10; i ++) {
			list.add(i);
		}
		for(int m : list) {
			if (m %2 == 1) {
				s = s + m*m;
				System.out.printf("%d의 제곱 : %d\t", m, m*m);
			}
		}
		System.out.println();
		System.out.println("1~10 사이의 홀수에 대한 제곱합 : "+s);
	}

}
