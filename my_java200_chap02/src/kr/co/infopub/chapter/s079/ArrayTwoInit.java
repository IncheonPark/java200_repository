 //2차원 배열 이해하기

package kr.co.infopub.chapter.s079;

public class ArrayTwoInit {
	
	public static void main(String[] args) {
		
		System.out.println("2차원 배열 방법1");
		int[][] a = new int[4][3];
		inputValue(a);
		println(a);
		
		System.out.println("2차원 배열 방법2 지그재그");
		int[][] b = new int[3][]; //3X? 파스칼의 삼각형에 사용
		b[0] = new int[4];
		b[1] = new int[5];
		b[2] = new int[3];
		inputValue(b);
		println(b);
		
		System.out.println("2차원 배열 방법3  선언 시 초기화");
		int[][] c = new int[][] {{1,2,3},{2,3,4,1},{3,4}};
		println(c);
		inputValue(c);
		println(c);
		
		System.out.println("2차원 배열 방법4  new를 쓰지 않고 초기화");
		int[][] d = {{1,2,3},{2,3,4},{3,4,5}};
		println(d);
		inputValue(d);
		println(d);
		
		System.out.println("2차원 배열 복사 1 ");
		int[][] copy = new int[d.length][d[0].length];
		println(copy);
		copy(d,copy);
		
		
		
		System.out.println("2차원 배열 복사 2 지그재그 배열의 복사");
		int[][] copy2 = new int[c.length][]; //2차 배열을 공백으로 설정
		
		for(int i = 0; i < c.length; i++) { //각각의 길이가 다른 2차 배열 길이를 설정
			
			copy2[i] = new int[c[i].length];
			
		}
		println(copy2);
		copy(c, copy2);
		
	}
	
	public static void copy(int[][] from, int[][] to) {
		for(int i = 0; i < from.length; i++) {
			System.arraycopy(from[i],0,to[i],0,to[i].length);
		}
		println(to);
	}
	
	public static void inputValue(int [][] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j =0; j < array[i].length; j++) {
				
				array[i][j] = (int)(Math.random()*10); //배열 생성 시 자동으로 난수를 입력해 보도록 했다.
				
			}
			
		}
		
	}
	
	public static void println(int [][] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				
				System.out.print("["+array[i][j]+"]");
				
			}
			System.out.println();
		}
		System.out.println();
	}

}
