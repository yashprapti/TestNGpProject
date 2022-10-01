package conditional.statements;

public class ArrayInJava {

	public static void main(String[] args) {

		int[] a = new int[5]; // Single dimensional Array -- Array Declaration
		a[0] = 10; // setting value in the array
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		

// how to read values of array

		/*
		 * for (int i = 0; i < 5; i++) { System.out.println(a[i]); }
		 */

		for (int b : a) {
			System.out.println(b);
		}

	}

}
