package TESTJAVA;

import java.math.BigInteger;

public class TEST5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger big = new BigInteger("1");
		
		for(int i=1; i<=100; i++) {
			big = big.multiply(BigInteger.valueOf(i));
			
		}
		System.out.println(big);
	}

}
