package Testspeech;

import java.math.BigDecimal;

public class TestBigDecimal{
	public static void main(String[] args){
		//可以减少误差
		//System.out.println(2.0 - 1.1);
		BigDecimal bigDecimal =new BigDecimal("100");
		BigDecimal bigDecimal2 =new BigDecimal("30");
		System.out.println(bigDecimal.subtract(bigDecimal2));
		System.out.println(bigDecimal.add(bigDecimal2));
		System.out.println(bigDecimal.multiply(bigDecimal2));
		System.out.println(bigDecimal2.divide(bigDecimal));


	}
}
