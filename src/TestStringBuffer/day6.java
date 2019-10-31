package TestStringBuffer;

public class day6{
	public static void main(String[] args){
		//StringBuffer和String的相互转换

		//String-》StringBuffer
		//构造方法
		String s="afd";
		StringBuffer s1=new StringBuffer(s);
		System.out.println(s1);
		//append()方法
		StringBuffer s2=new StringBuffer();
		s2.append(s);
		System.out.println(s2);

		//StringBuffer-》String
		StringBuffer s3=new StringBuffer("mvc");
		//通过构造方法
		String s4=new String(s3);
		//通过toString方法
		String s5=s3.toString();
		//通过subString(start)
		//从0的位置截取到末尾
		String s6=s3.substring(0);

	}
}
