package Testaggregate;

import java.util.ArrayList;
import java.util.List;

public class day11{
	public static void main(String[] args){
		List list =new ArrayList();
		list.add("a");
		list.add("a");
		System.out.println(list);
		//去除重复元素
		//1.创建新集合
		List list1=new ArrayList();

		//2.创建list集合
		for(int i = 0; i <list.size(); i++){
			//取元素
			Object o = list.get(i);
			if(!list1.contains(o)){//代表元素在新的集合中不存在
				list1.add(o);
			}
		}

	}
}
