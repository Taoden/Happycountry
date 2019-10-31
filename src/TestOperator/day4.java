package TestOperator;

public class day4{
	public static void main(String[] args){
		/*练习:
		获取两个数中最小的数
		比较两个数是否相同
		获取三个整数中的最大值*/

		int a = 5;
		int b = 6;
		int c = 10;

		int min = (a < b) ? a : b;
		System.out.println(min);

		boolean isequal = (a == b) ? true : false;
		System.out.println(isequal);

		int max = a > b ? a : b;
		max = max > c ? max : c;
		System.out.println(max);

	}
}
