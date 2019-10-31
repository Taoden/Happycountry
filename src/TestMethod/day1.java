package TestMethod;

import java.util.Scanner;

public class day1{
	public static void main(String[] args){
		//需求：根据键盘录入的行数和列数，在控制台输出星形
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();//行数
		int b=s.nextInt();//列数
		for(int i = 0; i <a ; i++){
			for(int j = 0; j <b ; j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
