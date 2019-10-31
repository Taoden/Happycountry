package TestIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class day16{
	public static void main(String[] args) throws IOException{
		//一个文本文档上的文本反转,第一行和倒数第一行交换,
		// 第二行和倒数第二行交换

		//1.把文本每一行内容读取出来存在List<String>集合
		//1.集合对象
		List<String> list =new ArrayList<String>();
		BufferedReader bufferedReader =new BufferedReader(new FileReader("a.txt"));
		String line=null;
		while((line=bufferedReader.readLine())!=null){
			list.add(line);
		}
		bufferedReader.close();
		BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter("b.txt"));
		for(int i = list.size()-1; i >=0 ; i--){
			System.out.println(i);
			bufferedWriter.write(list.get(i));
			bufferedWriter.newLine();

		}
	}
}
