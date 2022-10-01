package testNGFramework2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteClass {
	
	@BeforeSuite
	public void SuitMethod1() {
		System.out.println("This is Before Suit");
	}
	
	@AfterSuite
	public void SuitMethod2() {
		System.out.println("This is After Suit");
	}

}
