package dataTypes;

public class VariableByContructor {

	int empID;
	String empName;
	int salary;
	int deptID;
	char nickname;

	VariableByContructor(int emid, String emname, int sal, int did, char nname) {

		empID = emid;
		empName = emname;
		salary = sal;
		deptID = did;
		nickname = nname;

	}

	public void displayEmployeeDetails() {
		System.out.println(empID);
		System.out.println(empName);
		System.out.println(salary);
		System.out.println(deptID);
		System.out.println(nickname);
	}

	public static void main(String[] args) {

		VariableByContructor obj1 = new VariableByContructor(101, "Ram", 10000, 1001, 'A');
		obj1.displayEmployeeDetails();

	}

}
