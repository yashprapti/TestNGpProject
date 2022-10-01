package conditional.statements;

import java.util.Arrays;

public class EqualsFunctionInArray {

	public static void main(String[] args) {


		int a[] = {1,89,45,78,46,100};
		
		int a1[] = {1,89,45,80,46,100};
		
		boolean flag = Arrays.equals(a, a1);
		
		System.out.println(flag);

	}

}
