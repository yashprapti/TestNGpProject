package interfaceinjava1;

public class Contract extends Employee {
	
	int workingHours;

	Contract(int paymentPerHour, String empName,int workingHours) {
		super(paymentPerHour, empName);
		this.workingHours  = workingHours;
	}

	@Override
	int calculateSalary() {
		// TODO Auto-generated method stub
		return workingHours*paymentPerHour;
	}

	

}
