//for�� if�� �̿��Ͽ� Ȧ���� ���� ������ �� ���ϱ�

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
				System.out.printf("%d�� ���� : %d\t", m, m*m);
			}
		}
		System.out.println();
		System.out.println("1~10 ������ Ȧ���� ���� ������ : "+s);
	}

}
