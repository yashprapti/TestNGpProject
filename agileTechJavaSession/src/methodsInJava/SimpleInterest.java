package methodsInJava;

public class SimpleInterest {
	
	public static void simpleInterestCal(String name,int P,int R,int T) {
		int A;
		A = P*(1 + R*T);
		System.out.println("For User :" + name + ": " + A);
	}

	public static void main(String[] args) {


		simpleInterestCal("RAM",10000,10,5);
		
		simpleInterestCal("SHAM",20000,8,15);
		
		simpleInterestCal("Gita",25000,5,20);
	
	}

}
