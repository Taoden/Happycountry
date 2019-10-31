package Testaggregate;

import java.util.ArrayList;
import java.util.List;

public class day23{
	public static void main(String[] args){
		//泛型通配符<?>
		//任意类型，如果没有明确，
		// 那么就是Object以及任意的Java类了
		List<Object> list =new ArrayList<Object>();
		//等效于
		List<?> list1=new ArrayList<>();//声明时右边不能用？

		List<String> list2 =new ArrayList<String>();
		print(list2);
		//? extends E【E是父类】?是子类
		//向下限定，E及其子类
		//addAll(Collection <? extends Person>c)
		//添加的集合可以是Person类型【List<Person> list3】，或者是Person的子类
		List<Person> list3 =new ArrayList<Person>();
		list3.add(new Person());
		List<Person> list4 =new ArrayList<Person>();
		list4.addAll(list3);//把list3的元素添加到list4中

		List<student> list5 =new ArrayList<student>();
		list5.add(new student("lisi"));

		//? super E
		//向上限定，E及其父类
		//？是父类，E是子类



	}
	public  static  void print(List<?> list){
		System.out.println(list);
	}
}
