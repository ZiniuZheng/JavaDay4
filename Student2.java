package class1;
/*
 * 构造方法：
 * 		给对象的数据进行初始化
 * 
 * 格式：
 * 		方法名和类名相同
 * 		没有返回值类型，连void都不能写
 * 		没有具体的返回值
 * 
 * 构造方法的注意事项：
 * 		A：如果我们没有给出构造方法，系统将会提供一个默认的无参构造方法供我们使用。
 * 		B：如果我们给出了构造方法，系统将不再提供默认的无参构造方法供我们使用。
 * 	这个时候，如果我们想使用无参构造方法，就必须自己提供。
 * 推荐：自己给无参构造方法
 * 		C：构造方法也是可以重载的
 * 
 * 成员变量赋值：
 * 		A：setXxx（）方法
 * 		B：带参构造方法
 */
public class Student2 {
	private String name;
	private int age;

	public Student2() {}
	public Student2(String name) {
		this.name = name;
	} //= setName()
	
	//构造方法可以重载（参数不同）
	public Student2(int age) {
		this.age = age;
	} //= setAge()
	
	public Student2(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name+"---"+age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
