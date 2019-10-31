package TestProcess;

public class day4{
	public static void main(String[] args){
		/*需求：请在控制台输出数据1-10
		需求：请在控制台输出数据10-1
		需求：求出1-10之间数据之和
		需求：求出1-100之间偶数和
		需求：求出1-100之间奇数和*/
		for(int i = 1; i <=10 ; i++){
			System.out.println(i);
		}

		for(int i = 10; i >0 ; i--){
			System.out.println(i);
		}
		int sum=0;
		for(int i = 1; i <=10 ; i++){
			sum+=i;

		}
		System.out.println(sum);
		int sum1=0;
		for(int i = 1; i <=100 ; i++){
			if(i%2==0){
				sum1+=i;

			}
		}
		System.out.println(sum1);
		int sum2=0;
		for(int i = 1; i <=100 ; i++){
			if(i%2!=0){
				sum2+=i;

			}
		}
		System.out.println(sum2);
	}
}
