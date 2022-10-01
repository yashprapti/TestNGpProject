package InterviewPrograms;

public class SumOfDigits {

	public static void main(String[] args) {


		int num = 12345678;
		
		int sum = 0;
		
		while(num>0) {//1234,123,12,1
			int rem = num%10;//4,3,2,1
			sum= sum+rem;//0+4=4+3=7+2=9+1=10
			num=num/10;//123,12,1,0
		}
		System.out.println("Sum of digits in of a Given Number is: "+sum);

	}

}
