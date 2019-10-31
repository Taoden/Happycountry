package TestOther;

import java.util.Random;

public class day2{
	public static void main(String[] args){
		//Random类

		//创建Random实例
		Random r1=new Random();
		for(int i = 0; i <10 ; i++){
			//System.out.println(r1.nextInt());
			System.out.println(r1.nextInt(10));
		}
		//此类用于产生随机数
		//如果用相同的种子创建两个 Random 实例，则对每个实例进行相同的方法调用序列，它们将生成并返回相同的数字序列。
		//数字序列即随机数


	}
}
