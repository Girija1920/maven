package rest_api;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class data_validation {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification req = RestAssured.given();
		
		Response res = req.get("/api/users/23");
		
		String str = res.asString();
		
		System.out.println(str);
		
		int code = res.getStatusCode();
		
		System.out.println(code);
		
		Assert.assertEquals(code, 404);
		
		System.out.println("success");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
