package TestObject;

public class dayequalsyudeng{
	public static void main(String[] args){
		//==和equals
		int a=10;
		int b=10;
		System.out.println(a==b);
		Student1 s= new Student1("z");
		Student1 s1= new Student1("c");
		System.out.println(s==s1);//这种写法也是比较地址
		System.out.println(s.equals(s1));
	}
}