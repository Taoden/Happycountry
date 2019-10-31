package Testsort;

public class day2{
	public static void main(String[] args){
		//数组高级排序
		//选择排序：从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处
		int [] arr={24,69,80,57,13};

		//比较的轮次
		for(int i = 0; i <arr.length-1 ; i++){
			System.out.println("第"+(i+1)+"次");
			for(int j = i+1; j <arr.length ; j++){
				System.out.println(i+"-"+j);
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i = 0; i <arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
