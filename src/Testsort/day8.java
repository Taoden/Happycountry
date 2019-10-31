package Testsort;

public class day8{
	public static void main(String[] args){
		//JDK1.5的新特性
		//自动装箱：把基本类型转换为包装类类型
		Integer integer=10;//内部会自动new Integer(10)


		//自动拆箱：把包装类类型转换为基本类型
		Integer integer1=new Integer(120);
		int a=integer;//内部会调用integer1.intValue();
	}
}
