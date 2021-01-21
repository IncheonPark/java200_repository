//문자열 1차원 배열 이해하기

package kr.co.infopub.chapter.s078;

public class StringArray {
	
	public static void main(String[] args) {
		
		String[] myNum = new String[] {"2011","2012","2013"};
		myNum = new String[] {"2014","2015","2016"};
		
		String[] myNum2 = {"2011","2012","2013"};
		//myNum2 = {"2014","2015","2016"}; 정적 재 초기화 불가
		myNum2 = new String[] {"2014","2015","2016"}; //동적으로 재 초기화는 가능
		
		String[] tos = new String[myNum.length];
		System.arraycopy(myNum,0,tos,0,myNum.length);
		print(tos);
		
	}
	public static void print(String[] array) {
		for (String ss : array) {
			System.out.print(ss + "\t");
		}
		System.out.println();
	}
	
}
