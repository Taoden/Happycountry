package Testaggregate;

import java.util.HashSet;
import java.util.Set;

public class day31{
	public static void main(String[] args){
		//HashSet存储自定义对象保证元素唯一性
		//* 需求：保证元素唯一性
		//		 * 思路:需要重写hashCode()和equals()方法
		Set<String> set1=new HashSet<String>();
		set1.add(null);
		set1.add("a");
		set1.add("a");
		set1.add("b");
		System.out.println(set1);
		for(String str: set1){
			System.out.println(str);
			//选择一个变量，右键rename，改变类中所有的这个变量
		}
	}
}
