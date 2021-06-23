package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class TestClass_2 {
	
	@Test
	public void test_3() {
		baseURI="https://reqres.in/api";
		given().
			get("/users?page=2").
		then().
			statusCode(200).
			body("data[4].first_name", equalTo("George")).
			body("data.first_name", hasItems("George","Rachel"));
	}
	
	@Test
	public void test_4() {
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("name", "Rachit");
		map.put("Job", "Tester");
		System.out.println(map);
		
		JSONObject request=new JSONObject(map);
		System.out.println(request);
		System.out.println(request.toJSONString());
	}
	
	@Test
	public void test_5() {
		JSONObject request=new JSONObject();
		request.put("name", "Rakesh");
		request.put("Job", "Software Engineer");
		System.out.println(request.toJSONString());
		baseURI="https://reqres.in/api";
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).
			log().all();
		
	}

}
