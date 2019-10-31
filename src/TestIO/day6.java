package TestIO;

import java.io.*;

import static java.lang.System.in;

public class day6{
	public static void main(String[] args) throws IOException{
		//BufferedInputStream和BufferedOutputStream
		//BufferedInputStream会一次性从文件中读取8192个(8Kb),
		// 存在缓冲区中,
		// 返回给程序
		//创建缓冲输入流
		FileInputStream fileInputStream=new FileInputStream("a.txt");
		BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
		//创建缓冲输出流
		FileOutputStream fileOutputStream =new FileOutputStream("a.txt");
		BufferedOutputStream bufferedOutputStream =new BufferedOutputStream(fileOutputStream);

		//3.输入流读数据、输出流写数据
		//
		int b=0;
		while((b=bufferedInputStream.read())!=-1){
			bufferedOutputStream.write(b);//内部会写8KB数据
		}
		//内部会关文件流，缓冲流需自己关闭
		bufferedInputStream.close();//内部会关文件流
		bufferedOutputStream.close();
	}
}
