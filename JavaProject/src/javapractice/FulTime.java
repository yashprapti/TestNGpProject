package javapractice;

public class FulTime extends Employee1 {

	public FulTime(String name, int paymentPerHour) {
		super(name, paymentPerHour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return paymentPerHour*8;
	}

}
