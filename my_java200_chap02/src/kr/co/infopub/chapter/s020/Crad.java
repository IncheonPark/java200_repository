// ���� �����ϱ�

package kr.co.infopub.chapter.s020;

// ���� ����, ����

public class Crad {
	
	public static void main(String[] args) {
		
		int kor = 90;
		int eng = 80;
		int math = 89;
		int tot=kor+eng+math; //259
		double average = tot/3.0; //���� ������ ���� 86.3333 -> 86
		System.out.printf("���� %d��, ���� %d��, ���� %d�� => \t", kor,eng,math);
		System.out.printf("���� %d��", tot);
		System.out.println(average);
		System.out.printf("��� %f��", average); //double�� �����ڴ� %f�� �Ѵ�.
		
	}

}
