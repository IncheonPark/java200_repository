//Stream�� map�� �̿��Ͽ� Ȧ���� ���� ������ �� ���ϱ�

package kr.co.infopub.chapter.s060;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForLambdaCondition {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int s=0;
		for (int i=1; i <=10; i++) {
			list.add(i);
		}
		
		// stream filter map collect
		list = list.stream()
				.filter(i -> i%2 ==1)
				.map(i -> i*i)
				.collect(Collectors.toList()); //Ȧ���� ������ ���� ��� list�� ����ȴ�.
		list.forEach(i -> {System.out.printf(i+"\t"); } );
		System.out.println();
		
		// stream reduce
		s = list.stream().reduce(0, Integer::sum);
		System.out.println("1~10 ������ Ȧ���� ���� ������: "+s);
	}

}
