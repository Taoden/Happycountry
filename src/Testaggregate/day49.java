package Testaggregate;

import java.util.Hashtable;
import java.util.Map;

public class day49{
	public static void main(String[] args){
		//Hashtable是JDK1.0版本出现的,是线程安全的,效率低,有加锁(看原码),HashMap是JDK1.2版本出现的,是线程不安全的,效率高
		//Hashtable不可以存储null键和null值,HashMap可以存储null键和null值
		Map<String,String> map =new Hashtable<String, String>();

	}
}
