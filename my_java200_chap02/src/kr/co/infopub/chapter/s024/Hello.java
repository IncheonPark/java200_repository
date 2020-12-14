// 메서드 선언하고 호출하기

package kr.co.infopub.chapter.s024;

public class Hello {
	
	public /*static */void showHello() {
		
		System.out.println("****************");
		System.out.println("이 프로그램은 박동우님이 만들었습니다.");
		System.out.println("****************");
		
	}
	
	public static void main(String[] args) {
		Hello showhello = new Hello(); //static 쓰기 싫으면 객체 생성후 호출한다.
		showhello.showHello();
		
	}
	

}
