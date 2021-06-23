package tests;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestClass_3 {

	@Test
	/**
	 * PUT
	 */
	public void test_6() {
		JSONObject request=new JSONObject();
		request.put("name", "Rakesh");
		request.put("Job", "Software Engineer");
		
		baseURI="https://reqres.in";
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("/api/users/2").
		then().
			statusCode(200).
			log().all();
	}
	
	@Test
	/**
	 * PATCH
	 */
	public void test_7() {
		JSONObject request=new JSONObject();
		request.put("name", "Rakesh");
		request.put("Job", "Software Engineer");
		
		baseURI="https://reqres.in";
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			body(request.toJSONString()).
		when().
			patch("/api/users/2").
		then().
			statusCode(200).
			log().all();
	}
	
	@Test
	/**
	 * DELETE
	 */
	public void test_8() {
		baseURI="https://reqres.in";
		when().
			delete("/api/users/2").
		then().
			statusCode(204).
			log().all();
	}
}
