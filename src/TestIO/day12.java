package TestIO;

import java.io.FileWriter;

public class day12{
	public static void main(String[] args){
		//字符流
		//1.使用FileReader读取字符
		//原理：先读字节，把字节转成字符（byte->char）
		//2.使用FileWriter
		//原理:writer(String str),str转成 字符数组 转成 字节写入文件
		//（String->char[] ->char->byte）
		//如果是读取文本文件，使用FileReader比较好，不用考虑乱码问题
		//如果是写入文本文件，直接使用FileOutputStream好一点。

	}
}
