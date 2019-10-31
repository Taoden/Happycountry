package Testsort;

public class day3{
	public static void main(String[] args){
		//二分查找又称折半查找，优点是比较次数少，查找速度快，平均性能好；其缺点是要求待查表为有序表。二分查找的目的是查找元素的索引，有个前提是数组元素必须为有序

		int [] arr={11,22,33,44,55,66};
		int num=22;
		int min=0;
		int max=arr.length-1;
		int mid=(min+max)/2;
		System.out.println("min:"+min+"mid:"+mid+"max:"+max);

		//查找的算法
		int index=-1;//如果算到最后，index结果没有改变，代表num在arr中不存在

		while(true){
			if(arr[mid]==num){//找到查找
				index=mid;
				break;
			}
			if(arr[mid]>num){//num在左边
				max=mid-1;
				mid=(min+max)/2;
			}
			if(arr[mid]<num)//num在右边
			{
				min=mid+1;
				mid=(min+max)/2;

			}

			if(min>max){//不符合逻辑
				break;
			}
		}
		System.out.println(num+"索引"+index);

	}
}
