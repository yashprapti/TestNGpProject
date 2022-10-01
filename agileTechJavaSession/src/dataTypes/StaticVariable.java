package dataTypes;

public class StaticVariable {

	static int a;

	public void method1() {
		System.out.println("inside method 1");
	}

	public static void method2() {
		System.out.println("inside method 2");
	}

	public static void main(String[] args) {

		a=20;
		method2();
	}

}
