package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestOne {
	
	@Test
	public void test_1() {
		Response res=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.getStatusCode());
		System.out.println(res.getBody().asString());
		System.out.println(res.asString());
	}
	
	

}
