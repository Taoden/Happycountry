package TestScanner;

public class day6{
	public static void main(String[] args){
		//字符串的遍历
		String s="hello";

		int len=s.length();
		for(int i = 0; i <s.length() ; i++){
			System.out.println(s.charAt(i));
		}

		//数组没有length方法，只有length属性
		//String有length方法，没有length属性
	}
}
