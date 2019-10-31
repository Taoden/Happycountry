package Testaggregate;

import java.util.ArrayList;
import java.util.Collection;

public class day2{
	public static void main(String[] args){
		//基本功能方法
		//boolean add(E e)
		//boolean remove(Object o)
		//void clear()
		//boolean contains(Object o)
		//boolean isEmpty()
		//int size()
		//创建一个集合对象
		Collection collection =new ArrayList();//接口指向实现类

		//添加元素
		collection.add("Java");

		//移除元素
		collection.remove("java");
		//清除所有元素
		collection.clear();
		//包含元素
		collection.contains("H5");
		//判断这个元素是否为空





	}
}
