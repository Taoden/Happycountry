package TestScanner;

import java.util.Scanner;

public class day1{
	public static void main(String[] args){

		System.err.println();
		System.out.println();
		/*Scanner的成员方法(举例两种)
		hasNextXX 判断是否还有下一个输入项，其中Xxx可以是Int,Double等，如果需要判断是否包住字符串，则可以省略Xxx
		nextXX 获取下一个输入项，Xxx的含义和上个方法的Xxx相同*/
		Scanner s=new Scanner(System.in);
		//判断你输入的是否是数字
	/*	if(s.hasNextInt()){
			int x=s.nextInt();
			System.out.println(x);
		}else {
			System.out.println(".....");
		}
		//判断你输入的是否是字符串
		if(s.hasNext()){
			String x=s.nextLine();
			System.out.println(x);
		}else {
			System.out.println(".....");
		}
 */
		//获取两个int值
		//获取两个字符串值
		//先获取一个Int再获取一个字符串
		int a =s.nextInt();
		String b =s.nextLine();//字符串
		test1();

	}

	private static void test1(){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();//
		String a1=s.nextLine();//回车换行会结束
		//写相同类型，不同类型的只能实现其中一个。

	}
}
