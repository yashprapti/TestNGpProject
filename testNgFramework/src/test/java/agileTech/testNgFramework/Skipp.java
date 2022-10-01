package agileTech.testNgFramework;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class Skipp {
	
	@Test(groups="Smoke")
	public void method1() {
		System.out.println("Inside method 1");
	}
	@Test(groups="Regression")
	public void method2() {
		System.out.println("Inside method 2");
	}
	@Test(groups= {"Smoke","Regression"})
	public void method3() {
		System.out.println("Inside method 3");
	}
	
	@Test(groups="Sanity")
	public void method4() {
		System.out.println("Inside method 4");
	}
	@Test(groups= {"Sanity","Regression"})
	public void method5() {
		System.out.println("Inside method 5");
	}
	@Test(groups= {"Sanity","Regression","Smoke"})
	public void method6() {
		System.out.println("Inside method 6");
	}

}
