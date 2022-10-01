package InterviewPrograms;

public class MaxOfArray {

	public static void main(String[] args) {

		int a[] = {40,20,20,30,30,10,5};
		
		int max = a[0];
		

		for(int i=1;i<a.length;i++) {
				if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println("Max Value in an Array is "+max);
	}

}
