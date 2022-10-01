package interfaceinjava;

public class SBI implements RBI {

	public static void main(String[] args) {
		
	}

	@Override
	public void homeLoan() {
		System.out.println(" SBI home loan interest is 8 %");
		
	}

	@Override
	public void cropLoan() {
		System.out.println(" SBI home loan interest is 4 %");
		
	}

	@Override
	public void goldLoan() {
		System.out.println(" SBI gold loan interest is 10 %");
		
	}

}
