package TestIO;

import java.io.*;

public class day7{
	public static void main(String[] args) throws IOException{
		// BufferedOutputStream的
		// flush和close方法的区别

		//1.把a文件的内容拷贝到b文件
		FileInputStream fileInputStream =new FileInputStream("a.txt");
		BufferedInputStream bufferedInputStream =new BufferedInputStream(fileInputStream);

		FileOutputStream fileOutputStream =new FileOutputStream("a.txt");
		BufferedOutputStream bufferedOutputStream =new BufferedOutputStream(fileOutputStream);
		int b=0;
		while((b=bufferedInputStream.read())!=-1){
			bufferedOutputStream.write(b);//内部会写8KB数据
		}
		bufferedOutputStream.flush();//关闭流并刷新缓冲区

	}
}
