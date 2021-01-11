//StringBuffer로 문자열 수정, 변경, 추가하기

package kr.co.infopub.chapter.s069;

public class StringBufferMain {
	
	public static void main(String[] args) {
		//StringBuffer 생성 mutable(가변 객체)
		StringBuffer sb1 = new StringBuffer();
		
		//1  계속 붙이는 함수 append 
		sb1.append("안녕하세요 ").append("또 만나요 ").append("모두들 사랑해요, 기다려요 ");
		System.out.println(sb1.toString()+" : "+sb1.hashCode());
		
		//2 replace
		sb1.replace(0,2,"나 보기가 힘들어 ");
		System.out.println(sb1.toString()+" : "+sb1.hashCode());
		
		//3 reverse
		sb1.reverse();
		System.out.println(sb1.toString());
		
		//4 delete
		sb1.delete(10,15);
		System.out.println(sb1.toString());
		
		//5 cal by reference, shallow copy
		replaces(sb1);
		System.out.println(sb1.toString());
		
	}
	
	public static void replaces(StringBuffer sb) {
		sb.reverse();
		sb.replace(0,3,"GoGo");  // 0부터 2까지를 GoGo로
	}

}
