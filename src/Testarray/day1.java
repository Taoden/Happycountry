package Testarray;

import java.util.Scanner;

public class day1{
	public static void main(String[] args){
		/*
		??????????????????
		数组获取最值(获取数组中的最大值最小值)
		数组元素反转(就是把元素对调)
		数组查表法(根据键盘录入索引,查找对应星期)
		如图，查找a数组中的位置*/
		int a [] =new int []{10,39,22,44,55};
		/*int max=a[0];
		for(int i = 0; i <a.length ; i++){
			if(max < a[i]){
				max=a[i];
			}
		}
		System.out.println(max);*/

		for(int i = 0; i <a.length/2 ; i++){
			int left=i;//左边索引
			int right=a.length-i-1;//右边索引

			int temp=a[left];
			a[left]=a[right];
			a[right]=temp;
		}
		for(int i = 0; i <a.length ; i++){
			System.out.println(a[i]);
		}

		Scanner s=new Scanner(System.in);
		System.out.println("请输入对应的星期范围在1-7");
		int week=s.nextInt();
		System.out.println("星期"+getWeek(week));
	}

	//数组第0个元素为null，这样1就对应的一，以此类推

	public static char getWeek(int week) {
		char[] arr = {' ','一','二','三','四','五','六','日'};//定义了一张星期表
		return arr[week];//通过索引获取表中的元素
	}
}
