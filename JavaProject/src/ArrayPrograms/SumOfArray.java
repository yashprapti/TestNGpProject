package ArrayPrograms;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,60,70};
		
		int sum = 0;
		
		for(int b:a) {
			sum = sum+b;
		}
		
		System.out.println(sum);

	}

}
