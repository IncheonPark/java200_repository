// 1, 2���� �迭�� ����, �浵 ǥ���ϱ�

package kr.co.infopub.chapter.s032;

public class GeoPoint {

	public static void main(String[] args) {
		
		// �Ǽ� ����
		double latitude1 = 37.52;
		double longitude1 = 127.00; //����
		
		double latitude2 = 35.13;
		double longitude2 = 129.04; //�λ�
		
		System.out.println(latitude1 + "\t" + longitude1 );
		
		// �Ǽ� 1���� �迭
		double [] latlong1 = {latitude1, longitude1};
		double [] latlong2 = {latitude2, longitude2};
		System.out.println(latlong1[0] + " \t" + latlong1[1]);
		
		// �Ǽ� 2���� �迭
		double [][] latlong = { {latitude1, longitude1}, {latitude2, longitude2} };
		System.out.println( latlong[0][0] + "\t" + latlong[0][1] );

	}

}
