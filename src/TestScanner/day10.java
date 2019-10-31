package TestScanner;

public class day10{
	public static void main(String[] args){
		//把数组转成字符串

		int [] arr={1,2,3};
		//声明一个字符串
		String s="[";

		//遍历元素
		for(int i = 0; i <arr.length ; i++){
			//s=s+arr[i]+",";
			if(i==arr.length-1)//遍历到最后一次
			{
				s+=arr[i]+"]";
			}else {
				s+=arr[i]+",";
			}

		}
		System.out.println(s);
	}
}
