package javapractice;

public class ConstructorInJava {
	
	int empId;
	String empName;
	int age;
	String deptName;
	
	ConstructorInJava(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
	
     ConstructorInJava(String age,int deptName){
		
	}
     
     public void m1() {
    	 System.out.println("Inside m1");
    	 this.m2();
     }
     
     public void m2() {
    	 System.out.println("Inside m2");
     }
     
     public void display() {
    	 System.out.println("Employee Id Is : "+empId);
    	 System.out.println("Employee Name Is : "+empName);
    	 System.out.println("Employee age Is : "+age);
    	 System.out.println("Employee department Is : "+deptName);
     }
	

	public static void main(String[] args) {

		ConstructorInJava obj = new ConstructorInJava(10,"Ram");
		obj.m1();
	}

}
