package TestIO;

import java.io.FileWriter;
import java.io.IOException;

public class day10{
	public static void main(String[] args) throws IOException{
		//FileWrite 写入字符流类
		//1.创建writer
		FileWriter fileWriter =new FileWriter("a.txt");
		//2.写内容
		fileWriter.write("你好");
		//3.关闭
		fileWriter.close();
	}
}
