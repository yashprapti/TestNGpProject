package interfaceinjava1;

public abstract class Employee {
	
	int paymentPerHour;
	
	String empName;
	
	Employee (int paymentPerHour,String empName){
		this.paymentPerHour =paymentPerHour;
		this.empName = empName;
	}
	
	abstract int calculateSalary();

}
