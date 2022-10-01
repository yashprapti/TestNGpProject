package interfaceinjava1;

public class FullTime extends Employee {

	FullTime(int paymentPerHour, String empName) {
		super(paymentPerHour, empName);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calculateSalary() {
		// TODO Auto-generated method stub
		return paymentPerHour*8;
	}

}
