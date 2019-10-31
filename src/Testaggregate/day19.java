package Testaggregate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class day19{
	public static void main(String[] args){
		//使用泛型ArrayList存储字符串并遍历
		//使用泛型ArrayList存储学生对象并遍历
		List<student> list =new ArrayList<>();
		list.add(new student("liu"));
		list.add(new student("liu2"));
		list.add(new student("liu3"));
		Iterator<student> iterator=list.iterator();
		while(iterator.hasNext()){
			student next = iterator.next();
			System.out.println(next);
		}
	}
}
