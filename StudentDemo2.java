package class1;

public class StudentDemo2 {

	public static void main(String[] args) {
		//如何调用构造方法呢？
		//通过new关键字调用
		//格式：类名 对象名 = new 构造方法（...）；
		Student2 s = new Student2();
		s.setAge(18);
		s.setName("杨幂");
		s.show();
		
		//public Student2(String name)
		Student2 s2 = new Student2("杨幂");
		s2.show();
		
		//public Student2(int age)
		Student2 s3 = new Student2(28);
		s3.show();
		
		//public Student2(String name,int age)
		Student2 s4 = new Student2("杨幂",28);
		s4.show();

	}

}
