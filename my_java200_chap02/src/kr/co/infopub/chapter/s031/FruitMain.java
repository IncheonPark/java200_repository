// 상수의 묶음 클래스 enum 사용하기

package kr.co.infopub.chapter.s031;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FRUIT pear = FRUIT.APPLE;
		FRUIT pear2 = FRUIT.MANGO;
		System.out.println(pear);
		System.out.println(pear.name());
		System.out.println(pear.ordinal()); //선언될 떄 순서 0
		System.out.println(pear2.ordinal()); //선언될 떄 순서 2
		FRUIT [] fruits = FRUIT.values();
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		

	}

}
