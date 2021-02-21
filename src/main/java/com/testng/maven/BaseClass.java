package com.testng.maven;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseClass {

  @BeforeClass
  public void beforeClass() {
	  System.out.println("In the Base class Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("In the Base class After class");
  }

  /*@BeforeTest
  public void beforeTest() {
	  System.out.println("In the Base class Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("In the Base class After Test");
  }*/

}
