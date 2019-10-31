package Testaggregate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class day50{
	public static void main(String[] args){

		//Collections是类
		// Collection是接口


		//Collections类概述，查看API文档
		//针对集合操作 的工具类
		//Collections成员方法
		//public static <T> void sort(List<T> list)
		List<Integer> list =new ArrayList<Integer>();
		list.add(12);
		//排序
		Collections.sort(list);

		//public static <T> int binarySearch(List<?> list,T key)
		//二分查找
		Collections.binarySearch(list,12);
		//public static <T> T max(Collection<?> coll)
		//取最大值List,Set
		Collections.max(list);
		//public static void reverse(List<?> list)
		//反转
		Collections.reverse(list);
		//public static void shuffle(List<?> list)
		//打乱顺序
		Collections.shuffle(list);
	}
}
