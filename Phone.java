package class1;
/*
 * 手机类：
 * 		成员变量：品牌，价格，颜色...
 * 		成员方法：打电话，发短信...
 */
public class Phone {
	//品牌
	String brand;
	//价格
	int price;
	//颜色
	String color;
	
	//打电话
	public void call(String name) {
		System.out.println("给"+name+"打电话");
	}
	
	//群发短信
	public void sendMessage() {
		System.out.println("群发短信");
	}
	
	//私发短信
	public void sendMessage(String name) {
		System.out.println("给"+name+"发短信");
	}

}
