package com.TestNGtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BeforeClassTest {
	
	WebDriver driver;
	@Test
  public void BasicTest() 
  {
	  driver.get("https://www.google.com");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Browser Lauching...");
	  driver = new FirefoxDriver();
  }
  
  @org.testng.annotations.AfterMethod
  public void AfterMethod() 
  {
	 driver.quit();
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("@BeforeClass Executing...");
	  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
	  System.out.println("Browser Configuration Completed.");
  }

}
