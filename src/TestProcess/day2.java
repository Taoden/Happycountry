package TestProcess;

public class day2{
	public static void main(String[] args){
		//根据分数来判断优良中差
		int a=90;
		if(a>90){
			System.out.println("优");
		}else if(a>80){
			System.out.println("良");
		}else if(a>70){
			System.out.println("中");
		}else if(a>60){
			System.out.println("差");
		}else{
			System.out.println("不及格");
		}

	}
}
