package conditional.statements;

import java.util.Arrays;

public class ArrayRevision {

	public static void main(String[] args) {


		int arr[] = {50,40,30,20,10,5};
		
		int l = arr.length;
		
		int arr1[] = Arrays.copyOf(arr, l+1);
		arr1[l] = 2;
		
		for(int b: arr1) {
			System.out.print(b+" ");
		}
		
		

	}

}
