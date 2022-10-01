package methodsInJava;

public class EmployeeDetails {
	
	
	public static void employeeDetailsForm(String name,int age,String Adress,String Mob) {
		
		System.out.println("Name of Employee :"+name);
		System.out.println("Age of Employee :"+age);
		System.out.println("Adress of Employee :"+Adress);
		System.out.println("Mob No of Employee :"+Mob);
		
	}

	public static void main(String[] args) {
		employeeDetailsForm("RAM",25,"PUNE","987456123");
		employeeDetailsForm("Sita",28,"mumbai","987456456");
		employeeDetailsForm("Sham",30,"solapur","987456789");
	}

}
