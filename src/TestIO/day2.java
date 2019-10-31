package TestIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class day2{
	public static void main(String[] args) throws IOException{
		//案例:往一个abc.txt文件写数据（知识点）
		//new FileOutputStream(file)这种构造方法，会把以前的内容都删除
		//new FileOutputStream(file,true);这种构造方法能追加内容
		//FileNotFoundException是IOException的子类
		//write(int b)，写数据
		FileOutputStream fileOutputStream=new FileOutputStream("a.txt");

		byte [] bytes ={1,2,3,4,5,6,};

		fileOutputStream.write(bytes);


		fileOutputStream.close();
	}
}
