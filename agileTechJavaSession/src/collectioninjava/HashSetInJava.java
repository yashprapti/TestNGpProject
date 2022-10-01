package collectioninjava;

import java.util.HashSet;

public class HashSetInJava {

	public static void main(String[] args) {

		HashSet obj = new HashSet();// Multy Datatype 

		//HashSet<String> obj = new HashSet<String>(); // String store
		
		obj.add("one");
		obj.add('A');
		obj.add(100);
		obj.add(45.25);
		obj.add(true);
		
		System.out.println(obj.isEmpty());
		System.out.println(obj.contains('a'));
		
		
		System.out.println(obj.size());
		
		obj.remove(100);
		
		System.out.println("Hashset values after remove : "+obj);
		System.out.println(obj.size());

	}

}
