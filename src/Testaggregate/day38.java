package Testaggregate;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class day38{
	public static void main(String[] args){
		//TreeSet(Comparator<? super E> comparator)
		//TreeSet有个带Comparator参数的构造方法
		//构造一个新的空 TreeSet，它根据指定的 “比较器”进行排序。
		//元素类型是final，不被重写，就选择选择器
		//如果希望相同元素存在，在CompareTo或Compare方法中返回1；
		Set<Integer>  set= new TreeSet<>(new myCompa());
		set.add(12);
		set.add(15);
		set.add(14);
		for(Integer i:set){
			System.out.println(i);
		}
	}
}
class  myCompa implements  Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2){
		return o1-o2;//数字由小到大
	}
}