package Testaggregate;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class day45{
	public static void main(String[] args){
		//LinkedHashMap的特点：底层是链表实现的可以保证怎么存就怎么取
		//HashMap是存的和取的顺序是不一样的
		Map<String,String> map=new LinkedHashMap<String, String>();
		map.put("zhangsan","广州");
		//Set<Map.Entry<String,String>> entries = map.entrySet();
		//遍历
		for(Map.Entry<String,String> entry:map.entrySet()){
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"  "+value );
		}

	}
}
