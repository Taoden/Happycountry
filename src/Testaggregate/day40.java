package Testaggregate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class day40{
	public static void main(String[] args){
		//获取功能



		Map<String,Object> map =new HashMap<String,Object>();
		map.put("age",30);//自动将int提升为Integer(自动装箱)
//V get(Object key):根据键获取值
		System.out.println(map.get("age"));

//Set<K> keySet():获取集合中所有键的集合
		Set<String> keys =map.keySet();
		System.out.println(keys);
//Collection<V> values():获取集合中所有值的集合
		Collection<Object> objects =map.values();
		System.out.println(objects);
		//长度功能
		//int size()：返回集合中的键值对的个数
		//
		//Map是一个接口，一般我们使用它的子类HashMap

	}
}
