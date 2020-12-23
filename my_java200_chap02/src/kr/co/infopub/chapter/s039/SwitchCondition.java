// switch~case로 카드 값 구하기

package kr.co.infopub.chapter.s039;

public class SwitchCondition {
	
	public static int toNum(char c) {
		int tot=0;
		switch(c) {
		case 'A' : tot=1; break;
		case 'T' : tot=10; break;
		case 'J' : tot=11; break;
		case 'Q' : tot=12; break;
		case 'K' : tot=13; break;
		default : tot=c-'0'; break; // '9'를 9로 변환하는 방법은 '9'-'0'로 57-48=9가 된다.
		}
		return tot;
	}
	
	public static void main(String[] args) {
		char c = '8';
		int result = toNum(c);
		System.out.printf("%c => %d\n",c,result);
	}
	
}
