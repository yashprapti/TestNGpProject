package conditional.statements;

public class PrintEvenNumbers {

	public static void main(String[] args) {


		for(int i =1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i+" is Even Value");
			}else {
				System.out.println(i+" is odd Value");
			}
		}
	}

}
