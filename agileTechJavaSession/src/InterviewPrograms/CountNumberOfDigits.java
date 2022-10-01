package InterviewPrograms;

public class CountNumberOfDigits {

	public static void main(String[] args) {


		int num = 0000006; //12345,1234,123,12,1,0
		
		int count = 0;
		
		while(num>0) {
			num = num/10; // Removing last digit
			count++;
		}
		System.out.println("No. of Digits In a Number are : "+count);

	}

}









