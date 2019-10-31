package Testaggregate;

import java.util.ArrayList;
import java.util.List;

public class day51{
	public static void main(String[] args){
		//泛型固定下边界 ? super E
		//
		//回顾? extends E （E的子类）
		//ArrayList.addAll(Collection<? extends Person> c)
		//
		//? super E （E的父类）
		//ArrayList.sort(Comparator<? super Student> c)
		//
		//? extends E 针对存的操作
		//? super E 针对取的操作

		List<String> list=new ArrayList<String>();


	}
}
