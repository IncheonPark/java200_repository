// �����ڸ� �̿뤾�ƿ� ���̿����� �� ���ϱ�

package kr.co.infopub.chapter.s027;

public class BioCalendar {
	
	public static final int PHYSICAL = 23; //���(������ ����), ������� ���� �Ұ�
	
	public static void main(String[] args) {
		
		int index = PHYSICAL;
		int days = 1200;
		
		double vals = (days % index) * 2 * Math.PI / index ;
		System.out.println(vals);
		System.out.println(Math.toDegrees(vals) + " ���Դϴ�.");
		
	}

}
