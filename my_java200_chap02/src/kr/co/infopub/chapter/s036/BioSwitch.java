// 입력받은 정수 값에 따라 신체, 감정, 지성 값 출력하기

package kr.co.infopub.chapter.s036;

public class BioSwitch {
	
	public static String textInfor(int index, double value) {
		
		String result = "";
		switch(index) {
		case 23 : result = "신체 지수: "; break;
		case 28 : result = "감정 지수: "; break;
		case 33 : result = "지성 지수: "; break;
		
		}
		
		return result + (value*100);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 23;
		double value = 0.86;
		String st = textInfor(index, value);
		System.out.println(st);
		
		System.out.println(textInfor(index, value));

	}

}
