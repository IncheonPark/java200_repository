//���ڿ��� �Ǽ��� ��ȯ�ϱ�
package kr.co.infopub.chapter.s018;

public class JavaTypeConversion {
	
	public static void main(String[] args) {
		String slat = "37.52127220511242    ";
		
		// ���� ���� �� double�� Ÿ�� ��ȯ
		double latitude = Double.parseDouble(slat.trim());
		System.out.println(latitude);
	}

}
