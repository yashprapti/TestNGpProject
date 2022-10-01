package conditional.statements;

import java.util.Arrays;

public class SortFunctionInArray {

	public static void main(String[] args) {


		//int a[] = {1,89,45,78,46,100};
		
		char a[] = {'b','m','z','a','n'};
		int len = a.length;
		
		System.out.println("Array Before Sorting");
		
		for(int i=0;i<len;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("Array After Sorting");
		
		Arrays.sort(a);
		
		for(int i=0;i<len;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
