package Testaggregate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class day44{
	public static void main(String[] args){
		//HashMap集合键是Student,值是String

		//打印的key是student的toString方法返回的字符串
		//如果key相同，会把前面的值替换掉,但必须是同一个对象
		//HashMap是无序的
		//new出来的都不是相同的key,因为地址不同。
		// 如果属性一样，想替换前面对应属性一样的valus时候，
		// 需要重写equals&hashcode方法
		Map<aniaml,String> map = new HashMap<aniaml,String>();
		map.put(new aniaml("张三",23),"北京");
		map.put(new aniaml("张三1",23),"北京");
		map.put(new aniaml("张三2",23),"北京");
		Set<Map.Entry<aniaml,String>> entries = map.entrySet();
		for(Map.Entry<aniaml,String> entry:entries){
			System.out.println(entry);
		}
	}
}
class  aniaml{
	String name;
	int  age;

	public aniaml(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString(){
		return super.toString();
	}
}
