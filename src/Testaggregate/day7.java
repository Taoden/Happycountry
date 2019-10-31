package Testaggregate;

import java.util.ArrayList;
import java.util.List;

public class day7{
	public static void main(String[] args){
		//通过List的size()和get()方法结合来遍历List集合
		List list=new ArrayList();
		list.add(new student("lisi"));

		for(int i = 0; i <list.size() ; i++){
			Object o = list.get(i);
			System.out.println(o);
		}


	}
}
