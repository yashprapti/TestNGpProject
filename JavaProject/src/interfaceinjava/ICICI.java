package interfaceinjava;

public class ICICI implements RBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void homeLoan() {
		System.out.println(" ICICI home loan interest is 7 %");
		
	}

	@Override
	public void cropLoan() {
		System.out.println(" ICICI crop loan interest is 6 %");
		
	}

	@Override
	public void goldLoan() {
		System.out.println(" ICICI gold loan interest is 14 %");
		
	}

}
