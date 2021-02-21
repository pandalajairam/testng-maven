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
import org.testng.asserts.SoftAssert;

public class TestClass1 {
	
	SoftAssert softAssertion= new SoftAssert();
	public TestClass1() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("Class 1 - Before Method will execute before every test method");
	}
	 
	@AfterMethod
	public void afterMethod() {
	System.out.println("Class 1 - After Method will execute after every test method ");
	}
	 
	@BeforeClass
	public void beforeClass() {
	System.out.println("Class 1 - Before Class will always execute prior to Before Method and Test Method ");
	}
	 
	@AfterClass
	public void afterClass() {
	System.out.println("Class 1 - After Class will always execute later to After Method and Test method");
	}
	 
	@BeforeTest
	public void beforeTest() {
	System.out.println("Class 1 - Before Test will always execute prior to Before Class, ,Before Method and Test Method ");
	}
	 
	@AfterTest
	public void afterTest() {
	System.out.println("Class 1 - After Test will always execute later to After Method, After Class ");
	}
	 
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("The tests executing are "+System.getProperty("testng.test"));
		
	System.out.println("Before Suite will always execute prior to all annotations or tests in the suite");
	}
	 
	@AfterSuite
	public void afterSuite() {
	System.out.println("After suite will always execute at last when all the annotations or test in the suite have run.");
	}
	 
	@Test
	public void testCase1() {
	System.out.println("Class 1 - This is my First Test Case 1");
	softAssertion.assertTrue(true); 
	softAssertion.assertAll();
	}
	 
	@Test
	public void testCase2() {
	System.out.println("Class 1 - This is my Second Test Case 2");
	softAssertion.assertTrue(true); 
	softAssertion.assertAll();
	}

}
