package interfaceinjava1;

public class Company {

	public static void main(String[] args) {


		Contract obj = new Contract(400,"Sham",5);
		int salary = obj.calculateSalary();
		System.out.println(salary);
		
		Employee obj1 = new FullTime(400,"Ram");

		int salary1 = obj1.calculateSalary();
		System.out.println(salary1);
	}

}
