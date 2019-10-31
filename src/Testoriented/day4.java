package Testoriented;

public class day4{
	/*学生和老师案例
			分别写个学生和老师类
	相同属性:姓名,年龄
	相同行为:吃饭
	老师有特有的方法:讲课
	学生有特有的方法:学习*/

	String name;
	int age;
	public  day4(){

	}
	public day4(String name, int age){
		this.name = name;
		this.age = age;
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
	public  void  class1(){
		System.out.println(this.name+"在讲课");
	}
	public  void  eat(){
		System.out.println(this.name+"在吃饭");
	}
	public  static final  int MAX_AGE=125;
	public static void main(String[] args){
	}
}
class  Test extends day4{
	public Test(){

	}

	public Test(String name, int age){
		super(name, age);
	}

	@Override
	public void eat(){
		super.eat();
	}
	public  void  study(){
		System.out.println(this.name+"在学习");
	}

}


