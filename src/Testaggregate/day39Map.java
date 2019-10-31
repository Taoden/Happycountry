package Testaggregate;

import java.util.HashMap;
import java.util.Map;

public class day39Map{
	public static void main(String[] args){
		//创建一个Map对象
		Map<String,String> map =new HashMap<String,String>();
		//添加功能
		//V put(K key,V value):添加元素。
		//如果键是第一次存储，就直接存储元素，返回null
		//如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
		String put = map.put("name", "zhangsan");
		System.out.println(put);//返回null
	  		put=	map.put("name","lisi");
		System.out.println(put);//返回zhangsan
		System.out.println(map);


		//删除功能
		//void clear():移除所有的键值对元素
		//V remove(Object key)：根据键删除键值对元素，并把值返回
		map.clear();//删除所有

		String name = map.remove("name");
		System.out.println(name);

		//判断功能
		//boolean containsKey(Object key)：判断集合是否包含指定的键
		//boolean containsValue(Object value):判断集合是否包含指定的值
		//boolean isEmpty()：判断集合是否为空

		System.out.println(map.containsValue("name"));
		

	}
}
