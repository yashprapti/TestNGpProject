package dataTypes;

public class StativVariableSeconPart {
	
	int empID;
	String empName;
	int salary;
	int deptID;
	static String coname;
	
	public void setEmployeeDetails(int emid,String emname,int sal,int did) {
		empID = emid; 
		empName = emname;
		salary = sal;
		deptID =did;
	
	}
	public void displayEmployeeDetails() {
		System.out.println(empID);
		System.out.println(empName);
		System.out.println(salary);
		System.out.println(deptID);
		System.out.println(coname);
	}


	public static void main(String[] args) {
		
		StativVariableSeconPart obj1 = new StativVariableSeconPart();
		obj1.setEmployeeDetails(100, "Ram", 10000, 1001);
		obj1.displayEmployeeDetails();
		
		StativVariableSeconPart obj2 = new StativVariableSeconPart();
		obj2.setEmployeeDetails(101, "Seeta", 15000, 1002);
		obj2.displayEmployeeDetails();

	}

}
