package Testoriented;

public class day1{
	String name;
	int age;
	double height;

	public day1(){

	}

	public day1(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}

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

	public double getHeight(){
		return height;
	}

	public void setHeight(double height){
		this.height = height;
	}
public  void  Test(){
	System.out.println(this.name);
}

	public static void main(String[] args){
		day1 day1=new day1();
		day1.name="流";
		day1.setAge(45);
		System.out.println(day1.getName());
		day1.Test();
		new day1().name="张三";
	}
}
