package Testaggregate;

import java.util.HashMap;
import java.util.Map;

public class day41{
	public static void main(String[] args){
		//HashMap使用注意事项
		Map<String,String> map =new HashMap<String, String>();
		//声明HashMap时的键值可以是任意对象


		//如果有重复的键，会把以前的替换
		map.put("name","1");
		map.put("name","2");

		//值能为空
		map.put("name",null);

		//键能为空,但这样写没什么意义
		map.put(null,"2");

		//put方法的返回值

		//如果键是第一次存储，就直接存储元素，返回null
		//如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值



	}
}
