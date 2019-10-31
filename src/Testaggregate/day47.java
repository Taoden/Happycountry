package Testaggregate;

import java.util.HashMap;
import java.util.Map;

public class day47{
	public static void main(String[] args){
		//"aaabbbbbbccccccccc"各个字母出现的次数
		String str ="aaabbbbbbccccccccc";
		//1.创建集合
		Map<Character,Integer> map =new HashMap<Character, Integer>();

		//遍历
		for(int i = 0; i <str.length() ; i++){
			char c = str.charAt(i);
			//map第一次出现这个字符
			if(!map.containsKey(c)){
				map.put(c,1);
			}else {
				//map不是第一次出现这个字符
				//次数
				map.put(c,map.get(c)+1);
			}

		}
		System.out.println(map);

	}
}
