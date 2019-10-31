package TestWrittenexamination;
//懒汉式
public class TestSinglecase{
	private  static  TestSinglecase instance;
	private  TestSinglecase(){

	}

	public  static  TestSinglecase getInstance(){
		if(instance==null){
			instance =new TestSinglecase();
		}
		return  instance;
	}

}
