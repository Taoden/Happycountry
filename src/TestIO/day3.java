package TestIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class day3{
	public static void main(String[] args) throws IOException{
		//拷贝图片
		//通过输入流读取图片
		FileInputStream fileInputStream=new FileInputStream("a.jpg");
		//通过输出流写数据
		FileOutputStream fileOutputStream =new FileOutputStream("a.jpg");
		//通过输入流读取图片的数据
		int b=0;
		while((b=fileInputStream.read())!=-1){
			System.out.println(b);
		}
		fileInputStream.close();
		//再次运行会覆盖。。
	}
}
