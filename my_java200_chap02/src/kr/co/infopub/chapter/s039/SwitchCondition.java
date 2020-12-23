// switch~case�� ī�� �� ���ϱ�

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
		default : tot=c-'0'; break; // '9'�� 9�� ��ȯ�ϴ� ����� '9'-'0'�� 57-48=9�� �ȴ�.
		}
		return tot;
	}
	
	public static void main(String[] args) {
		char c = '8';
		int result = toNum(c);
		System.out.printf("%c => %d\n",c,result);
	}
	
}
