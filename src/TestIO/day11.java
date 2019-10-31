package TestIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class day11{
	public static void main(String[] args) throws IOException{
		//字符流的拷贝

		//1.创建“读取流”对象
		FileReader fileReader =new FileReader("a.txt");
		//2.创建“写入流”对象
		FileWriter fileWriter =new FileWriter("a.txt");
		//3.读取和写稿
		int c=0;
		while((c=fileReader.read())!=-1){
			fileWriter.write(c);
		}
		//4.关闭流
		fileReader.close();
		fileWriter.close();

	}
}
