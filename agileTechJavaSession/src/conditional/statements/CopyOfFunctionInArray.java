package conditional.statements;

import java.util.Arrays;

public class CopyOfFunctionInArray {

	public static void main(String[] args) {

		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		for(int i=0;i<3;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("------------");
		
		int a2[] = Arrays.copyOf(a, 5);
		a2[3] = 40;
		a2[4] = 50;
		for(int i=0;i<a2.length;i++) {
			System.out.println(a2[i]);
		}
		
	}

}
