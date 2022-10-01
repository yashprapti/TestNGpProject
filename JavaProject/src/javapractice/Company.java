package javapractice;

public class Company {

	public static void main(String[] args) {
		
		Employee1 obj = new Contractors("Test",300,4);
		int salary = obj.calculateSalary();
		System.out.println(salary);
		Employee1 obj1 = new FulTime("sham",300);
		salary = obj1.calculateSalary();
		System.out.println(salary);
		
	}

}
