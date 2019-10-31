package TestFile;

import java.awt.*;
import java.io.File;

public class day1{
	public static void main(String[] args){
		//构造方法
		//File(String pathname)：
		// 根据一个路径得到File对象
		//1.java中需要加一个\,转义
		//2.改成反斜杠
		String path="C:\\Users\\13646\\Desktop\\a.txt";
		String path1="C:/Users/3646/Desktop/a.txt";
		File file =new File(path);
		System.out.println(file);

		//File(String parent, String child):
		// 根据一个目录和一个子文件/目录得到File对象
		File file1 =new File("C:/Users/3646/Desktop/a.txt","a");
		System.out.println(file1);
		//File(File parent, String child):
		// 根据一个父File对象和一个子文件/目录得到File对象
		File file2 =new File("C:/Users/3646/Desktop/a.txt");
		System.out.println(file2);


		//File表示一个文件或者路径


	}
}
