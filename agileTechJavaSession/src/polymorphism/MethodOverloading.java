package polymorphism;

public class MethodOverloading {

	public static void method1(int a, String b) { // 2

		System.out.println("Inside method 1");
	}

	public static void main(int a) {
		System.out.println("Inside main method");
	}

	public static void main(int[] args) {

	}

	public static void main(String[] args) {

		method1(20,"Ram");

		main(20);

	}

}
