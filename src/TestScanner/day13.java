package TestScanner;

public class day13{
	public static void main(String[] args){
		//统计大串中小串出现的次数
		String str="jasdhsdasudsdiasdjsd";
		String name="sd";
		int count=0;
		//int index=str.indexOf(name);//表示name在str中第一次出现位置
		while(true){
			System.out.println(str);
			int index=str.indexOf(name);
			if(index==-1){//没找到，退出循环
				break;
			}
			//找到，截取字符串，+1
			str=str.substring(index+name.length());
			count++;

		}

		System.out.println(count);
	}
}
