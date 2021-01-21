 //2���� �迭 �����ϱ�

package kr.co.infopub.chapter.s079;

public class ArrayTwoInit {
	
	public static void main(String[] args) {
		
		System.out.println("2���� �迭 ���1");
		int[][] a = new int[4][3];
		inputValue(a);
		println(a);
		
		System.out.println("2���� �迭 ���2 �������");
		int[][] b = new int[3][]; //3X? �Ľ�Į�� �ﰢ���� ���
		b[0] = new int[4];
		b[1] = new int[5];
		b[2] = new int[3];
		inputValue(b);
		println(b);
		
		System.out.println("2���� �迭 ���3  ���� �� �ʱ�ȭ");
		int[][] c = new int[][] {{1,2,3},{2,3,4,1},{3,4}};
		println(c);
		inputValue(c);
		println(c);
		
		System.out.println("2���� �迭 ���4  new�� ���� �ʰ� �ʱ�ȭ");
		int[][] d = {{1,2,3},{2,3,4},{3,4,5}};
		println(d);
		inputValue(d);
		println(d);
		
		System.out.println("2���� �迭 ���� 1 ");
		int[][] copy = new int[d.length][d[0].length];
		println(copy);
		copy(d,copy);
		
		
		
		System.out.println("2���� �迭 ���� 2 ������� �迭�� ����");
		int[][] copy2 = new int[c.length][]; //2�� �迭�� �������� ����
		
		for(int i = 0; i < c.length; i++) { //������ ���̰� �ٸ� 2�� �迭 ���̸� ����
			
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
				
				array[i][j] = (int)(Math.random()*10); //�迭 ���� �� �ڵ����� ������ �Է��� ������ �ߴ�.
				
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
