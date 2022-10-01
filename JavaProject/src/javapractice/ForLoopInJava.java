package javapractice;

public class ForLoopInJava {

	public static void main(String[] args) {

//		for (int i=1; i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}

		/*
		 * for(int i=1;i<=100;i++) { if(!(i%2==0)) { System.out.println(i +
		 * " Is odd value"); } }
		 */

		int i = 123456;
		int rev = 0;
		for (; i > 0;) {
			int rem = i%10;
			rev = rev*10+rem;
			i = i/10;
		}
		System.out.println(rev);
		
	}

}
