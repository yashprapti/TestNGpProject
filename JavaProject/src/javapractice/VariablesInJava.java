package javapractice;

public class VariablesInJava {
	
	int a = 20;
	
	
	public void method1() {
		int b = 50;
		System.out.println(a);
		System.out.println(b);
	}
	
	public void method2() {
		int b = 100;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		VariablesInJava obj1 = new VariablesInJava();
		//obj1.method1();
		obj1.method2();
         
	}

}
