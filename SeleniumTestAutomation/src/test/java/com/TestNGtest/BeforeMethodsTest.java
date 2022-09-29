package com.TestNGtest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class BeforeMethodsTest {
	

  WebDriver driver;
  @Test
  public void BasicTest() 
  {
	  driver.get("https://www.google.com");
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  
  }

}
