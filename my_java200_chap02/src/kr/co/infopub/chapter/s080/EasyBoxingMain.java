// �ڽ�, ��ڽ����� �⺻ Ÿ���� ���� Ÿ������ ��ȯ�ϱ�

package kr.co.infopub.chapter.s080;

import java.util.ArrayList;

public class EasyBoxingMain {
	
	public static void main(String[] args) {
		
		int intNum1 = 123;
		long longNum1 = 345L;
		double doubleNum = 123.123;
		Integer intWrap1 = intNum1; // new Integer(intNum1);
		Long longWrap1 = longNum1; // new Long(longNum1);
		Double doubleWrap1 = doubleNum; // new Double(doubleNum);
		double dd = doubleWrap1;
		
		// �⺻ Ÿ�� <--> Wrapper�� ĳ���� ���� ��� ����
		Integer intWrap2 = intNum1; //Boxing
		intNum1 = intWrap2; // UnBoxing;
		
		System.out.println(intNum1);
		
		ArrayList<Integer> lists = new ArrayList<>();
		lists.add(new Integer(3));
		lists.add(5);
		int a = lists.get(0);
		System.out.println(a);
		int c = lists.get(1);
		System.out.println(c);
		
		//����
		int b = Integer.parseInt("123"); //������ ����Ÿ���� int�� ��ȯ.
		System.out.println(b);
		
	}

}
