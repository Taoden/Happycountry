package TestObject;

import java.util.Objects;

public class day5{
	public static void main(String[] args){
		//equals比较对象的引用地址是否相同
		Student1 student1 =new Student1("lisi");
		Student1 student2 =new Student1("lisi1");
		Student1 student3=student1;
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());

		System.out.println(student1.equals(student2));
		System.out.println(student3.equals(student1));
		//重写equals方法
		System.out.println(student1.equals(student3));


	}
}
class  Student1{
	String name;

	public Student1(String name){
		this.name = name;
	}
	public  Student1(){

	}

	/*@Override
	public boolean equals(Object obj){
		//return super.equals(obj);
		Student1 other= (Student1) obj;
		boolean b=this.name.equals(other.name);
		return b;
	}*/

	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Student1)) return false;
		Student1 student1 = (Student1) o;
		return Objects.equals(name, student1.name);
	}

	@Override
	public int hashCode(){
		return Objects.hash(name);
	}
}