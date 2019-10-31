package TestIO;

public class day18{
	public static void main(String[] args){
		//方法内部调用自己
		//5!


	/*	int r=1;
		for(int i = 0; i <=5 ; i++){
			r*=i;

		}
		System.out.println(r);*/
	int r=jiecheng(6);
		System.out.println(r);

	}
	public  static  int jiecheng(int i){
		if(i==1){
			return 1;
		}else {
			return  i*jiecheng(i-1);
		}
	}
}

