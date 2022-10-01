package javapractice;

public abstract class Employee1 {
	
	String name;
	int paymentPerHour;
	
	public Employee1(String name,int paymentPerHour) {
		this.paymentPerHour =paymentPerHour;
		this.name=name;
	}
	
	public abstract int calculateSalary();
}
