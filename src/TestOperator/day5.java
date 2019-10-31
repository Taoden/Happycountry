package TestOperator;

import java.util.Scanner;

public class day5{
	public static void main(String[] args){
		//键盘录入两个数字，并对这两个数字求和，输出结果
		//键盘录入两个数字，获取这两个数字中的最大值
		//键盘录入两个数字，比较这两个数字是否相等
		//键盘录入三个数字，获取这三个数字中的最大值
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int sum =a+b;
		System.out.println("求和"+sum);
		int max=(a>b)?a:b;
		System.out.println(max);
		boolean isequal=(a==b)?true:false;
		System.out.println(isequal);
		int Max=(a>b)?a:b;
		Max=(Max>c)?Max:c;
		System.out.println(Max);
	}


}
