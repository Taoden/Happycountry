package Testaggregate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class day6{
	public static void main(String[] args){
		//List集合的特有功能概述
		//void add(int index,E element)
		//E remove(int index)
		//E get(int index)
		//E set(int index,E element)

		//Collection collection =new ArrayList();
		List list =new ArrayList();
		list.add("e");
		list.add("a");
		list.add("b");
		list.add(1,"s");
		System.out.println(list);
		//删除指定索引的元素
		list.remove(1);
		//获取指定索引的元素
		list.get(2);
		//替换指定索引的元素
		list.set(2,"22");
	}
}
