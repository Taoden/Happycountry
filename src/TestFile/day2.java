package TestFile;

import java.io.File;
import java.io.IOException;

public class day2{
	public static void main(String[] args) throws IOException{
		//public boolean createNewFile():
		// 创建文件 如果存在这样的文件，就不创建了
		//public boolean mkdir():创建一个文件夹
		// 创建文件夹 如果存在这样的文件夹，就不创建了


		//public boolean mkdirs():创建多层文件夹
		// 创建文件夹,如果父文件夹不存在，会帮你创建出来
		//1.在指定的路径下创建一个文件
		File file =new File("C:/Users/3646/Desktop/a.txt");
		file.createNewFile();

		//注意事项：
		//如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。

	}
}
