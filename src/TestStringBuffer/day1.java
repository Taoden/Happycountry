package TestStringBuffer;

public class day1{
	public static void main(String[] args){
		//字符序列——》字符数组
		//!
		StringBuffer stringBuffer=new StringBuffer();
		String s;
		System.out.println(stringBuffer.capacity());//初始容量
		System.out.println(stringBuffer.length());//字符长度
		StringBuffer stringBuffer2=new StringBuffer(34);
		System.out.println(stringBuffer2.capacity());
		StringBuffer stringBuffer3=new StringBuffer("sb,ahshdjasd");
		System.out.println(stringBuffer3.capacity());//12+16
		System.out.println(stringBuffer3);
	}
}
