package methodsInJava;

public class ThisKeyword {

	public void method1() {
		
		System.out.println("Inside Method 1");
		
		this.method2();

	}

	public void method2() {
		
		System.out.println("Inside Method 2");

	}

	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword();
		ThisKeyword obj1 = new ThisKeyword();
		obj.method1();
		obj1.method1();
		
		
		
	}

}
