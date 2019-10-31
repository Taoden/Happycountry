package TestFile;

import java.io.File;

public class day6{
	public static void main(String[] args){
		//案例:输出指定目录下指定后缀的文件名
		//需求：判断指定目录下是否有后缀名为.jpg的文件，
		// 如果有，就输出该文件名称
		String path="C:/Users/3646/Desktop/a.txt";
		File file=new File(path);

		String[] list = file.list();

		for(String s:list){
			if(s.endsWith(".jpg")){
				System.out.println(s);
			}
		}
	}
}
