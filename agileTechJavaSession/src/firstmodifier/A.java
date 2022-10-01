package firstmodifier;

public class A {
	
	 int a;
	
	 protected void m1() {
		System.out.println("Inside m1 of class A");
	}

	public static void main(String[] args) {
		
		A obj = new A();
		obj.a=20;
		System.out.println(obj.a);
		obj.m1();
	}

}
