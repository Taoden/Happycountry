package TestFile;

import java.io.File;

public class day3{
	public static void main(String[] args){


		//重命名注意事项
		//如果路径名相同，就是改名。
		//如果路径名不同，就是改名并剪切。
		//重命名和删除功能
		//public boolean renameTo(File dest):
		// 把文件重命名为指定的文件路径
		String path="C:/Users/3646/Desktop/a.txt";
		File file =new File(path);
		File file2 =new File("C:/Users/3646/Desktop/hello.txt");

		file.renameTo(file2);//重命名

		//public boolean delete():
		// 删除文件或者文件夹
		File file1=new File(path);
		file1.delete();//
		//Java中的删除不走回收站。
		//要删除一个文件夹，
		// 请注意该文件夹内不能包含文件或者文件夹

	}
}
