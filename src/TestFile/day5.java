package TestFile;

import java.io.File;

public class day5{
	public static void main(String[] args){
		String path="C:/Users/3646/Desktop/a.txt";
		File file=new File(path);
		//public String getAbsolutePath()：
		// 获取绝对路径
		file.getAbsolutePath();

		//public String getPath():
		// 获取路径
		//public String getName():
		// 获取名称
		//public long length():
		// 获取长度。字节数
		//public long lastModified():
		// 获取最后一次的修改时间，毫秒值
		//public String[] list():
		// 获取指定目录下的所有文件或者文件夹的名称数组
		//public File[] listFiles():
		// 获取指定目录下的所有文件或者文件夹的File数组


	}
}
