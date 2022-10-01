package agileTech.testNgFramework;

public class ExceptionInJava {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 50;
		System.out.println(a+b);
		
		try {
			System.out.println(c/0);
		}
		
		finally {
			System.out.println(a*b);
			System.out.println(b-a);
		}
				
	}
}
