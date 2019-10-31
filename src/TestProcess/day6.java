package TestProcess;

public class day6{
	//求和思想，求1-100之和，使用while语句实现
	//统计思想 ,统计100-999”水仙花数”共有多少个,使用while语句实现
	public static void main(String[] args){
		int i=1;
		int sum=0;
		while(i<100){

			sum+=i;
			i++;
		}
		System.out.println(sum);
		int j=100;
		int count=0;
		while(j<1000){
			int a=j/100;
			int b=j%100/10;
			int c=j%10;
			int temp=(a*a*a)+(b*b*b)+(c*c*c);
			if(temp==j){
				count++;
				System.out.println(temp);

			}
			j++;
		}
		System.out.println(count);
	}



}
