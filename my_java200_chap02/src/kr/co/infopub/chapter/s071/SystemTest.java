//System으로 연산 소요 시간 구하기

package kr.co.infopub.chapter.s071;

import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

public class SystemTest {
	
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		System.out.println(time1); //1970.1.1부터
		for(int i=0; i<100000; i++) {
			System.out.print("");
		}
		long time2 = System.currentTimeMillis(); //milli는 1/1000초
		System.out.println(time2-time1);
		System.out.println(time2/1000/60/60/24/365+" 년"); // 1000밀리초/60초/60분/24시간/365일
		
		Properties prop = System.getProperties();
		//원하는 System property
		System.out.println(prop.getProperty("java.vm.version"));
		System.out.println(prop.getProperty("file.separator"));
		
		System.out.println(new Date(System.currentTimeMillis())); //오늘
		// ----- java.util.*에서 -----
		
		// 모든 System property
		Enumeration<Object> en = prop.keys();
		int i =0;
		while(en.hasMoreElements()) {
			String keys = (String)en.nextElement();
			System.out.println((++i+" ")+keys+" : "+prop.getProperty(keys));
		}
		
	}

}
