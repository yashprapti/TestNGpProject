package conditional.statements;

public class NestedForLoop {

	public static void main(String[] args) {

		aa: for (int i = 1; i <= 5; i++) {
			bb: for (int j = 1; j <= 5; j++) {
				System.out.print(i + " ");
				System.out.print(j);
				
				  if(i==2&&j==2) { 
				  System.out.println(i+"  "+j); 
				  break bb; 
				  }
				 
			}
			System.out.println();
		}

	}

}
