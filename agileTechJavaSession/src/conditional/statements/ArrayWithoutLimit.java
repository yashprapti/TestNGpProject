package conditional.statements;

public class ArrayWithoutLimit {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 45, 78, 54, 78};
		
		int a1[][] = {{1,2,3},{4,5,6},{7,8,9}};

		int len = a.length;
		int len1 = a1.length;

		System.out.println(len);

		/*
		 * for (int i = 0; i < len; i++) { System.out.print(a[i] + " "); }
		 */
		
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len1; j++) {
				System.out.print(a1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
