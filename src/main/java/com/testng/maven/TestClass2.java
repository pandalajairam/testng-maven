package com.testng.maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {

	public TestClass2() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("Class 2 - Before Method will execute before every test method");
	}
	 
	@AfterMethod
	public void afterMethod() {
	System.out.println("Class 2 - After Method will execute after every test method ");
	}
	 
	@BeforeClass
	public void beforeClass() {
	System.out.println("Class 2 - Before Class will always execute prior to Before Method and Test Method ");
	}
	 
	@AfterClass
	public void afterClass() {
	System.out.println("Class 2 - After Class will always execute later to After Method and Test method");
	}
	 
	@BeforeTest
	public void beforeTest() {
	System.out.println("Class 2 - Before Test will always execute prior to Before Class, ,Before Method and Test Method ");
	}
	 
	@AfterTest
	public void afterTest() {
	System.out.println("Class 2 - After Test will always execute later to After Method, After Class ");
	}
	 
	@Test
	public void testCase1() {
	System.out.println("Class 2 - This is my First Test Case 1");
	}
	 
	@Test
	public void testCase2() {
	System.out.println("Class 2 - This is my Second Test Case 2");
	}

}
