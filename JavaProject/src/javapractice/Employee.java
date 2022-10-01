package javapractice;

public class Employee {

	int empid;
	String empName;
	int salary;
	int deptNo;
	static String cname;

	/*
	 * Employee(int id, String name, int sal, int dNo) { empid = id; empName = name;
	 * salary = sal; deptNo = dNo; }
	 */

	public void setEmployeeDetails(int id, String name, int sal, int dNo) {
		empid = id;
		empName = name;
		salary = sal;
		deptNo = dNo;
		//cname = coname;
	}

	public void displayEmployee() {
		
		System.out.println(empid);
		System.out.println(empName);
		System.out.println(salary);
		System.out.println(deptNo);
		System.out.println(cname);

	}
	
	public void sampleMethod() {
		Employee obj2 = new Employee();
		obj2.setEmployeeDetails(102, "Seeta", 15000, 1000);
		obj2.displayEmployee();
	}

	public static void main(String[] args) {

		/*
		 * Employee obj1 = new Employee(); obj1.empid = 101; obj1.empName = "Ram";
		 * obj1.salary = 10000; obj1.deptNo = 1000; obj1.displayEmployee();
		 */
		/*
		 * Employee obj1 = new Employee(101,"RAM",10000,1000); obj1.displayEmployee();
		 */
		cname = "Wipro";
		Employee obj1 = new Employee();
		obj1.setEmployeeDetails(101, "Gopal", 10000, 1000);
		obj1.displayEmployee();
		obj1.sampleMethod();

	}

}
