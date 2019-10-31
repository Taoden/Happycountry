package Testaggregate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class day17{
	public static void main(String[] args){
		//声明一个泛型集合
		List<String> list=new ArrayList<String>();
		list.add("abc");
		
		//泛型迭代器
		Iterator<String> iterator =list.iterator();
		while(iterator.hasNext()){
			//取元素
			String next = iterator.next();
		}
	}
}
