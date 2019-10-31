package Testaggregate;

import java.util.Enumeration;
import java.util.Vector;

public class day10{
	public static void main(String[] args){
		//Vector类特有功能
		//public void addElement(E obj)
		//public E elementAt(int index)
		//public Enumeration elements()

		Vector vector =new Vector();
		//添加元素
		vector.addElement("sdas");
		//取元素
		System.out.println(vector.elementAt(0));
		//遍历Vector集合
		Enumeration enumeration =vector.elements();
		while(enumeration.hasMoreElements()){
			Object o = enumeration.nextElement();
			System.out.println(o);
		}
	}
}
