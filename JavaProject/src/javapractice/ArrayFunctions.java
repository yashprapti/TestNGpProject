package javapractice;

import java.util.Arrays;

public class ArrayFunctions {
	
	public static void main(String[] args) {
		
		


		int a[] = {10,20,30,40,50};
		
		int len = a.length;
		
		for(int b:a) {
			System.out.println(b);
		}
		
		int a1[] = Arrays.copyOf(a, len+1);
		a1[len] = 60;
		
		for(int b:a) {
			System.out.println(b);
		}

	}

}
