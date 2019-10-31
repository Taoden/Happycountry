package Testaggregate;

import java.util.ArrayList;
import java.util.List;

public class day30{
	public static void main(String[] args){
		//案例演示： 集合嵌套之List嵌套List

		//学校
		//用集合表示两个班级
		List<student> java1=new ArrayList<student>();
		java1.add(new student("1"));
		java1.add(new student("2"));

		List<student> java2=new ArrayList<student>();
		java2.add(new student("1"));
		java2.add(new student("2"));

		//用集合表示学校
		//集合的嵌套
		List<List<student>> school =new ArrayList<List<student>>();
		school.add(java1);
		school.add(java2);
		//遍历
		//遍历嵌套
		for(List<student> stus:school){
			for(student s:stus){
				System.out.println(s);
			}
		}
	}
}
