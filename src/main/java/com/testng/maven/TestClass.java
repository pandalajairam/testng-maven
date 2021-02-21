package com.testng.maven;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass extends BaseClass {
  @Test
  public void f() {
	  System.out.println("In the test method");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Test Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Test After class");
  }

}
