package Testaggregate;

public class day28{
	public static void main(String[] args){
		//可变参数概述
		//定义方法的时候不知道该定义多少个参数
		//格式
		//修饰符 返回值类型 方法名(数据类型…  变量名){}
		//注意事项：
		//这里的变量其实是一个数组



	}
	public  void  test1(int a,int b){

	}
	//可变参数
	public  void  test2(int...nums){//变量其实是一个数组
		//遍历
		for(int num:nums){
			System.out.println(num);
		}

	}
	public  void  test3(Object...objs){//objs其实是一个数组
		//遍历
		for(Object obj:objs){
			System.out.println(obj);
		}


	}
	//如果一个方法有可变参数，并且有多个参数，
	// 那么，可变参数肯定是最后一个
	public  void  test4(int a,Object...objs){//objs其实是一个数组
		//遍历
		for(Object obj:objs){
			System.out.println(obj);
		}


	}
}
