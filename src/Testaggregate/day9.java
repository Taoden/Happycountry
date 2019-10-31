package Testaggregate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class day9{
	public static void main(String[] args){
		//boolean hasNext()是否有下一个
		//boolean hasPrevious()是否有前一个
		//Object next()返回下一个元素
		//Object previous();返回上一个元素

		List list =new ArrayList();
		list.add("小明");
		//遍历
		ListIterator listIterator =list.listIterator();
		/*while(listIterator.hasNext()){
			Object next = listIterator.next();
			System.out.println(next);
		}*/

		while(listIterator.hasPrevious()){
			Object previous = listIterator.previous();
			System.out.println(previous);
		}
	}
}
