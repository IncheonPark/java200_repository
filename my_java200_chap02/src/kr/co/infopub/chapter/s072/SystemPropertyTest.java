//System���� ȯ�溯�� Ȯ���ϱ�

package kr.co.infopub.chapter.s072;

import java.util.Iterator;
import java.util.Map;

public class SystemPropertyTest {
	
	public static void main(String[] args) {
		long nanotime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			System.out.print("");
		}
		long nanotime2 =System.nanoTime(); // 10^-9 nano java5 �߰�
		System.out.println(nanotime2-nanotime); // 1/1,000,000,000��
		System.out.println(System.getenv("JAVA_HOME")); // ȯ�� ����
		// ��� env ���ϱ�
		Map<String, String> map = System.getenv(); // ȯ�� ����
		Iterator<String> iter = map.keySet().iterator(); // Map���� Ű ���
		int j = 0;
		while(iter.hasNext()) {
			String keys = iter.next();
			System.out.println((++j+" ") +keys+" : "+map.get(keys));
		}
		
	}

}
