package class1;
import java.util.Scanner;

public class StudentDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("Please enter your name: ");
		String name = sc.nextLine();
		s.setName(name);
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		s.setAge(age);
		System.out.println("Your name is " + s.getName());
		System.out.println("Your age is " + s.getAge());
	}

}
