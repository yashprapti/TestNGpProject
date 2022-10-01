package InterviewPrograms;

public class IncrementTraingle {

	public static void main(String[] args) {


		int n = 5;
		
		for(int i=1;i<=n;i++){ //1 2 3 4 5
			
			for(int j=i;j<=n;j++) { //1-5 ,2-5,3-5,4-5,5-5
				
				System.out.print("* ");
			}

			System.out.println();
			
		}

	}

}
