package TestStringBuffer;

public class day5{
	public static void main(String[] args){
		//截取功能
		String s="avc";
		s.substring(1,2);
		System.out.println(s);

		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer.append("heoasda");// 存在StringBuffer内部的一个字符数组char[] toStringCache
		System.out.println(stringBuffer);//打印一个对象，会调用内部的toString方法
		//从指定位置到结尾//返回值是String
		String substring = stringBuffer.substring(5);
		System.out.println(substring);

		String substring1 = stringBuffer.substring(0,2);
		System.out.println(substring1);






	}
}
