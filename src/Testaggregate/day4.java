package Testaggregate;

import java.util.ArrayList;
import java.util.Collection;

public class day4{
	public static void main(String[] args){
		//boolean addAll(Collection c)
		Collection collection=new ArrayList();
		collection.add("a");
		Collection collection1=new ArrayList();
		collection1.add("n");
		//集合的相加
		System.out.println(collection.addAll(collection1));//元素改变，返回true

		//boolean removeAll(Collection c)
		collection.retainAll(collection1);//移除集合collection1中所有元素
		//boolean containsAll(Collection c)

		collection.containsAll(collection1);//判断集合collection1中的元素collection都有
		//boolean retainAll(Collection c)
		collection.retainAll(collection1);
		//取两个集合的交集


	}
}
