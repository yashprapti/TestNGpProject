package methodsInJava;

public class ConstructorInJava {

	int empId;
	String empName;
	int age;
	String deptName;
	
	String compName;

	public ConstructorInJava(int empId, String empName,int age,String deptName) {
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.deptName = deptName;
	}
	
	public void set(String compName) {
		this.compName=compName;
	}

	public void display() {

		System.out.println("Employee Id Is : " + empId);
		System.out.println("Employee Name Is : " + empName);
		System.out.println("Employee age Is : " + age);
		System.out.println("Employee dept. name Is : " + deptName);
		System.out.println("Employee Comp. name Is : " + compName);

	}

	public static void main(String[] args) {

		// System.out.println("Values for obj");

		ConstructorInJava obj = new ConstructorInJava(10, "Ram",30,"CSE");
		obj.set("Wipro");
		obj.display();

		// System.out.println("Values for obj1");

		// ConstructorInJava obj1 = new ConstructorInJava();
		// obj1.display();

	}

}
