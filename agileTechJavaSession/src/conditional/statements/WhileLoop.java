package conditional.statements;

public class WhileLoop {

	public static void main(String[] args) {
		// print 1-100 by for loop

		int a[] = { 10, 20, 30, 40, 50 };

		/*
		 * int i = 0; while (i < a.length) { System.out.println(a[i]); i++; }
		 */

		int i = 0;
		do {
			System.out.println(a[i]);
			i++;
		} while (i < a.length);

	}

}
