package tests;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestClass_4 {

	@Test
	public void test_8() {
		baseURI="http://localhost:3000";
		given().
			get("/User").
		then().
			statusCode(200).
			log().all();
		
	}
	
	@Test
	public void test_9() {
		JSONObject obj=new JSONObject();
		obj.put("id",5);
		obj.put("First_Name", "Rajpal");
		obj.put("Last_Name", "Kumar");
		baseURI="http://localhost:3000";
		given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(obj.toJSONString()).
		when()
			.post("/User").
		then()
			.statusCode(201);
	}
	
	@Test
	public void test_10() {
		JSONObject obj=new JSONObject();
		obj.put("id",1);
		obj.put("First_Name", "Rachit1");
		obj.put("Last_Name", "Chandra");
		baseURI="http://localhost:3000";
		given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(obj.toJSONString()).
		when()
			.put("/User/1").
		then()
			.statusCode(200);
	}
	
	@Test
	public void test_11() {
		JSONObject obj=new JSONObject();
		obj.put("First_Name", "Rachit");
		baseURI="http://localhost:3000";
		given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(obj.toJSONString()).
		when()
			.patch("/User/1").
		then()
			.statusCode(200);
	}
	
	@Test
	public void test_12() {
		baseURI="http://localhost:3000";
		when()
			.delete("/User/5").
		then()
			.statusCode(200);
	}
}
