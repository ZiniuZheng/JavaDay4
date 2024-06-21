package class1;
/*
 * 标准类的写法
 * 
 * 学生类
 * 
 * 使用双星号注释，当光标移动到变量是可以显示注释
 * 
 */
public class Student3 {
	/**姓名*/
	private String name;
	/**年龄*/
	private int age;
	
	/**构造方法*/
	public Student3() {}
	
	/**构造方法*/
	public Student3(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	/**给姓名赋值*/
	public void setName(String name) {
		this.name = name;
	}
	
	/**获取姓名*/
	public String getName() {
		return name;
	}
	
	/**给年龄赋值*/
	public void setAge(int age) {
		this.age = age;
	}
	
	/**获取年龄*/
	public int getAge() {
		return age;
	}

}
