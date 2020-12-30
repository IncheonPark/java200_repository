//foreach와 Lambda 형식을 이용하여 List 출력하기

package kr.co.infopub.chapter.s057;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachLambdaLotto {
	
	public static void main(String[] args) {
		List<Integer> mmlists = Arrays.asList(1,6,16,22,23,33);
		mmlists.forEach(m -> { System.out.printf(m+"\t"); } ); //람다식을 인자 안에 쓰기
		System.out.println();
		
		mmlists.forEach(m -> System.out.println("m : " + m) ); //바로 출력문 넣기
		System.out.println();
		
		Consumer<Integer> lambda = (Integer m) -> {System.out.printf(m+"\t");};
		mmlists.forEach(lambda); //Consumer객체 람다식을 인자로 넘겨주기.
		//forEach는 리스트의 모든 객체에 대해서 Consumer.accept()를 수행합니다.
		System.out.println();
		
	}
	 

}
