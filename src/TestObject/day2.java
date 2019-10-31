package TestObject;

public class day2{
	public static void main(String[] args){
		//hashCode对象的逻辑地址值
		day2 d= new day2();
		day2 d1= new day2();
		day2 d3=d;
		System.out.println(d.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(d3.hashCode());
	}
}
