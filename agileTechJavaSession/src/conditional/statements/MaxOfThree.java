package conditional.statements;

public class MaxOfThree {

	public static void main(String[] args) {
		
		// Write a java program to find maximum of three numbers
		
		int a = 15000;
		int b = 12000;
		int c = 10000;
		
		if(a>=b && a>=c) {
			System.out.println(a);
		}else if (b>a && b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}

}
