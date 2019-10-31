package TestIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class day14{
	public static void main(String[] args) throws IOException{
		//BufferedReader的readLine()方法
		// 可以读取一行字符(不包含换行符号)
		//1.创建Reader
		FileReader fileReader =new FileReader("a.txt");
		BufferedReader bufferedReader=new BufferedReader(fileReader);

		System.out.println(bufferedReader.readLine());
		String line=null;
		while((line=bufferedReader.readLine())!=null){
			System.out.println(line);
		}


	}
}
