//System으로 환경변수 확인하기

package kr.co.infopub.chapter.s072;

import java.util.Iterator;
import java.util.Map;

public class SystemPropertyTest {
	
	public static void main(String[] args) {
		long nanotime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			System.out.print("");
		}
		long nanotime2 =System.nanoTime(); // 10^-9 nano java5 추가
		System.out.println(nanotime2-nanotime); // 1/1,000,000,000초
		System.out.println(System.getenv("JAVA_HOME")); // 환경 변수
		// 모든 env 구하기
		Map<String, String> map = System.getenv(); // 환경 변수
		Iterator<String> iter = map.keySet().iterator(); // Map에서 키 얻기
		int j = 0;
		while(iter.hasNext()) {
			String keys = iter.next();
			System.out.println((++j+" ") +keys+" : "+map.get(keys));
		}
		
	}

}
