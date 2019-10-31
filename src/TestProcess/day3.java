package TestProcess;

public class day3{
	public static void main(String[] args){

//		练习1:判断下面程序的结果
	/*	int y = 3;
		switch(y){
			case 3:
				y++;
			case 4:
				y++;
			default:
				y++;
				break;
		}
		System.out.println(y);*/
		int x = 3;
		switch(x){
			default://放在前面不执行，没有意义
				System.out.println(x);
				x++;

				break;
			case 3:
				System.out.println(x);
				x++;

			case 4:
				System.out.println(x);
				x++;


		}
		System.out.println(x);


	}
}
