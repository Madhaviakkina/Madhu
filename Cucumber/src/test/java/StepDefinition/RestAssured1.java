package StepDefinition;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured1 {
	
	public static void main(String[] args) {
		
			RestAssured.baseURI="https://reqres.in/api/users/2";
			RequestSpecification httpRequest=RestAssured.given();
			Response resp=httpRequest.request(Method.GET);
			System.out.println(resp.getStatusCode());
			System.out.println(resp.getStatusLine());
	}

}
