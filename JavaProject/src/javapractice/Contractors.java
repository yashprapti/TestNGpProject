package javapractice;

public class Contractors extends Employee1 {
	
	int workingHours;

	public Contractors(String name, int paymentPerHour,int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}

	@Override
	public int calculateSalary() {
		return paymentPerHour*workingHours;
		
	}

}
