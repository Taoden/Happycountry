package Testsort;

public class day9{
	public static void main(String[] args){
		//自动装箱，如果值一样，地址也一样。
		//自动装箱，范围在-128~127地址相同，其他地址不同
		//因为内部有一个缓冲池
		Integer i7=128;
		Integer i8=128;
		System.out.println(i7 == i8);



	}
}
