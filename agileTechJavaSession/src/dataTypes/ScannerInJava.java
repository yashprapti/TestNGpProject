package dataTypes;

import java.util.Scanner;

public class ScannerInJava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Value");
		int x = sc.nextInt();
		System.out.println("Enter The Second Value");
		int y = sc.nextInt();
		int z = x+y;
		System.out.println(z);
		
	}

}
