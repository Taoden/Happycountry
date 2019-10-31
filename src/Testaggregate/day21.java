package Testaggregate;

public class day21{
	public static void main(String[] args){
		//泛型类和泛型方法
		//定义格式
		//public class 类名<泛型类型1,…>

		//使用泛型类

		//1.创建对象
		Tool<String> tool =new Tool<String>();

		//2.使用方法
		tool.print("abc");
		//
		tool.get(1);
		//给泛型属性赋值
		tool.setO("liu");
		//获取泛型属性的值
		System.out.println(tool.getO());

		Tool<student> studentTool=new Tool<student>();
		studentTool.print(new student("lisi"));
		student student = studentTool.get(2);
		System.out.println(student);
	}
}
//声明一个泛型类
//<>号里的名字没有要求，任何一个字母都行，最好用大写的字母
class  Tool<I>{
	//2.声明泛型方法，无返回值，参数是泛型
	public void  print(I i){
		System.out.println(i);
	}
	//有返回值,无泛型参数
	public I get(int index){
		return null;
	}

	public Tool(I o){
		this.o = o;
	}

	//声明一个泛型属性
private 	I o;

	public  Tool(){

	}

	public I getO(){
		return o;
	}

	public void setO(I o){
		this.o = o;
	}


}