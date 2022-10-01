package suitepackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteMethods {
	
	@BeforeSuite
	public void suiteMethod1() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void suiteMethod2() {
		System.out.println("After Suite");
	}

}
