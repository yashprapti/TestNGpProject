package agileTech.selenium;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CRUD {

	@Test
	public void getUser() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		given().queryParam("page", "2").body("").when().get().then().log().all().statusCode(200).body("page", equalTo(2));
	}
	
	@Test
	public void postRequest() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		String userData = "{\"name\":\"morpheus\",\"job\":\"leader\"}";
		given().body(userData).when().post().then().log().all().assertThat().statusCode(201);
	}
	
	@Test
	public void newPostRequest() {
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
