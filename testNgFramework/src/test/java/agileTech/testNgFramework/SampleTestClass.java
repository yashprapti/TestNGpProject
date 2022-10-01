package agileTech.testNgFramework;

import org.testng.annotations.Test;

public class SampleTestClass {
	
	
	public void method1() {
		
	}
	
    @Test(groups="Smoke")
	public void method2() {
		System.out.println("Inside method");
	} 

}
