package TestOther;

import java.math.BigInteger;

public class day4{
	public static void main(String[] args){
		//BigInteger的概述
		//可以让超过Integer范围内的数据进行运算
		int a =Integer.MAX_VALUE;
		int b =Integer.MAX_VALUE;
		int c=a+b;
		System.out.println(c);
		//构造方法
		//public BigInteger(String val)
		BigInteger bigInteger=new BigInteger("2147483647");
		BigInteger bigInteger2=new  BigInteger("2147483647");

		//成员方法
		//public BigInteger add(BigInteger val)
		bigInteger.add(bigInteger2);//加运算
		//public BigInteger subtract(BigInteger val)
		//减运算
		//public BigInteger multiply(BigInteger val)
		//乘运算
		//public BigInteger divide(BigInteger val)
		//除运算
		//public BigInteger[] divideAndRemainder(BigInteger val)
		//求模

	}
}
