package com.testng.restassured;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemoRestAssured {
	
	@Test
	public static void getWeatherDetails()
	{
		//System.out.println("Starting the GET test");
		//Specify Base URI
		//RestAssured.baseURI = "https://gorest.co.in/public-api/users";
		RestAssured.baseURI ="https://samples.openweathermap.org/data/2.5/";
		




		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.queryParam("q", "London,UK")
				.queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").get("/weather");
		
		String jsonString = response.asString();
		JsonPath json = response.jsonPath();
		System.out.println(jsonString);
		System.out.println(json.get("weather[0].description").toString());
		Assert.assertEquals(jsonString.contains("London"), true);
		
		//JsonPath json = RestAssured.given().get("/123").then().statusCode(200).extract().jsonPath();
		//System.out.println(RestAssured.given().get("/123").then().extract().response().jsonPath().get("code"));
		
		//System.out.println(json.getString("code"));

		//Response Object
		//Response response = httpRequest.request(Method.GET,"/123");
		//Response response = httpRequest.get("/123");
		//System.out.println("Content type:"+response.contentType()+"\ngetContentType:"+response.getContentType()+"\nHeaders:"+response.headers());
		
/*		Headers allHeaders = response.headers();
		for(Header header:allHeaders)
		{
			System.out.println(header.getName()+":::"+header.getValue());
		}*/
		//Parse the response from the server
		//String responseBody = response.getBody().asString();
		//System.out.println("Response body is "+responseBody);
	}
	
	@Test
	public static void postRequest()
	{
		System.out.println("Starting the POST test");
		//Specify Base URI
		RestAssured.baseURI = "https://gorest.co.in/public-api/users";

		//Request payload to send along with the post request
		RequestSpecification httpRequest = RestAssured.given();
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("username", "Jairam");
		jsonObject.put("password", "Pandala");
		
		System.out.println("To String "+jsonObject.toString());
		System.out.println("Json String "+jsonObject.toJSONString());
		

		//Response Object
		//Response response = httpRequest.request(Method.GET,"/123");
		
		
		
		//Parse the response from the server
		//String responseBody = response.getBody().asString();
		//System.out.println("Response body is "+responseBody);
		
	}
	
	public void restAssured_BDD()
	{
		RestAssured.baseURI = "https://gorest.co.in/public-api";
		//RestAssured.given().queryParam("users", "123").when().get("123").then().statusCode(200).bo
	}
	
	public static void main(String[] args)
	{
		getWeatherDetails();
	}

}
