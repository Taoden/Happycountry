package TestScanner;

public class day3{
	public static void main(String[] args){
		//public String()
		String s1=new String();
		//String s1="";
		//public String(byte[] bytes):把字节数组转成字符串
		byte []  bytes ={98,97,99,100,101};
		String s2=new String(bytes);
		//public String(byte[] bytes,int index,int length):把字节数组的一部份转成字符串
		String s3=new String(bytes,0,3);
		//public String(char[] value,int index,int count):把字符数组的一部份转成字符串
		char [] chars ={'a','b','c','d','e'};
		String s4 =new String(chars,0,4);
		//public  String(String original) ：初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本。
		//内存里面有两份hello
		String s5 =new String("hello");//两个对象，堆中有一个副本，常量中有有一个
		System.out.println(s5);

	//内存地址，只要内容相同，地址就相同.
		//equals比较内容，==比较地址
		String a1="a"+"b";//.class->"abc"，都是常量
		String a2="ab";
		String a3=a2+"c";//变量加常量,地址不同
		System.out.println(a1 == a2);//true
		System.out.println(a1.equals(a2));//true

	}
}
