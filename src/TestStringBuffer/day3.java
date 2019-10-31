package TestStringBuffer;

public class day3{
	public static void main(String[] args){
		//删除功能
		StringBuffer stringBuffer=new StringBuffer("hello  world");

		//删除指定位置的字符
		System.out.println(stringBuffer.deleteCharAt(1));

		//删除指定开始和结束的位置
		System.out.println(stringBuffer.delete(1, 3));
		//不包括3

	}
}
