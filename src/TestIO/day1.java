package TestIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class day1{
	public static void main(String[] args) throws IOException{
		//InputStream是抽象类，表示字节输入流
		//FileInputStream 从文件系统中的某个文件中获得输入字节。FileInputStream 用于读取诸如图像数据之类的原始字节流。要读取字符流，请考虑使用 FileReader
		//
		//构造方法
		//FileInputStream(File file)
		//FileInputStream(String name)
		//成员方法
		//int read() 从此输入流中读取一个数据字节。

		//1.创建文件对象
		String path="C:/Users/3646/Desktop/a.txt";
		File file=new File(path);
		//2.创建文件输入流
		FileInputStream fileInputStream=new FileInputStream(file);
		//3.读取数据，read()表示每次读取一个字节，-1表示读取结束
		//byte转为int
		//byte : 11111111表示-1，-1的补码
		//int ： 00000000 00000000 00000000 11111111
		//因为计算机以补码方式计算
		System.out.println(fileInputStream.read());

		//第二种方式,int转为char
		int b=0;
		while((b=fileInputStream.read())!=-1){
			System.out.println(b);
		}
		fileInputStream.close();
	}
}
