package TestStringBuffer;

public class day2{
	public static void main(String[] args){
		//public StringBuffer append(String str):
		//可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
		// public StringBuffer insert(int offset,String str):
		//在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身

		//StringBuffer  字符串缓存区
		StringBuffer stringBuffer =new StringBuffer();
		StringBuffer stringBuffer1 =stringBuffer.append("hello");
		System.out.println(stringBuffer.hashCode());
		System.out.println(stringBuffer1.hashCode());
		stringBuffer.append(" how are you");
		System.out.println(stringBuffer);//等效拼接


		stringBuffer.insert(4,"dudu");
		System.out.println(stringBuffer);
	}
}
