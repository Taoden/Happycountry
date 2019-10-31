package TestStringBuffer;

import java.util.Scanner;

public class day8{
	public static void main(String[] args){
		//反转
		//键盘输入
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();

		//反转
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		System.out.println(sb);

	}
}
