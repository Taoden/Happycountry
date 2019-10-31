package TestScanner;

public class day5{
	public static void main(String[] args){
		//int length():获取字符串的长度并不是字节的长度
		String s1="520中";
		System.out.println(s1.length());
		//char charAt(int index):获取指定索引位置的字符

		//int indexOf(int ch):获取指定字符在此字符串第一次出现处的索引,0开始
		String s2="education";
		System.out.println(s2.indexOf("a"));
		//int indexOf(String str)：返回指定字符串在此字符串中第一次出现处的索引
		String s4="Hellow ";
		System.out.println(s4.indexOf("ll"));//-1指定的字符串没有出现过
		//int indexOf(int ch,int fromIndex):返回指定字符在此字符串中指定位置后第一次出现处的索引
		String s5 ="acasdasd";
		System.out.println(s5.indexOf("a",6));
		//int indexOf(String str,int fromIndex):返回指定字符串在此字符串中指定位置后第一次出现处的索引

		//lastIndexOf() 最后出现的位置

		//String substring(int start):从指定位置开始截取字符串，默认到未尾

		//String substring(int start,int end):从指定位置开始到指定位置结束截取字符图
		String result="单身贵族||白领||高帅富||土豪||IT";
		String[] split = result.split("\\|\\|");
		for(String string:split){
			System.out.println(string);
		}
	}
}
