package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class TestClass_6 {
	
	@Test
	public void test_14() {
		baseURI="http://www.dneonline.com/";
		given().get("");
	}

}
