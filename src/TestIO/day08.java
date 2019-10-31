package TestIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class day08{
	public static void main(String[] args) throws IOException{
		//字节流读取中文
		//字节流读取中文的问题
		//字节流在读中文的时候有可能会读到半个中文,造成乱码
		//字节流写入中文的问题
		//字节流直接操作的字节,所以写出中文必须将字符串转换成字节数组
		//写出回车换行 write("\r\n".getBytes());

		FileOutputStream fileOutputStream=new FileOutputStream("a.txt");

		String s="你好，java世界";
		//把字符转成字节数组
		byte [] bytes =s.getBytes("UTF-8");
		fileOutputStream.write(bytes);

		fileOutputStream.close();
	}
}
