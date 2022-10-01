package dataTypes;

public class LocalVariable {
	
	static int b = 30;
	
	
	public void method1() {
		int a = 20;
		System.out.println(a);
		System.out.println(b);
	}
	public void method2() {
		System.out.println(b);
	}
	public static void main(String[] args) {
		LocalVariable obj1 = new LocalVariable();
		obj1.method1();
		obj1.method2();		
	}

}
