//Stream�� �̿��Ͽ� Ȧ���� �� ���ϱ�

package kr.co.infopub.chapter.s059;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ForCondition3 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		int s=0;
		for (int i=1; i<= 100; i++) {
			list.add(i);
		}
		
		s = list.stream().reduce(0, Integer::sum);
		System.out.println("1~100�� �� : " +s);
		
		s=0;
		
		s = list.stream().filter(i -> i%2 ==1).reduce(0, Integer::sum);
		System.out.println("1~100���� Ȧ���� �� : " +s);
		
		s = list.stream().filter(i -> i%2 ==1).reduce(0, (x,y) -> x+y);
		System.out.println("1~100���� Ȧ���� �� : " +s);
		
		s = list.stream().filter(i -> i%2 == 1).reduce(0, new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		});
		System.out.println("1~100���� Ȧ���� �� : " +s);
	}

}