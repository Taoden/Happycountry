package TestProcess;

public class day7{
	public static void main(String[] args){
		//循环结构循环嵌套输出4行5列的星星
		//循环结构循环嵌套输出直角三角形
		//循环结构九九乘法表
		/*for(int i = 0; i <4 ; i++){//行
			for(int j = 0; j <5 ; j++){//列
				System.out.print("*");
			}
			System.out.println("");
		}*/
//		int i=0;
//		while(i<4){
//			i++;
//			System.out.println("  ");
//			int j=0;
//			while(j<5){
//				j++;
//				System.out.print("*");
//			}
//
//		}
		/*for(int i = 0; i <5 ; i++){
			for(int j = 0; j <i ; j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		int i=0;
		while(i<4){
			i++;
			System.out.println("");
			int j=0;
			while(j<i){
				j++;
				System.out.print("*");
			}
		}*/

		for(int i = 0; i < 10; i++){
			for(int j =1; j < i+1; j++){
				System.out.print(j + "*" + i +"="+i*j +" ");
			}
			System.out.println("");
		}
	}
}
