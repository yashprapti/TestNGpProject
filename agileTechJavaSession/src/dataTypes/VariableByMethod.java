package dataTypes;

public class VariableByMethod {
	
	int empID;
	String empName;
	int salary;
	int deptID;
	char nickname;
	
	public void setEmployeeDetails(int emid,String emname,int sal,int did,char nname) {
		empID = emid; 
		empName = emname;
		salary = sal;
		deptID =did;
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
		VariableByMethod obj1 = new VariableByMethod();
		obj1.setEmployeeDetails(101, "Ram", 10000, 1001, 'A');
		obj1.displayEmployeeDetails();
		
		System.out.println("---------------------------------------");
		
		
		VariableByMethod obj2 = new VariableByMethod();
		obj2.setEmployeeDetails(102, "Seeta", 20000, 1002, 'B');
		obj2.displayEmployeeDetails();

	}

}
