package TestException;

public class day1{
	public static void main(String[] args){
		//
		try{
			int a=10/0;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("存在异常");
		}

	}
}
