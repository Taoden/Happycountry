package TestOther;

import java.util.Calendar;

public class day10{
	public static void main(String[] args){
		//判断是平年还是闰年
		int year=2018;

		//获取一个日历对象
		Calendar calendar=Calendar.getInstance();

		//
		calendar.set(year,2,1);
		//在日期的字段-1
		calendar.add(Calendar.DAY_OF_MONTH,-1);
		//求二月有几天？
		int day =calendar.get(Calendar.DAY_OF_MONTH);


	}
}
