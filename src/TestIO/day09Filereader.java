package TestIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class day09Filereader{
	public static void main(String[] args) throws IOException{
	//FileReader 读取字符流类
		//FileWrite 写入字符流类
		FileReader fileReader = new FileReader("a.txt");
		//读取数据
		fileReader.read();
		//
		int c;
		while((c=fileReader.read())!=-1){
			System.out.println(c);
		}
	}
}
