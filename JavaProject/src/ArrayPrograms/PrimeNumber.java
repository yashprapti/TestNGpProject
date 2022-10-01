package ArrayPrograms;

public class PrimeNumber {

	public static void main(String[] args) {


		int num = 13;
		
		boolean flag = false;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
			}
		if(flag) {
			System.out.println("Not Prime Number");
		}else {
			System.out.println("Prime Number");
		}
		}

	}


