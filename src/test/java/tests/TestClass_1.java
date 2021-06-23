package tests;

import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class TestClass_1 {
	
	@Test
	public void test_1() {
		//Response & RestAssured is a class from restassured
		//Works with Static import of RestAssured
		//import static io.restassured.RestAssured.*;
		Response response= get("https://reqres.in/api/users?page=2");
		
		//Work with non-static import of RestAssured
		//import io.restassured.RestAssured;
		//Response response= RestAssured.get("https://reqres.in/api/users?page=2");
		
		//Reading Status Code
		System.out.println(response.getStatusCode());
		
		//Getting Response Time
		System.out.println(response.getTime());
		
		//For getting body in readable format
		System.out.println(response.getBody().asString());
		//For getting body in readable format
		System.out.println(response.asString());
		
		//Getting Status Line
		System.out.println(response.getStatusLine());
		
		//Reading value for a particular type of Header
		System.out.println(response.getHeader("content-type"));
		
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println("_______________________________________________");
	}
	
	@Test
	public void test_2() {
		baseURI="https://reqres.in/api";
		given().
			get("/users?page=2").
		then().
			//Verifying the response code
			statusCode(200).
			//Verifying the value from response body
			body("data[1].id", equalTo(8)).
			//Log all get complete response
			log().all();
		System.out.println("_______________________________________________");
	}

}
