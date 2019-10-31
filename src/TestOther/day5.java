package TestOther;

import java.math.BigDecimal;
import java.math.BigInteger;

public class day5{
	public static void main(String[] args){
		//这个类可以减少误差


		//BigDecimal的概述
		//由于在运算的时候，float类型和double很容易丢失精度。所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
		//构造方法
		//public BigDecimal(String val)
		//成员方法
		//public BigDecimal add(BigDecimal augend)
		//public BigDecimal subtract(BigDecimal subtrahend)
		//public BigDecimal multiply(BigDecimal multiplicand)


		//public BigDecimal divide(BigDecimal divisor)
		//计算的两个数要被除尽，否则会报错





		System.out.println(2.0-1.1);
		BigDecimal bigDecimal =new BigDecimal("2.0");
		BigDecimal bigDecimal2 =new BigDecimal("1.1");

	}
}
