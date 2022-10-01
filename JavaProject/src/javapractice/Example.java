package javapractice;

public class Example extends MethodOverriding  {
	
	Example(){
		super();
		System.out.println("Inside Example Constructor");
		
	}
	public void m3() {
		super.m1();
		System.out.println("Inside method 3 of Example");
		
	}
	
	public void m4() {
		System.out.println("Inside method 4 of Example");
	}

	public static void main(String[] args) {
		
		Example obj = new Example();
		
	}

}
