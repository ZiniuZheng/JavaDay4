package class1;

public class PhoneDemo3 {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.brand = "OPPO";
		p.price = 2999;
		p.color = "白色";
		System.out.println("p: "+p);
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		
		Phone p2 = p;
		p2.brand = "魅族"; //把p的内存地址直接给了p2
		p2.price = 1999;
		p2.color = "蓝色";
		System.out.println("再次输出p: "+p);
		System.out.println("p2: "+p2);
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		System.out.println(p2.brand+"---"+p2.price+"---"+p2.color);

	}

}
