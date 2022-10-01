package javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {

	public static void main(String[] args) {


		ArrayList al = new ArrayList();
		
		List al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		
		//ArrayList<String> al = new ArrayList<String>();
		
		//How to add data in an arraylist 
		
		al.add("India");
		al.add('Q');
		al.add(100);
		al.add(34.5);
		al.add(true);
		al.add(2, 500);
		al.addAll(al1);
		
		System.out.println(al);
		al.removeAll(al1);
		System.out.println(al);
		System.out.println(al.get(1));
		al.set(0, "Country");
		System.out.println(al.contains(500));
				
	}

}
