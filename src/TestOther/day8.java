package TestOther;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class day8{
	public static void main(String[] args) throws ParseException{
		//计算自己来到这个世界多少天
		String birth ="1998-09-26";
		String now ="2019-10-07";

		//计算两个时间的毫秒差
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Date date=simpleDateFormat.parse(birth);
		Date date1=simpleDateFormat.parse(now);
		//算毫秒差
		long data=	date1.getTime()-date.getTime();
		//算天数
		long day=data/1000/60/60/24;
		System.out.println(day);
	}
}
