package TestOther;

import java.util.Arrays;

public class day3{
	public static void main(String[] args){
		//System类的概述
		//System 类包含一些有用的类字段[静态属性]和方法。它不能被实例化。
		//
		//成员方法
		//public static void gc()
		//运行垃圾回收
		for(int i = 0; i <10 ; i++){
			new Cig();
			System.gc();
			//java中垃圾自动回收
		}


		//public static void exit(int status)
		//exit退出
		System.exit(0);//程序执行完退出


		//public static long currentTimeMillis()
		//currentTimeMillis指从1970-1-1到现在走过的毫秒时间

		//pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//arraycopy数组拷贝
		//参数依次为，源对象、源对象的位置、目标对象、目标位置、长度、
		int [] arr1={23,21,2,18,49};
		int [] arr2=new int [3];
		System.arraycopy(arr1,1,arr2,0,3);
		System.out.println(Arrays.toString(arr2));
	}
}
class  Cig{
	@Override
	//当对象从内存消失时，会使用
	protected void finalize() throws Throwable{
		System.out.println("进行回收");
	}
}