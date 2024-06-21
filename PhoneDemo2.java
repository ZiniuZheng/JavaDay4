package class1;

public class PhoneDemo2 {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.brand = "OPPO R7";
		p.price = 3999;
		p.color = "银色";
		System.out.println("p: "+p);
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		p.call("杨幂");
		p.sendMessage();
		
		Phone p2 = new Phone();
		p2.brand = "iPhone 15 Pro Max";
		p2.price = 13999;
		p2.color = "黑色";
		System.out.println("p2: "+p2);
		System.out.println(p2.brand+"---"+p2.price+"---"+p2.color);
		p2.call("迪丽热巴");
		p2.sendMessage();
	}

}
