package Testoriented;

public class day2{
	/*练习:
	模仿上面学生的例子，写个手机类
	成员属性:品牌、价格.【属性一般是私有的，目的保证数据安全】
	构造方法:有参、无参.【构造方法的格式，public 无返回类型，类同名方法】
	成员属性的set/get方法
	成员方法:show显示所有属性信息*/
	private  String  brand;
	private  double  price;
	public  day2(){

	}
	public day2(String brand, double price){
		this.brand = brand;
		this.price = price;
	}

	public String getBrand(){
		return brand;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double price){
		this.price = price;
	}
	public  void  show(){
		System.out.println("品牌"+this.brand+"价格"+this.price);
	}

	@Override
	public String toString(){
		return super.toString();
	}
}
