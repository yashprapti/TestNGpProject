package agileTech.testNGProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import suitepackage.SuiteMethods;

public class Annotations extends SuiteMethods {
	
	@BeforeClass
	public void method1() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void method2() {
		System.out.println("After class");
	}
	@BeforeTest
	public void sendUrl() {
		System.out.println("URL sent to Browser");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Browser Cloded");
	}
	
	@BeforeMethod
	public void provideData() {
		System.out.println("Data provided to the test");
	}
	
	@AfterMethod
	public void CleanData() {
		System.out.println("Data cleaned");
	}
	

	@Test (priority=1,groups="Regression")
	public void login()
	{
		System.out.println("login is successfull");
	}
	

	@Test(priority=1,groups="Smoke")
	public void signup() {
		System.out.println("signup is successfull");
	}

}
