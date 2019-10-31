package Testaggregate;

import java.util.LinkedList;

public class day15{
	public static void main(String[] args){
		//LinkedList其实以减提供了栈的功能
		//1.创建栈对象
		LinkedList stack =new LinkedList();
		//2.进栈
		stack.push("a");
		System.out.println(stack);
		//3.出栈
		//出栈时，会把出栈的元素返回给你，也就是说pop方法由返回值
		//如果没有元素了，或报错，没有元素异常。
		stack.pop();
		System.out.println(stack);

	}
}
