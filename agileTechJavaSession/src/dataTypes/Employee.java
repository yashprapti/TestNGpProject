package dataTypes;

public class Employee {
	// Datatype variablename = value;

	int empID;
	String empName;
	int salary;
	int deptID;
	char nickname;

	public void displayEmployeeDetails() {

		System.out.println(empID);
		System.out.println(empName);
		System.out.println(salary);
		System.out.println(deptID);
		System.out.println(nickname);
	}

	public static void main(String[] args) {

		Employee obj1 = new Employee();
		obj1.empID = 100;
		obj1.empName = "RAM";
		obj1.salary = 10000;
		obj1.deptID = 1001;
		obj1.nickname = 'A';
		obj1.displayEmployeeDetails();

		System.out.println("------------------------------------------");

		Employee obj2 = new Employee();
		obj2.empID = 101;
		obj2.empName = "Seeta";
		obj2.salary = 20000;
		obj2.deptID = 1002;
		obj2.nickname = 'B';
		obj2.displayEmployeeDetails();

	}

}
