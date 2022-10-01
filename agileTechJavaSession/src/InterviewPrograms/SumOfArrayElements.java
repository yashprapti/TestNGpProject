package InterviewPrograms;

public class SumOfArrayElements {

	public static void main(String[] args) {


		int a[] = {10,20,150,40,50}; // 150
		
		int sum = 0; //10 30 60 100 150
		
		for(int b:a) {
			sum = sum+b; //0+10 =10,10+20 = 30,30+30=60,60+40=100,100+50=150
		}
		
		System.out.println("Sum of Array Elements Is : "+sum);

	}

}
