package TestOperator;

public class day1{
	public static void main(String[] args){
		//第一题，写出下面打印的值a,b,c

		int a=10;
		int b =10;
		int c =10;

		a=b++;//10
		System.out.println(a);
		c=--a;//9
		System.out.println(c);
		b=++a;//10
		System.out.println(b);
		a=c--;//9
		System.out.println(a);
	//第二题:int x = 4; int y = (x++)+(++x)+(x*10);求y的值
		int x =4;
		int y=(x++)+(++x)+(x*10);
		//      4     6     60   70
		System.out.println(y);
	//第三题:下面哪句会报错,为什么
		//byte b = 10;
		//b = b + 1;//类型不匹配，int 不能转成byte
		byte k=10;
		k= (byte) (k+1);
	}
}
