package Testspeech;

import java.math.BigInteger;

public class TestBigInteger{
	public static void main(String[] args){
		//计算Integer的最大值
		int maxValue=Integer.MAX_VALUE;
		System.out.println(maxValue);
		System.out.println("..............");
	/*Integer integer =new Integer("2147483649");
	System.out.println("integer="+integer);
*/
		System.out.println("加法运算");
		BigInteger bigInteger =new BigInteger("10");
		BigInteger bigInteger2 =new BigInteger("20");
		System.out.println(bigInteger.add(bigInteger2));
		System.out.println("减法运算");
		System.out.println(bigInteger.subtract(bigInteger2));
		System.out.println("乘法运算");
		System.out.println(bigInteger.multiply(bigInteger2));
		System.out.println("除法运算");
		System.out.println(bigInteger.divide(bigInteger2));
		System.out.println("求模");
		BigInteger arr [] =bigInteger.divideAndRemainder(bigInteger2);
		System.out.println(arr[0]);//商
		System.out.println(arr[1]);//余数
		for(int i = 0; i <arr.length ; i++){
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
		int i=0;
		for(BigInteger num :arr){
			i++;
			System.out.println("第"+i+"个元素："+num);
		}
	}
	
}
