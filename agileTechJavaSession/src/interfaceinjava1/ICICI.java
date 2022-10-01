package interfaceinjava1;

public class ICICI implements RBI {

	@Override
	public void homeLoan() {
		System.out.println("ICICI Home loan interest rate is 8 %");
	}

	@Override
	public void cropLoan() {
		System.out.println("ICICI crop loan interest rate is 6 %");
		
	}

	@Override
	public void goldLoan() {

		System.out.println("ICICI gold loan interest rate is 12 %");
		
	}
	
	public void vehicleLoan() {
		
		System.out.println("ICICI vehicle loan interest rate is 14 %");
		
	}

}
