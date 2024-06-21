package class1;
/*
 * 学生类
 * 
 * 通过对象直接访问成员变量，会存在数据安全问题
 * 这个时候，我们就想能不能不让外界的对象直接访问成员变量呢？
 * 能
 * 如何实现？
 * -private关键字
 * 
 * private：
 * 		是一个修饰符
 * 		可以修饰成员变量，也可以修饰成员方法
 * 		被private修饰的成员只能在本类中被访问
 * 
 * 针对private修饰的成员变量，我们会相应的提供getXxx（）和setXxx（）用于获取和设置成员变量的值，方法用public修饰
 * 
 * 
 * 起名字我们要求做到见名知意，如果有局部变量名和成员变量名相同，在局部使用的时候，采用的是就近原则。
 * 
 * 有没有办法把局部变量的name赋值给成员变量的name呢？
 * -用this关键字就可以解决这个问题
 * 
 * this：代表所在类的对象引用
 * 		方法被哪个对象调用，this就代表哪个对象
 * 
 * 使用场景：
 * 		局部变量隐藏成员变量
 */
public class Student {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0||age>200) {
			System.out.println("你给的年龄有误");
		}else {
			this.age = age;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
