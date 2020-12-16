// 1, 2차원 배열로 위도, 경도 표현하기

package kr.co.infopub.chapter.s032;

public class GeoPoint {

	public static void main(String[] args) {
		
		// 실수 변수
		double latitude1 = 37.52;
		double longitude1 = 127.00; //서울
		
		double latitude2 = 35.13;
		double longitude2 = 129.04; //부산
		
		System.out.println(latitude1 + "\t" + longitude1 );
		
		// 실수 1차원 배열
		double [] latlong1 = {latitude1, longitude1};
		double [] latlong2 = {latitude2, longitude2};
		System.out.println(latlong1[0] + " \t" + latlong1[1]);
		
		// 실수 2차원 배열
		double [][] latlong = { {latitude1, longitude1}, {latitude2, longitude2} };
		System.out.println( latlong[0][0] + "\t" + latlong[0][1] );

	}

}
