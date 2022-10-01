package InterviewPrograms;

public class FibonnaciSeries {

	public static void main(String[] args) {

// 0 1 1 2 3 5 8 13 21 34
		
		int a = 0;
		
		int b = 1;
		
		for(int i=1;i<=10;i++) {
			
			System.out.print(a+" ");
			
			int c = a+b;
			
			a=b;
			
			b= c;
			
		}

	}

}
