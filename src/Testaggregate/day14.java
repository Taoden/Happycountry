package Testaggregate;

import java.util.LinkedList;

public class day14{
	public static void main(String[] args){
		//需求：请用LinkedList模拟栈数据结构的集合，并测试
		//创建一个类将Linked中的方法封装
		//进栈，出栈
		//创建对象
		Stack stack =new Stack();
		stack.in("a");

		System.out.println(stack.linkedList);

		//出栈
		Object out = stack.out();
		System.out.println(out);
		System.out.println(stack.linkedList);
	}
}
class  Stack{
	LinkedList linkedList =new LinkedList();
	public void  in(Object o){
		//进栈
		linkedList.addFirst(o);
	}
	public  Object out(){
		//出栈
		return linkedList.removeFirst();
	}

}