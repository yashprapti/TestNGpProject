package conditional.statements;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter The Number");
		
		int num = sc.nextInt();
		
		int num1 = num;
		int rev = 0;
		
		for(;num>0;) { //num = 123456 // 12345 // 1234 //123//12 //1
			int rem = num%10;// rem =6 // 5 //4 //3//2//1
			rev = rev*10+rem; // rev = 0*10+6 = 6 // 6*10+5 = 65//65*10+4 =654//654*10+3=6543//6543*10+2
			//65432//65432*10+1 =654321
			num = num/10; // num = 12345 // 1234 //123//12//1//0
		}
		System.out.println(rev);
				
	}

}
