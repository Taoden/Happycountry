package Testaggregate;

import java.util.ArrayList;
import java.util.List;

public class day16{
	public static void main(String[] args){
		//泛型

	/*	List list =new ArrayList();
		//集合添加基本数据类型，内部会自动提升到包装类型
		list.add(new student("liss"));
		list.add(12);*/

	//声明一个泛型集合
		List<String> list =new ArrayList<String>();
			list.add("a");
			//list.add(12);错误，提高安全性
			//遍历
		for(int i = 0; i <list.size() ; i++){
			String s = list.get(i);//省去了强转的麻烦
		}


	}
}
