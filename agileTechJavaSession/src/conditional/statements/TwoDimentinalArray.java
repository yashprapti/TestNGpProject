package conditional.statements;

public class TwoDimentinalArray {

	public static void main(String[] args) {

		int a[][] = new int[3][2]; // Declaration

		a[0][0] = 10; // Setting of value
		a[0][1] = 20;

		a[1][0] = 30;
		a[1][1] = 40;

		a[2][0] = 50;
		a[2][1] = 60;

		// How to read the value Classic for loop

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		for (int arr[] : a) {
			for (int b : arr) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

}
