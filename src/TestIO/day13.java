package TestIO;

import java.io.*;

public class day13{
	public static void main(String[] args) throws IOException{
		//带缓冲的字符流
		//

		//需求:拷贝文件a.txt—》b.txt
		//创建Reader
		FileReader fileReader =new FileReader("a.txt");
		BufferedReader bufferedReader =new BufferedReader(fileReader);
		//创建Writer
		FileWriter fileWriter =new FileWriter("b.txt");
		BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
		//3.读写
		int c=0;
		//内部会读8*1024个字符
		while((c=bufferedReader.read())!=-1){
			bufferedWriter.write(c);

		}
		bufferedReader.close();
		bufferedWriter.close();
	}
}
