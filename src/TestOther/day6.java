package TestOther;


import java.util.Date;

public class day6{
	public static void main(String[] args){
		//Date
		//Date类的概述
		//类 Date 表示特定的时间，精确到毫秒。
		//构造方法
		//public Date()
		//public Date(long date)
		//成员方法
		//public long getTime()
		//public void setTime(long time)
		//获取当前
		Date data=new Date();
		System.out.println(data);

		//System.out.println(System.currentTimeMillis());
		//等效
		System.out.println(data.getTime());

		long  time =12312312312L;
		//把毫秒还原为日期
		Date date=new Date(time);

		date.setTime(time);

		System.out.println(date);
	}
}
