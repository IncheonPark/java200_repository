// switch~case로 환율 구하기

package kr.co.infopub.chapter.s040;

public class SwitchStringCondition {
	
	public static double toMoney(String c) {
		
		double tot = 0.0;
		switch(c) {
		case "USD" : tot = 1126.5; break;
		case "JPY" : tot = 110.6; break;
		case "CNY" : tot = 10.5; break;
		default : tot =1; break;
		}
		return tot;
		
	}
	
	public static void main(String[] args) {
		String money = "USD";
		double result = toMoney(money);
		
		System.out.printf("%s => %.2f\n",money,result); //result를 소숫점 2자리 까지 출력
		System.out.printf("%s => %2$.2f\n",money,result); //2번쨰 요소를 소숫점 2자리 까지 출력
		System.out.printf("%s => %f \n",money,result);
		
		
		
	}

}
