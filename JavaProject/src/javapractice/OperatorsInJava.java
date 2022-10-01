package javapractice;

public class OperatorsInJava {

	public static void main(String[] args) {
		// Bitwise Operator
		
		int x = 9;                   //  1001
		int y = 8;                  //   1000
		System.out.println(x&y);    //           1000 = 8
		System.out.println(x^y);    //            0001 = 1
		System.out.println(x|y);    //   1001 = 9
		
		// Logical Operators
		
		int a = 10;
		int b = 5;
		int c = 20;
		
		System.out.println(a<b && a<c); // false &&  true  == false
		System.out.println(a>b && b<c); // true &&  true == true
		System.out.println(a>b && b>c); // true && false ==  false
		
		System.out.println(a<b || a<c); // false ||  true  == true
		System.out.println(a>b || b<c); // true ||  true == true
		System.out.println(a>b || b>c); // true || false ==  true
		System.out.println(a<b || b>c); // false || false  == false
		
		// Shift Operators
		// Left shift <<
		
		int d = 20;
		System.out.println(d<<2); // 0000 0000 0000 0101 = 5
		                          // 00 0000 0000 0101 00 = 20 
		// formula for left shift: value * 2^no of shift  == 5*2^2 = 20 
		// 20 * 2^2 =  80 
		
		// Right Shift
		int e = 10;
		System.out.println(e>>2); // 0000 0000 0000 1010 = 10 --->
		                          // 00 0000 0000 0000 10 = 2
		// formula for right shift : value / 2^no of shift 
		// 10/2^2 = 10/4 = 2
		
		// assignment Operator
		int B =5;
		int A;
		A=B; // A= 5
		System.out.println(A); // 5
		System.out.println(A+=B); // A = A+B = 5+5 = 10
		System.out.println(A-=B); // A = A-B = 10-5 = 5
		System.out.println(A*=B); // A = A*B = 5*5 = 25
		System.out.println(A/=B); // A = A/B = 25/5 = 5
		System.out.println(A%=B); // A = A%B = 5%5 = 0
		
		
		// ternary operator -- Variable = Expression?  Expression1:Expression2
		int februaryDays = 29;
		String year;
		year = (februaryDays==29)?"Leap Year":"Not a Leap Year";
		System.out.println(year);
 
	}

}
