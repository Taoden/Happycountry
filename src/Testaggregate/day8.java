package Testaggregate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class day8{
	//ConcurrentModificationException并发修改异常
	//默认情况下,不能一边遍历一边添加
	//使用另外一个迭代器
	public static void main(String[] args){
		List list =new ArrayList();
		list.add("a");
		list.add("word");
		System.out.println(list);
		//遍历元素
		Iterator iterator =list.iterator();
		while(iterator.hasNext()){
			Object next = iterator.next();
			String str= (String) next;//强制类型转换
			if(str.equals("word")){
				list.add("javaee");
			}
		}
	}
}
