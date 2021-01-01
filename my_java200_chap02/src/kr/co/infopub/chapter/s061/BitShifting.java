//String과 char를 이용하여 10진수를 2진수로 변환하기

package kr.co.infopub.chapter.s061;

public class BitShifting {
	
	public static final int BITMASK = 1;
	public String makeBit(int value) {
		//char 배열을 String으로 만들기 위해
		char[] val = new char[32];
		for(int i=31; i>=0; i--) {
			if((value & BITMASK) == 1) {
				val[i] = '1';
			} else {
				val[i] = '0';
			}
			value = value >>> 1; //부호 무시하고 오른쪽 이동
		}
		return new String(val); //char 배열을 String으로
	}
	
	public static void main(String[] args) {
		int ival = 2345;
		int eval = -2345;
		
		BitShifting bitsh = new BitShifting();
		String vals = bitsh.makeBit(ival);
		System.out.println(vals);
		
		vals = bitsh.makeBit(eval);
		System.out.println(vals);
		
		char[] vs = vals.toCharArray();
		System.out.println(vs[0]);
	}

}
