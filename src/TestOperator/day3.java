package TestOperator;

public class day3{
	public static void main(String[] args){
		//一、请自己实现两个整数变量的交换(不需要定义第三方变量)
		//位异或运算符的特点：
		//^的特点：一个数据对另一个数据位异或两次，该数本身不变
		int a=1;
		int b=2;
		a=a^b;//a=1^2
		b=a^b;//b=1^2^2=1
		a=a^b;//a=1^2^1=2
		System.out.println(a);
		System.out.println(b);
	}
}
