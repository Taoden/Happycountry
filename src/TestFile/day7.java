package TestFile;

import java.io.File;
import java.io.FilenameFilter;

public class day7{
	public static void main(String[] args){
		//文件名称过滤器的概述
		//public String[] list(FilenameFilter filter)
		//public File[] listFiles(FileFilter filter)
		//文件名称过滤器的使用
		//需求：判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
		//源码分析
		//带文件名称过滤器的list()方法的源码（内部帮我们调用方法过滤）
		String path="C:/Users/3646/Desktop/a.txt";
		File file=new File(path);

		/*String[] list = file.list();
		for(String s:list){
			System.out.println(s);
		}
		*/
		String[] list = file.list(new FilenameFilter(){
			@Override
			public boolean accept(File dir, String name){
				return name.endsWith(".jpg");
			}
		});
		for(String s:list){
			System.out.println(s);
		}

	}
}
