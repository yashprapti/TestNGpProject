package agileTech.selenium;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PetStroeRequest {

	
	@Test
	public void PostRequest() {
		//RestAssured.baseURI = "https://petstore.swagger.io/v2/pet";
		String userData = "{\"id\":1,\"category\":{\"id\":0,\"name\":\"string\"},\"name\":\"doggie\",\"photoUrls\":[\"string\"],\"tags\":[{\"id\":0,\"name\":\"string\"}],\"status\":\"available\"}";
		Response response = given()
		.auth().none()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.when()
		.body(userData)
		.post("https://petstore.swagger.io/v2/pet");
		System.out.println(response.statusCode());
		System.out.println(response.asString());
	
	}
	
	@Test
	public void getRequest() {
		Response response =given()
		.auth().none()
		.queryParam("h", "v8JGNo3gKw3mQmgro7uFlrZaCHffXciYdtinbhAdz7M=")
		.queryParam("u", "https://petstore.swagger.io/v2/pet/%7BID%7D ")
		.when()
		.body("")
		.get("https://clicktime.symantec.com/15uBnWVaoKeBYG7jU85cj");
		System.out.println(response.statusCode());
		System.out.println(response.asString());
	}
	
	
}
