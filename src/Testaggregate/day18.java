package Testaggregate;



import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

public class day18{
	public static void main(String[] args){
		//泛型使用注意事项
		//前后类型不能不同，即不可以前面写父类，后面写子类
		List<student> students =new ArrayList<student>();

		//1.默认声明一个泛型集合，前后类型要一至
		//List<Student> list = new ArrayList<Student>();


		//2.这样声明前后类型不一至是不可以的
		//List<Object> list = new ArrayList<Student>();


		//3.集合泛型的声明，可以只声明前面的泛型,jdk1.7的新特性:菱形泛型,开发时建议还是写成前后一至
		//List<Student> list1 = new ArrayList();

		//4.集合声明的泛型，代表此类或者子类都可以成为集合的元素，
		// eg: Person -> Student
		//Person可改成Object
		List<Person> list =new ArrayList<Person>();
		list.add(new Person());
		list.add(new student());


		//5.声明的泛型类型一定是引用数据类型
		//List<int> list1=new ArrayList<int>();//
		List<Integer> list1=new ArrayList<Integer>();
	}
}
