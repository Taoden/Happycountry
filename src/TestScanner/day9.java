package TestScanner;

public class day9{
	public static void main(String[] args){
		//把一个字符串的首字母转成大写，其余为小写
		String  s="hEELO,HOw Are You!";
		//截取第一个字母
		String s1=s.substring(0,1);
		System.out.println(s1);
		//截取第一个字母后面的字符串
		String s2=s.substring(1);
		System.out.println(s2);
		//转大小写
		System.out.println(s1.toUpperCase());//大写
		System.out.println(s2.toLowerCase());//小写
		//进行拼接
		System.out.println(s1.toUpperCase().concat(s2.toLowerCase()));
		//链式写法
		System.out.println(s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase()));
	}

}
