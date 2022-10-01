package interfaceinjava1;

public class PNB implements RBI{

	@Override
	public void homeLoan() {
		System.out.println("PNB Home loan interest rate is 10 %");
		
	}

	@Override
	public void cropLoan() {
		System.out.println("PNB crop loan interest rate is 7 %");
		
	}

	@Override
	public void goldLoan() {
		System.out.println("PNB gold loan interest rate is 15 %");
		
	}

}
