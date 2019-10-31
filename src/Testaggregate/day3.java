package Testaggregate;

import java.util.ArrayList;
import java.util.Collection;

public class day3{
	public static void main(String[] args){
		//集合的遍历
		//其实就是依次获取集合中的每一个元素。
		//
		//案例演示
		//把集合转成数组，可以实现集合的遍历
		//toArray()【掌握Collection的toArray()方法】
		
		//创建集合对象
		Collection collection=new ArrayList();
		//添加元素
		collection.add("apple");
		//集合的遍历
		collection.toArray();

	}
}
