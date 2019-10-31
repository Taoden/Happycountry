package TestOther;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class day9{
	public static void main(String[] args){
		//成员方法
		//public static Calendar getInstance()
		//public int get(int field)
		//注意:
		//获取月份时0：1月，1：2月，2：3月，以此类推
		//获取星期时1：周日，2：周一，。。。7：周六

		//Calendar是一个抽象类
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar);
		//公历
		GregorianCalendar gregorianCalendar=new GregorianCalendar();
		System.out.println(gregorianCalendar);



		Calendar calendar1=Calendar.getInstance();
		System.out.println(calendar1.get(Calendar.YEAR));
		//Calendar的add方法
		calendar1.add(Calendar.YEAR,1);//给年字段+1
		//Calendar的set方法
		calendar1.set(2019,2,2);


	}
}
