//문자열을 실수로 변환하기
package kr.co.infopub.chapter.s018;

public class JavaTypeConversion {
	
	public static void main(String[] args) {
		String slat = "37.52127220511242    ";
		
		// 공백 제거 후 double로 타입 변환
		double latitude = Double.parseDouble(slat.trim());
		System.out.println(latitude);
	}

}
