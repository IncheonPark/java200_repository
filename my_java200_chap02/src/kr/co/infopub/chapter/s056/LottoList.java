//�迭���� ���� List ����ϱ�

package kr.co.infopub.chapter.s056;

import java.util.ArrayList;
import java.util.List;

public class LottoList {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for (int i=0; i<=10; i++) {
			list.add((int)(Math.random()*10+1)); //1���� 10���� ������ ���ڸ� �־���.
		}
		
		for (int i=0; i<list.size(); i++) {
			int m =list.get(i);
			System.out.printf("%d\t", m);
		}
		System.out.println();
		
	}

}
