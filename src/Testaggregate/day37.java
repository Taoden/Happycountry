package Testaggregate;

import java.util.Set;
import java.util.TreeSet;

public class day37{
	public static void main(String[] args){
		//TreeSet存储自定义对象并遍历，按照姓名长度、字母、年龄排序
		//注意:
		//通过比较字符串的compareTo方法可以比较大小
		//排序是按照unicode码的大小进行排序的
		//防止名字相同，但年龄不同的bug


		Set<Student> students =new TreeSet<Student>();
		students.add(new Student("张三",23));
		students.add(new Student("张三1",23));
		students.add(new Student("张三",23));
	}
}
class  Student implements  Comparable<Student>{
	private  String name;
	private  int  age;

	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Student(){}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	@Override
	public int compareTo(Student other){
		//按姓名长度排序
			int num =this.name.length()-other.name.length();
		//按字母排序
		if(num==0){
			num=this.name.compareTo(other.name);
		}
		//年龄排序
		if(num==0){
			num=this.age-other.age;
		}
		return num;
	}
}