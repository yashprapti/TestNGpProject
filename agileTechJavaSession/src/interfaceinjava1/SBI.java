package interfaceinjava1;

public class SBI implements RBI {

	@Override
	public void homeLoan() {
		
		System.out.println("SBI Home loan interest rate is 6 %");
		
	}

	@Override
	public void cropLoan() {

		System.out.println("SBI crop loan interest rate is 4 %");
		
	}

	@Override
	public void goldLoan() {

		System.out.println("SBI gold loan interest rate is 10 %");
		
	}
	
	public void silverLoan() {
		
		System.out.println("SBI silver loan interest rate is 12 %");
		
	}

}
