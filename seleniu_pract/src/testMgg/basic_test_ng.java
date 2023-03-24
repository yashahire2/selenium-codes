package testMgg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class basic_test_ng {
  @Test
  public void f() {
	  
	  System.out.println("test");
	  System.out.println("");
  }
  
  @Test
  public void g() {
	  System.out.println("ytest 2");
	  System.out.println("");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
	  System.out.println("");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
	  System.out.println("");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class ");
	  System.out.println("");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
	  System.out.println("");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
	  System.out.println("");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
	  System.out.println("");
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suit");
	  System.out.println("");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suit ");
	  System.out.println("");
  }

}
