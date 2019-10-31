package Testaggregate;

import java.util.Date;

public class day20{
	public static void main(String[] args){
//泛型的由来:解决类型转换问题


//早期的Object类型可以接收任意的对象类型
//但是在实际的使用中，会有类型转换的问题。也就存在这隐患
//所以Java提供了泛型来解决这个安全问题
		Object o="asda";
		Object o1=new student();
		Object o2 =new Date();

		String s1= (String) o2;
	}
}
