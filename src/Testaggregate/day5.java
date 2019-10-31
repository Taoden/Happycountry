package Testaggregate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class day5{
	public static void main(String[] args){
		 //集合的遍历之迭代器遍历
		Collection collection=new ArrayList();
		collection.add("a");

		Iterator iterator=collection.iterator();
		System.out.println(iterator.getClass());//是ArrayList的内部类

		while(iterator.hasNext()){//判断是否有元素
			Object next = iterator.next();//获取下一个元素
			System.out.println(next);
		}
		Collection collection1 =new ArrayList();

	}
}
