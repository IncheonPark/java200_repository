// 객체를 이용하여 위도, 경도 표현하기

package kr.co.infopub.chapter.s033;

public class GeoPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double latitude1 = 37.52;
		double longitude1 = 127.00; //서울
		double latitude2 = 35.13;
		double longitude2 = 129.04; //부산
		
		// 위도, 경도 객체
		Geo geo1 = new Geo();
		geo1.latitude = latitude1;
		geo1.longitude = longitude1;
		System.out.println(geo1.latitude + " \t " + geo1.longitude); //서울 객체 geo1바로 출력
		
		Geo geo2 = new Geo();
		geo2.latitude = latitude2;
		geo2.longitude = longitude2;
		
		Geo geo = geo2;
		System.out.println(geo.latitude + "\t" + geo.longitude); //부산 객체 geo2의 주소를 geo에 입력 후 geo 출력

	}

}
