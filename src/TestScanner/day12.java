package TestScanner;

import java.util.Scanner;

public class day12{
	public static void main(String[] args){
		//abc->cba
		//获取用户输入
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		//反转输出到控制器
		//正常遍历
		/*for(int i = 0; i <str.length() ; i++){
			System.out.print(str.charAt(i));
		}*/
		System.out.println(str);
		//反向打印
		for(int i =str.length()-1 ;i>=0; i--){
			System.out.print(str.charAt(i));
		}

	}
}
