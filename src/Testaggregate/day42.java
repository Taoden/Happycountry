package Testaggregate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class day42{
	public static void main(String[] args){
		//Map集合的遍历
		Map<String,String> map =new HashMap<String, String>();
		map.put("name","张三");
		map.put("age","2");
		map.put("gender","3");
		//取key对应的值
		//String s = map.get("name");
		//遍历
		//1.获取map所有键
		Set<String> strings = map.keySet();

		for(String string:strings){
			String s1 = map.get(string);
			System.out.println(string+":"+s1);
		}




	}
}
