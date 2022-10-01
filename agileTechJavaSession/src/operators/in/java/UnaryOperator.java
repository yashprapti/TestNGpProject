package operators.in.java;

public class UnaryOperator {

	public static void main(String[] args) {
		// Unary operator exp++,exp--,++exp,--exp,~,!
		// ++ increment the value of variable by 1 
		// -- decrease the value variable by 1
		// ~ Negate the variable
		// ! not -- reverse the variable// invert the variable --- boolean
		
		int a = 5;
		boolean b = false;
		//System.out.println(a++); // post fix  10
		//System.out.println(a); // 11
		//System.out.println(++a); // prefix 11
		//System.out.println(a);    // 11

		//System.out.println(a--); // post fix 10
		//System.out.println(a);  // 9
		
		// System.out.println(--a);  // prefix 9
		// System.out.println(a);    // 9
		
		System.out.println(~a); // (-var)-1 = (-10)-1 = -11 // (-(-10))-1 = 9
		System.out.println(!b); // false // true
		
	}

}
