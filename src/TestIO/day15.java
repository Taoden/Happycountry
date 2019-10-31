package TestIO;

import java.io.*;

public class day15{
	public static void main(String[] args) throws IOException{
		//BufferedWriter的newLine()
		// 可以输出一个跨平台的换行符号"\r\n"
		FileReader fileReader =new FileReader("a.txt");
		BufferedReader bufferedReader=new BufferedReader(fileReader);

		FileWriter fileWriter =new FileWriter("a.txt");
		BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
		String line=null;
		while((line=bufferedReader.readLine())!=null){
			bufferedWriter.write(line);
			bufferedWriter.newLine();//换行
		}

	}
}
