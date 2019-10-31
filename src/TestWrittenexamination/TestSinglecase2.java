package TestWrittenexamination;
//饿汉式
public class TestSinglecase2{
	private static final TestSinglecase2 instance=new TestSinglecase2();
	private  TestSinglecase2(){
	}
	public  static  TestSinglecase2 getInstance(){
		return 	instance;
	}

}
