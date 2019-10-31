package TestIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class day5{
	public static void main(String[] args) throws IOException{
		//输入流读取数据的方法
		//read(byte[] b) 读取指定字节数的数据
		//输出流写数据的方法
		//write(byte[] b)
		//write(byte[] b, int off, int len)写出有效的字节个数

		//这种方式经常使用

		//1.输入流
		FileInputStream fileInputStream =new FileInputStream("a.txt");
		//输出流
		FileOutputStream fileOutputStream =new FileOutputStream("a.txt");
		//定义8kb字节数组
		byte [] bytes =new byte[1024*8];
		int len=0;
		int i=0;
		while((len=fileInputStream.read(bytes))!=-1){
			//写入文件
			i++;
			fileOutputStream.write(bytes,0,len);
		}
		//关闭
		fileInputStream.close();
		fileOutputStream.close();
		System.out.println(i);
	}

}
