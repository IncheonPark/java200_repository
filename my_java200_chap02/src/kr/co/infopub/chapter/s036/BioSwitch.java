// �Է¹��� ���� ���� ���� ��ü, ����, ���� �� ����ϱ�

package kr.co.infopub.chapter.s036;

public class BioSwitch {
	
	public static String textInfor(int index, double value) {
		
		String result = "";
		switch(index) {
		case 23 : result = "��ü ����: "; break;
		case 28 : result = "���� ����: "; break;
		case 33 : result = "���� ����: "; break;
		
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
