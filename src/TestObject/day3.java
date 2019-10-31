package TestObject;

public class day3{
	public static void main(String[] args){
		//getClass获取对象的真实类的全名称
		Animal dog =new Dog();
		Class aClass = dog.getClass();
		System.out.println(aClass);

	}
}
abstract  class  Animal{

}

class  Dog extends  Animal{

}