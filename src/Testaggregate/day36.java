package Testaggregate;

import java.util.Set;
import java.util.TreeSet;

public class day36{
	public static void main(String[] args){
		//TreeSet在添加元素，内部会将Person转为Comparable
		//添加自定义元素
		// 需实现Comparable接口
		// 并实现接口的compareTo方法
		//当方法返回0：只存第一个元素
		//			-1：倒序存元素
		//			1：怎么加就怎么存
		Set<student>  students=new TreeSet<student>();
		students.add(new student("张三"));
		for(student s :students){
			System.out.println(s);
		}




	}

}
