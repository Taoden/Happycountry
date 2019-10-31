package Testaggregate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class day24{
	public static void main(String[] args){
		//增强for循环
		//增强for概述:简化数组和Collection集合的遍历
		//格式：
		//for(元素数据类型 变量 : 数组或者Collection集合) {
		//	使用变量即可，该变量就是元素
		//}

		//简化遍历
		//基本数据类型数组
		int [] arr={12,323,2,3};
		for(int i = 0; i <arr.length ; i++){
			int num =arr[i];
			System.out.println(num);
		}

		for(int num: arr){
			System.out.println(num);
		}
		//2.集合
		List<String> list=new ArrayList<String>();
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			System.out.println(next);
		}
		//遍历元素
		int i=0;
		for(String next:list){
			i++;
			System.out.println("第"+i+next);
		}

	}
}
