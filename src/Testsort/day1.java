package Testsort;

public class day1{
	//冒泡排序
	public static void main(String[] args){
		//轻的上浮，重的下降
		//相邻的两个比较，前面比后面大就调换位置

		//对数组进行由小到大的排序
		int [] arr ={18,30,45,29,21};
		//1.比较4轮
		for(int i = 0; i <arr.length-1 ; i++){
			System.out.println("第"+(i+1)+"轮");
			//打印每一轮比较的索引
			for(int j = 0; j <arr.length-1-i ; j++){
				int left=j;
				int right=j+1;
				System.out.println(left+"-"+right);
				if(arr[left]>arr[right]){
					int temp=arr[left];
					arr[left]=arr[right];
					arr[right]=temp;
				}
			}
		}
		for(int i = 0; i <arr.length ; i++){
			System.out.print(arr[i]+" ");
		}


	}
}
