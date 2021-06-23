package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import org.testng.annotations.Test;

public class TestClass_5 {
	

	@Test
	public void test_13() {
		baseURI="https://reqres.in";
		given()
			.get("/api/users?page=2").
		then()
			.assertThat().body(matchesJsonSchemaInClasspath("schema.json"))
			.statusCode(200)
			.log().all();
	}
}
