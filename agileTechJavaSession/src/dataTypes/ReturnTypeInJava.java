package dataTypes;

public class ReturnTypeInJava {
	
	// addition , compare
	
	public static int Addition(int x, int y) {
		int z = x+y;
		return z;
	}
	
	public static boolean Compare(int x, int y) {
		
		if(x==y) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {


		 int addresult = Addition(10,20);
		 
		 System.out.println(addresult);
		 
		boolean compresult = Compare(10,20);
		
		System.out.println(compresult);
		

	}

}
