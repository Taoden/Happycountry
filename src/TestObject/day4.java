package TestObject;

public class day4{
	public static void main(String[] args){
		//toString
		day4 day4 =new day4("张三",12);
		System.out.println(day4.toString());
	}
	private  String name;
	private  int age;
	public day4(){

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

	@Override
	public String toString(){
		return "day4{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
