package TestFile;

import java.io.File;

public class day4{
	public static void main(String[] args){
		//
		String path="C:/Users/3646/Desktop/a.txt";
		File file=new File(path);
	//public boolean isDirectory():判断是否是目录
		file.isDirectory();

		//public boolean isFile():判断是否是文件
		file.isFile();
		//public boolean exists():判断是否存在
		file.exists();
		//public boolean canRead():判断是否可读
		file.canRead();
		//public boolean canWrite():判断是否可写
		file.canWrite();
		//public boolean isHidden():判断是否隐藏
		file.isHidden();
	}
}
