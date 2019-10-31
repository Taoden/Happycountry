package TestStringBuffer;

public class day7{
	public static void main(String[] args){
		//需求：把数组中的数据按照指定个格式拼接成一个字符串
		//举例： int[] arr = {1,2,3};
		//输出结果： "[1, 2, 3]"
		//用StringBuffer的功能实现

		//1.声明一个数组
		int [] arr={1,2,3};
		//2.声明字符串缓存区对象
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		//3.遍历元素
		for(int i = 0; i <arr.length ; i++){
			sb.append(arr[i]);
			if(i==arr.length-1){
				sb.append("]");
			}else {
				sb.append(",");
			}



		}
		System.out.println(sb);

	}
}
