package kr.co.infopub.chapter.s083;

public class BillboardMain2 {
	
	public static void main(String[] args) {
		
		// Data�� ��ü�� ����
		Billboard b1 = new Billboard(1, "Despacito",1, "https://www.billboard.com/images/pref_images/q61808osztw.jpg", "luis fonsi");
		
		//��ü ���
		showAbout(b1);
		
		//��ü�� ����
		Billboard b = b1; //�ּ� ����
		showAbout(b); //��ü ������ ���
		
	}
	
	public static void showAbout(Billboard bb) { //��ü�� �����Ͽ� ����ϴ� �޼���
		String sf = String.format("%d, %s, %d, %s, %s", 
				bb.getRank(), bb.getSong(), bb.getLastweek(), bb.getImagesrc(), bb.getArtist());
		System.out.println(sf);
	}

}