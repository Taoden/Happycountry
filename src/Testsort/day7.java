package Testsort;

public class day7{
	public static void main(String[] args){
		//String类型和int类型的相互转换
		//int 转 String
		int a=120;
		//1.和""进行拼接
		 String s1=a+"";
		//2.public static String valueOf(int i) （String类方法）
		String s2=String.valueOf(a);
		//3.int -- Integer -- String(Integer类的toString方法())
		Integer integer=new Integer(a);
		String s=integer.toString();
		//4.public static String toString(int i)(Integer类的方法)
			String s3=Integer.toString(a);
		//
		//String 转 int
		String s4="520";
		//String -- Integer – int
		Integer integer1=new Integer(s4);
		int i = integer1.intValue();

		//public static int parseInt(String s)
		Integer.parseInt(s4);
	}
}
