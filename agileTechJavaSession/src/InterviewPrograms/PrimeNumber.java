package InterviewPrograms;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 7;
		
		boolean flag = true;
		
		for(int i=2;i<7;i++) {
			
			if(num%i==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime");
		}

	}

}
