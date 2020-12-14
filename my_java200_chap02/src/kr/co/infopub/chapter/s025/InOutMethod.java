// 키보드로 입력받아 콘솔에 출력하기

package kr.co.infopub.chapter.s025;

import java.util.Scanner;

public class InOutMethod {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int choice = scan.nextInt();
		System.out.println(choice);
		
		System.out.println("실수를 입력하세요.");
		double rchoice = scan.nextDouble();
		System.out.println(rchoice);
		
		System.out.println("문자열을 입력하세요.");
		String schoice = scan.next();
		System.out.println(schoice);
		
	}

}
