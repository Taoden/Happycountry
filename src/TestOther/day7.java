package TestOther;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class day7{
	public static void main(String[] args) throws ParseException{
		//SimpleDateFormat类实现日期和字符串的相互转换

		//1.获取当前日期
		Date date=new Date();
		System.out.println(date);

		//创建一个日期格式化对象
		//大写的HH表示24小时进制
		//小写的hh表示12小时进制
		//a表示上午
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy:MM:dd  HH:mm:ss");
		//多态写法
		DateFormat dateFormat=new SimpleDateFormat("yyyy:MM:dd  HH:mm:ss");

		String s =simpleDateFormat.format(date);
		System.out.println(s);


		//把字符串转成Date类型
		String str ="2018年02月02日 10:24;21";
		SimpleDateFormat simpleDateFormat1 =new SimpleDateFormat("yyyy:MM:dd  HH:mm:ss");
		Date date1=simpleDateFormat1.parse(str);

		//获取毫秒数
		System.out.println(date1.getTime());
		System.out.println(date1);

	}
}
