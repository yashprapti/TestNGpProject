package agileTech.testNgFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testNGFramework2.SuiteClass;

public class SampleClass11 extends SuiteClass {
	
	@BeforeClass
	public void test1() {
		System.out.println("Inside Test 1");
	}
	
	@AfterClass
	public void test2() {
		System.out.println("Inside Test 2");
	}
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("Browser succefully opened");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Browser succefully closed");
	}
	
	@BeforeMethod
	public void provideData() {
		System.out.println("Data is Provided");
	}
	
	@AfterMethod
	public void cleanData() {
		System.out.println("Data is Cleaned");
	}
	
	@Test(groups="Smoke")
	public void login()
	{
		System.out.println("login is successfull");
	}
	
		
	}
