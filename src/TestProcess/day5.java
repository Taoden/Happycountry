package TestProcess;

public class day5{
	public static void main(String[] args){
		/*在控制台输出100到999所有的”水仙花数”
		在控制台输出100到999所有的”水仙花数”的个数*/

		int count=0;
		for(int i = 100; i <1000 ; i++){
			int a=i/100;//百位
			int b=i%100/10;//十位
			int c=i%10;//个位
			int sum=(a*a*a)+(b*b*b)+(c*c*c);
			if(sum==i){
				count++;
				System.out.println(i);

			}
		}
		System.out.println(count);
	}
}
