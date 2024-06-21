package class1;
//需求：调用Teacher的test方法

//类名作为形式参数：其实这里需要的是该类对象。

public class Test {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		Student4 s = new Student4();
		t.test(s);
		

	}

}
