package agileTech.testNGProject;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class GropsIntESTng {
	
	@Test(groups="Regression")
	public void test1() {
		System.out.println("Inside Test 1");
	}
	@Ignore
	@Test(groups="Smoke")
	public void test2() {
		System.out.println("Inside Test 2");
	}
	@Test(groups= {"Regression","Smoke"})
	public void test3() {
		System.out.println("Inside Test 3");
	}
	@Test(groups= {"Sanity","Smoke"})
	public void test4() {
		System.out.println("Inside Test 4");
	}
	@Test(groups="Sanity")
	public void test5() {
		System.out.println("Inside Test 5");
	}

}
