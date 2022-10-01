package javapractice;

public class ScopeOfVariable {
	
	String empname;
	int age ;
	int weight;
	int id ;
	static String cname;
	
	ScopeOfVariable(String ename,int agee,int weit,int idno, String coname) {
		empname=ename;
		age = agee;
		weight =  weit;
		id  = idno;
		cname = coname;
		
		
	}
	public void getmethod() {
		System.out.println(empname + age + weight + id + cname);
	
	}
	
	public static void main(String[] args) {
		
		System.out.println(cname);
		
		ScopeOfVariable obj1 = new ScopeOfVariable("Ram",65,11, 101,"Wipro");
		
		obj1.getmethod();
		
		ScopeOfVariable obj2 = new ScopeOfVariable("Seeta", 25, 50, 102,"Intel");
		
		obj2.getmethod();
		

	}

}
