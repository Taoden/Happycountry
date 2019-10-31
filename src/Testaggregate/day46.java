package Testaggregate;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class day46{
	public static void main(String[] args){
		 //实现排序的两种方法
		//1.学生类内部实现comparable接口
		//2.在new TreeMap中传入匿名类comparator
		Map<String,String> map =new TreeMap<String, String>(new Comparator<String>(){
			@Override
			public int compare(String o1, String o2){

				return 0;
			}
		});
		map.put("张三","23");
		map.put("张三1","24");
		map.put("张三2","20");
		map.put("张三3","23");
		for(Map.Entry<String,String> entry:map.entrySet()){
			System.out.println(entry.getKey()+""+entry.getValue());
		}
	}
}
