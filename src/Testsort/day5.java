package Testsort;

import java.util.Arrays;

public class day5{
	public static void main(String[] args){
		//成员方法
		//public static String toString(int[] a)
		//public static void sort(int[] a)
		//public static int binarySearch(int[] a,int key)
		int [] arr={1,2,3,12,23};
		//toString方法
		//Arrays.toString(arr);
		//sort排序
		//Arrays.sort(arr);
		//binarySearch,分查找
		//找不到元素，用负数表示，表示你应该放在的位置。
	int index=	Arrays.binarySearch(arr, 1);
		System.out.println(index);

	}
}
