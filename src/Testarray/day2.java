package Testarray;

public class day2{
	public static void main(String[] args){
		int a [] [] ={{22,66,44},{77,33,88},{25,45,65},};
		int sum=0;
		for(int i = 0; i <a.length ; i++){
			int [] arr=a[i];
			for(int j = 0; j <arr.length ; j++){
				sum+=arr[j];

			}

		}
		System.out.println(sum);
	}
}
