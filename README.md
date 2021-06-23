# RestAssured-Training
Rest Assured - Java Library or Java API for testing RESTful web services.
It is used to invoke REST web Services and check response 
Can be used to test XML as well as JSON based web services
It supports POST,GET,PU,DELETE,OPTIONS,PATCH and HEAd requests
Can be used to validate and verify the responses of these requests.
Rest Assured is implemented in Groovy
Uses BDD style for Testing - Given,When and Then

Prerequisite for Rest Assured
- Java
- IDE (Eclipse, IntelliJ)
- Maven
- TestNG

Project Creation 
- Create Maven Project
- Add Rest Assured Dependency under dependencies Tag in POM.xml
- Add TestNG Dependency under dependencies Tag in POM.xml
- Save
- Check Libraries added
- Add TestNG plugin in eclipse

Using https://reqres.in/ for Sample Requests

Creating 1st Test
- Create Class (src/test/java/tests/TestClass_1.java)

test_1()
RestAssured,Response is a class.Both class has many predifined methods.
Get the response by RestAssured.get() and put it in Response object
Then read response and assert

test_2()
Static import of RestAssured
import io.restassured.RestAssured; to import static io.restassured.RestAssured.*;
And Remove RestAssured.get() to get()
Use baseURI for the URI
Start with given() and get()
		   then() and add verifications
		   
TestClass_2.java (GET and POST)
test_3()
 - Simple Get Method example to validate Data or set of data

test_4()
 - Maps to create a request for PUT
 
test_5()
 - JSONObject to create JSON Body for PUT
 - gson,jackson,json,jsonsimple are few JSON Body Builders

TestClass_3.java (PUT,PATCH and DELETE)
test_6() PUT
test_7() PATCH
test_8() Delete

Create Fake RestAPI locally.
npm install -g json-server
json-server --watch db.json
Setup db.json

TestClass_4.java (Test on Local REST API)
test_8 - GET
test_9 - POST
test_10 - PUT
test_11 - PATCH
test_12 - DELETE

TestClass_5.java (How to Validate JSON Schema)




