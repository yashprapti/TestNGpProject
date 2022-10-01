package javapractice;

public class JavaOperators {

	public static void main(String[] args) {
		// Bitwise Operator
		
		int x = 9;
		int y = 8;
		System.out.println(x&y); // 8
		System.out.println(x^y); // 1
		System.out.println(x|y); // 9
		
		// Logical Operators
		
		int a = 10;
		int b = 5;
		int c = 20;
		
		System.out.println(a<b&&a<c);//false&&true = false
		System.out.println(a>b&&b>c);// true && false = false
		System.out.println(a>b && b<c); // true && true = true
		
		System.out.println(a<b||a<c);//false&&true = true
		System.out.println(a>b||b>c);// true && false = true
		System.out.println(a>b || b<c); // true && true = true
		
		// shift Operator
		
		int d = 10;
		System.out.println(d<<2); // 40
		System.out.println(d<<3); // 80
		
		System.out.println(d>>2); // 2
		
		// Assignment Operators
		
		int B = 5;
		int A;
		A=B;
		System.out.println(A+=B);//10
		System.out.println(A-=B);//5
		System.out.println(A*=B);//25
		System.out.println(A/=B);//5
		System.out.println(A%=B);//0
	}

}
