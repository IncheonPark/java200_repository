//���� ���� �޼��� ����ϱ�

package kr.co.infopub.chapter.s073;

public class MathTestMain {
	
	public static void main(String[] args) {
		
		// constant ���
		System.out.println("Math.E : " + Math.E);
		System.out.println("Math.PI : " + Math.PI);
		
		//method
		System.out.println("Math.abs(-5) ���밪 : " + Math.abs(-5));
		System.out.println("Math.ceil(4.34) �ø� : " +Math.ceil(4.34));
		System.out.println("Math.round(4.5) �ݿø� : "+Math.round(4.5)); //0.5���� �ݿø��� �ȴ�.
		System.out.println("Math.floor(4.34) ���� : "+Math.floor(4.34));
		System.out.println("Math.rint(4.50) �ݿø� : "+Math.rint(4.50)); //0.51���� �ݿø��� �ȴ�.
		System.out.println("Math.rint(4.51) �ݿø� : "+Math.rint(4.51));
		System.out.println("Math.max(45,78) �ִ밪 : "+Math.max(45,78)); 
		System.out.println("Math.min(45,78) �ּҰ� : "+Math.min(45,78)); 
		System.out.println("Math.pow(2,4) 2�� 4��: "+Math.pow(2,4));
		System.out.println("Math.log(30) : "+Math.log(30)); //�ؼ��� Math.E�� �α�
		System.out.println("Math.exp(3) : "+Math.exp(3)); //exp(num)�� pow(Math.E, num)�� �ڿ� ������ �¼��̴�.
		System.out.println("Math.sqrt(10) : "+Math.sqrt(10)); //���� �������� ���Ѵ�.
		System.out.println("Math.sin(Math.toRadians(90)) : " +Math.sin(Math.toRadians(90)));
		System.out.println("Math.cos(Math.toRadians(180) : " +Math.cos(Math.toRadians(180)));
		
		
		//Random
		double dRan = Math.random(); // 0 <= dRan < 1 �Ǽ� (0�� 1������ �Ǽ�)
		System.out.println("Math.random() => " +dRan);
		System.out.println("Math.random()*100 => " + dRan*100);
		
		
	}

}
