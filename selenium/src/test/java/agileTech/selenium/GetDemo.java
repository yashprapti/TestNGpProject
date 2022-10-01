package agileTech.selenium;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static  io.restassured.RestAssured.given;

public class GetDemo {
	
	@BeforeSuite
	void setUp() {
		System.out.println("setUp");
	}
	
	@Test
	void getRequest() {
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api/users?page=2";
		given().when().get().then().log().all().statusCode(200);
	}
	
	@AfterSuite
	void tearDown() {
		System.out.println("teardown");
	}

}
