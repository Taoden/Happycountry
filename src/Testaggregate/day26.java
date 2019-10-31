package Testaggregate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class day26{
	//迭代=遍历
	public static void main(String[] args){










	}
private  static  void 	test1(){
	//普通for循环,可以删除,但是索引要(--减减 )
	List<String> list=new ArrayList<String>();
	list.add("java");
	list.add("java");
	list.add("java");
	//int size=list.size();//把size提取到外面会有数组越界的问题
	//里面直接写size，值固定不变。list.size，每次循环会更新值大小
	for(int i = 0; i <list.size() ; i++){
		String str =list.get(i);
		if(str.equals("java")){
			list.remove("java");
			i--;
		}
	}
	/*for(String s:list){
		System.out.println(s);
	}*/

}
//	//迭代器,可以删除,但是必须使用迭代器自身的remove方法,
//		// 否则会出现并发修改异常
	private  static  void  test2(){
		List<String> list=new ArrayList<String>();
		list.add("java");
		list.add("java");
		list.add("java");
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			if(next.equals("java")){
				iterator.remove();
			}
		}
	}
	//增强for循环不能删除，增强for循环，内部的实现机制就是迭代器
	private  static  void  test3(){
		//
		List<String> list=new ArrayList<String>();
		list.add("java");
		list.add("java");
		list.add("java");

		//迭代
		for(String str:list){
			if(str.equals("java")){
				list.remove(str);
			}
			System.out.println(str);
		}
		}
	}

