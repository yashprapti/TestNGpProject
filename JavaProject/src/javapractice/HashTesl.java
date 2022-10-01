package javapractice;

import java.util.HashSet;

public class HashTesl {

	public static void main(String[] args) {


		//HashSet set = new HashSet();
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("one");
		set.add("two");
		set.add("Three");
		set.add("four");
		set.add("five");
		
		System.out.println(set);
		
		set.remove("five");
		
		System.out.println(set);
		System.out.println(set.size());
		
		
		

	}

}
