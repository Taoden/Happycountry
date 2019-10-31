package Testaggregate;

import java.util.ArrayList;
import java.util.List;

public class day25{
/*	public static void main(String[] args){
	//创建泛型集合
		List<String> list=new ArrayList<>();
	//泛型接口概述
		//把泛型定义在接口
		//定义格式
		//public interface 接口名<泛型类型>
		StudnetDao studnetDao=new StudnetDao();
		List<student> list1=studnetDao.getList();
		System.out.println(list1);


		//使用Dao


		DaoInterface<student> stduentDaoDaoInterface= new stduentDao();
		System.out.println(stduentDaoDaoInterface.findList());
	}*/
}
//获取学生信息
/*class StudnetDao{
		public  List<student> getList(){
			List<student> list =new ArrayList<student>();
			list.add(new student("lisi"));
			return list;
		}


}*/
//数据访问层接口
/*
interface DaoInterface<T>{
	public  List<T> findList();
}
class stduentDao implements DaoInterface<student>{

	@Override
	public List<student> findList(){
		return null;
	}
}*/
