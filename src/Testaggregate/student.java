package Testaggregate;

import java.util.Objects;

public class student extends  Person implements Comparable<student>{
	public student(String name){
		this.name = name;
	}
	public  student(){

	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	private 	String name;

	/*@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof student)) return false;
		student student = (student) o;
		return getName().equals(student.getName());
	}


	@Override
	public int hashCode(){
		return Objects.hash(getName());
	}
*/


	@Override
	public String toString(){
		return super.toString();
	}
//TreeSet添加自定义元素需实现的接口中的方法
	@Override
	public int compareTo(student other){

		//从小到大int num=this.age-other.age，按年龄排序

		//年龄相同if(num==0) num=1

		//TreeSet 去除元素，以前的hashCode和equals方法不起作用
		/*if(num==0){
			this.name.compareTo(other.name);
		}*/

		return 1;
	}

}
