package class1;
/*
 * 手机类的测试类
 */
public class PhoneDemo {

	public static void main(String[] args) {
		//创建对象
		Phone p = new Phone();
		
		//输出成员变量值
		System.out.println("品牌: "+p.brand);
		System.out.println("价格: "+p.price);
		System.out.println("颜色: "+p.color);
		System.out.println("---------------");
		
		//给成员变量赋值
		p.brand = "小米";
		p.price = 2999;
		p.color = "白色";
		
		//再次输出成员变量值
		System.out.println("品牌: "+p.brand);
		System.out.println("价格: "+p.price);
		System.out.println("颜色: "+p.color);
		System.out.println("---------------");
		
		//调用成员方法
		p.call("杨幂");
		p.sendMessage();
		p.sendMessage("杨幂");
		

	}

}
