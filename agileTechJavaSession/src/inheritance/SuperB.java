package inheritance;

public class SuperB extends SuperA {
	
	SuperB(){
		System.out.println("Constructor of SuperB");
	}
	
	public  void m3() {
			
	}
	
	public void m4(int a,String b) {
		System.out.println("Inside m4");
	}

	public static void main(String[] args) {
		
		SuperB obj = new SuperB();
		
		
			}

}
