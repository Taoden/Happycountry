package TestIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class day4{
	public static void main(String[] args) throws IOException{
		//拷贝图片，优化,大文件下不建议使用
		//前面问题：每次只读一个字节

		//1.文件输入流
		FileInputStream fileInputStream =new FileInputStream("a.jpg");
		int available = fileInputStream.available();//文件大小

		//2.现在一次读文件大小的字节
		//2.1定义一个字节数组
		byte [] bytes =new byte[available];
		//2.2把数据读到字节数组中
		fileInputStream.read(bytes);//读取到的实际长度
		//把字节数组一次性写入到文件
		FileOutputStream fileOutputStream =new FileOutputStream("a.jpg");
		fileOutputStream.write(bytes);


	}
}
