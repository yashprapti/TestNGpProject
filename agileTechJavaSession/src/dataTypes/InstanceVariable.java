package dataTypes;

public class InstanceVariable {
	
	int a;
	
	public void method1() {
		System.out.println(a);
	}
	
	public void method2() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		InstanceVariable obj1 = new InstanceVariable();
		obj1.a = 20;
		obj1.method1();
		obj1.method2();
	}
	
}
