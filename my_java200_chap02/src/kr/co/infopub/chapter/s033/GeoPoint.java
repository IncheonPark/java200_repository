// ��ü�� �̿��Ͽ� ����, �浵 ǥ���ϱ�

package kr.co.infopub.chapter.s033;

public class GeoPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double latitude1 = 37.52;
		double longitude1 = 127.00; //����
		double latitude2 = 35.13;
		double longitude2 = 129.04; //�λ�
		
		// ����, �浵 ��ü
		Geo geo1 = new Geo();
		geo1.latitude = latitude1;
		geo1.longitude = longitude1;
		System.out.println(geo1.latitude + " \t " + geo1.longitude); //���� ��ü geo1�ٷ� ���
		
		Geo geo2 = new Geo();
		geo2.latitude = latitude2;
		geo2.longitude = longitude2;
		
		Geo geo = geo2;
		System.out.println(geo.latitude + "\t" + geo.longitude); //�λ� ��ü geo2�� �ּҸ� geo�� �Է� �� geo ���

	}

}
