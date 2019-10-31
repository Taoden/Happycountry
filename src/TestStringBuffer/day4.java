package TestStringBuffer;

public class day4{
	public static void main(String[] args){
		//替换和反转
		StringBuffer stringBuffer=new StringBuffer("hello  world");
		//end的计算，star+“字符串长度”
		stringBuffer.replace(1,12,"dudu");
		System.out.println(stringBuffer);

		String s="abc";
		//反转
		StringBuffer stringBuffer1=new StringBuffer(s);
		stringBuffer1.reverse();
		System.out.println(stringBuffer1);


	}
}
