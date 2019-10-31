package TestIO;

import java.io.*;

public class day17{
	public static void main(String[] args) throws IOException{
		//InputStreamReader&OutputStreamWriter
		//这两个类用于使用指定的码表读写字符
		//FileReader是使用默认码表读取文件, 如果需要使用指定码表读取请使用InputStreamReader(字符流,编码表)
		//FileWriter是使用默认码表写出文件, 如果需要使用指定码表写入请使用OutputStreamWriter(字符流,编码表)
		//使用指定“码表UTF—8”读取字符
		FileInputStream fileInputStream =new FileInputStream("a.txt");
		InputStreamReader inputStreamReader =new InputStreamReader(fileInputStream,"UTF-8");
		//读一个字符
		System.out.println((char) inputStreamReader.read());
		//读一行
		BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
		System.out.println(bufferedReader.readLine());

		FileOutputStream fileOutputStream =new FileOutputStream("a.txt");
		OutputStreamWriter outputStreamWriter =new OutputStreamWriter(fileOutputStream);
		BufferedWriter bufferedWriter =new BufferedWriter(outputStreamWriter);
		bufferedWriter.write("你好");
		bufferedWriter.newLine();
	}
}
