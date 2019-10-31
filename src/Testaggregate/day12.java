package Testaggregate;

import java.util.ArrayList;
import java.util.List;

public class day12{
	public static void main(String[] args){
		//需求：ArrayList去除集合中自定义对象元素的重复值(对象的成员变量值相同)
		//思路：创建新集合方式，重写equals()方法的
			//创建一个list集合
		List list =new ArrayList();
		list.add(new student("lisi"));
		list.add(new student("lisi"));
		list.add(new student("lisi"));
		//打印学生
		System.out.println(list);

		//创建新的集合
		for(int i = 0; i <list.size() ; i++){
			Object o = list.get(i);
			//强转成String类型
			student s= (student) o;
			//contains方法
			//判断字符串在集合中是否存在，比较字符串内容
			//判断自定义对象在集合中是否存在 ，比较对象地址
			//调用contains方法，内部会调用equals方法
			//重写了对象的equals方法
			if(!list.contains(o)){
				list.add(o);
			}
		}
	}
}
