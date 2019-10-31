package Testaggregate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class day29{
	public static void main(String[] args){
		//Arrays工具类的asList()方法的使用

		//T...a泛型参数
		//aslist,把参数转成集合
		List<String> list = Arrays.asList("afsd", "asda");
		System.out.println(list);
		List<student> list1 = Arrays.asList(new student(), new student(), new student());
		System.out.println(list1);
		//Collection中toArray(T[] a)泛型版的集合转数组
		Collection<String> collection=new ArrayList<String>();
		collection.add("asd");
		collection.add("asdas");
		String [] strings =new String[2];
		//把集合中的元素存在指定的数组中
		collection.toArray(strings);
		for(String str:strings){
			System.out.println(str);
		}
	}
}
