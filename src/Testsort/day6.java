package Testsort;

public class day6{
	public static void main(String[] args){
		//为什么会有基本类型包装类
		//将基本数据类型封装成对象，这样的好处在于可以在对象中定义更多方法操作该数据。
		int a=100;//把a转成字符串
		Integer integer =new Integer(a);
		String s=integer.toString();
		System.out.println(s);

		//Integer的静态属性
		System.out.println(Integer.MAX_VALUE);
		//Integer的其他方法
		//把int转成2进制的字符串
		System.out.println(Integer.toBinaryString(8));//2进制
		System.out.println(Integer.toOctalString(9));//8进制
		System.out.println(Integer.toHexString(11));//16进制

	}
}
