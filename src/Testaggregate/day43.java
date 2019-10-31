package Testaggregate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class day43{
	public static void main(String[] args){
		//键值对对象找键和值思路：
		//获取所有键值对对象（Entry）的集合
		//遍历键值对对象的集合，获取到每一个键值对对象
		//Entry这个对象相当于内部有个key和value属性
		//根据键值对对象找键和值
		//
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "张三");
		map.put("age", "2");
		map.put("gender", "3");

		//Entry ： 称为键值对 对象
		Set<Map.Entry<String,String>> entries = map.entrySet();
		//遍历
		for(Map.Entry<String,String> entry:entries){
			String key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key+"  "+value );
		}

		//通过迭代器
		Iterator<Map.Entry<String,String>> iterator = entries.iterator();
		while(iterator.hasNext()){
			Map.Entry<String,String> next = iterator.next();
			System.out.println(next.getKey()+" "+next.getValue());
		}

	}
}
