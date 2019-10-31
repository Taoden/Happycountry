package TestIO;

import java.io.File;

public class day19{
	public static void main(String[] args){
		//递归:文件目录

		//1.创建目录
		File dir =new File("a.txt");
		//2.打印目录的子文件
		printSubFile(dir);
	}
	public  static  void  printSubFile(File dir){
		File[] files = dir.listFiles();
		for(File f:files){
			if(f.isDirectory()){
				printSubFile(f);
			}else {
				System.out.println(f.getAbsolutePath());
			}
		}
	}
}
