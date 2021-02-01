//빌보드 차트를 객체에 저장하고 출력하기

package kr.co.infopub.chapter.s084;

import kr.co.infopub.chapter.s083.Billboard;

public class BillboardMainObject {
	
	public static void main(String[] args) {
		
		Billboard b1 = new Billboard(1, "Despacito",1, "https://www.billboard.com/images/pref_images/q61808osztw.jpg", "luis fonsi");
		Billboard b2 = new Billboard(2, "Despacito",2, "https://www.billboard.com/images/pref_images/q61808osztw.jpg", "luis fonsi");
		Billboard b3 = new Billboard(3, "Despacito",3, "https://www.billboard.com/images/pref_images/q61808osztw.jpg", "luis fonsi");
		showAbout(b1);
		showAbout(b2);
		showAbout(b3);
		
		Billboard[] b = new Billboard[3];
		b[0] = b1;
		b[1] = b2;
		b[2] = b3;
		showAbout(b[0], b[2]);
		showAbout(b);
		
	}
	
	public static void showAbout(Billboard bb ) {
		System.out.println("1----------------");
		String sf = String.format("%d, %s, %d, %s, %s", bb.getRank(),bb.getSong(),bb.getLastweek(),bb.getImagesrc(),bb.getArtist());
		System.out.println(sf);
	}
	
	public static void showAbout(Billboard ... b) { // 가변 인수
		System.out.println("2----------------");
		for (Billboard bill : b) {
			showAbout(bill);
		}
	}
	
	//clone commit check

}
