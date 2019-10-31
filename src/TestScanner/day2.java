package TestScanner;

public class day2{
	public static void main(String[] args){
		//String这个类被final修饰，不能被继承，没有子类
		String s="avc";
		//等效于
		char data[] ={'a','v','c'};
		String s1=new String(data);
		System.out.println(s);
		System.out.println(s1);
		s="bcd";//只是在堆中有开辟了一个新的"bcd",原来的"avc"不变。

	}
}
