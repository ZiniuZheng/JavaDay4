package class1;
/*
 * 成员变量和局部变量的区别：
 * 		A：在类中的位置不同
 * 			成员变量：类中，方法外
 * 			局部变量：方法中或者方法声明上（形式参数）
 * 		B：在内存中的位置不同
 * 			成员变量：堆内存
 * 			局部变量：栈内存
 * 		C：生命周期不同
 * 			成员变量：随着对象的创建而存在，随着对象的消失而消失
 * 			局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
 * 		D：初始化值的问题
 * 			成员变量：有默认值
 * 			局部变量：没有默认值。必须先定义，赋值，最后使用
 */

public class Variable {
	int x;
	
	public void show() {
		int y = 0;
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		Variable v = new Variable();
		v.show();
	}

}
