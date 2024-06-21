package class1;
/*
 * Student是一个学生事物描述类，main方法不适合放在它里面。
 * 
 * 使用一个类，其实就是使用该类的成员。（成员变量和成员方法）
 * 而我们要想使用一个类的成员，就必须首先拥有该类的对象。
 * 我们如何拥有一个类的对象呢？
 * 		创建对象就可以了？
 * 我们如何创建对象呢？
 * 		格式：类名 对象名 = new 类名（）；
 * 对象如何访问成员呢？
 * 		成员变量：对象名.变量名
 * 		成员方法：对象名.方法名（...）
 */
public class StudentDemo1 {

	public static void main(String[] args) {
		//格式：类名 对象名 = new 类名（）；
		Student1 s = new Student1();
		//输出地址
		System.out.println("s: "+s);
		
		//直接输出成员变量
		System.out.println("姓名: "+s.name);
		System.out.println("年龄: "+s.age);
		System.out.println("------------------");
		//给成员变量赋值
		s.name = "杨幂";
		s.age = 28;
		
		//再次输出成员变量的值
		System.out.println("姓名: "+s.name);
		System.out.println("年龄: "+s.age);
		System.out.println("------------------");
		
		//调用成员方法
		s.study();
		s.eat();
		
		

	}

}
