package TestOperator;

public class day2{
	public static void main(String[] args){
		//看下面的程序是否有问题，如果有问题，请指出并说明理由。
		//short s=1;s = s+1;
		//short s=1;s+=1;
		short s=1;
		s= (short) (s+1);
		System.out.println(s);
		short s1=1;
		s1+=1;
		System.out.println(s1);
	}
}
