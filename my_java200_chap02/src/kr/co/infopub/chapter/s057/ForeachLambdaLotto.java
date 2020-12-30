//foreach�� Lambda ������ �̿��Ͽ� List ����ϱ�

package kr.co.infopub.chapter.s057;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachLambdaLotto {
	
	public static void main(String[] args) {
		List<Integer> mmlists = Arrays.asList(1,6,16,22,23,33);
		mmlists.forEach(m -> { System.out.printf(m+"\t"); } ); //���ٽ��� ���� �ȿ� ����
		System.out.println();
		
		mmlists.forEach(m -> System.out.println("m : " + m) ); //�ٷ� ��¹� �ֱ�
		System.out.println();
		
		Consumer<Integer> lambda = (Integer m) -> {System.out.printf(m+"\t");};
		mmlists.forEach(lambda); //Consumer��ü ���ٽ��� ���ڷ� �Ѱ��ֱ�.
		//forEach�� ����Ʈ�� ��� ��ü�� ���ؼ� Consumer.accept()�� �����մϴ�.
		System.out.println();
		
	}
	 

}
