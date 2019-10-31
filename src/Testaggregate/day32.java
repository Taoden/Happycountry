package Testaggregate;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class day32{
	public static void main(String[] args){
	//产生10个1-20之间的随机数要求随机数不能重复
		//创建一个set集合
		Set<Integer> set = new HashSet<Integer>();


		Random random =new Random();
			while(set.size()!=10){
				int num =random.nextInt(21);
				if(num!=0){
					set.add(num);
				}
				if(set.size()==10){
					break;
				}
			}
		System.out.println(set);
	}
}
