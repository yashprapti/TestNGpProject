package collectioninjava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInJava {

	public static void main(String[] args) {

// How to declare arraylist
		
		ArrayList al = new ArrayList(); //Multy Datatype Value
		
		ArrayList al1 = new ArrayList();
		
		al1.add(10);
		al1.add(20);
		al1.add(30);
		
       ArrayList al11 = new ArrayList();
		
		//ArrayList<String> al = new ArrayList<String>(); // Only String can store
		
		//List al = new ArrayList(); //Multy Datatype Value
		
// How to store values in arraylist	-- add	
		
		al.add("Welcome");
		al.add("A");
		al.add(100);
		al.add(true);
		al.add(15.5);
		al.add(100);
		al.add(15.5);
		
		System.out.println(al.get(2));

		
		
			
		System.out.println("Inside al collection before set "+ al);
		System.out.println(al11.isEmpty());
		

	}

}
