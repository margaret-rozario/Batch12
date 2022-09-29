package com.TestNGtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class AfterClassTest {
	WebDriver driver;
  @Test
  public void simpleTest() 
  {
	  driver.get("https://www.google.com");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Browser Lauching...");
	  driver = new FirefoxDriver();
	  System.out.println("BeforeMethod Execution Completed Successfully.");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println(driver.getTitle());
	  System.out.println("AfterMethod Execution Completed Successfully.");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("@BeforeClass Executing...");
	  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
	  System.out.println("Browser Configuration Completed.");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("@AfterClass Executing...");
	  driver.quit();
	  System.out.println("AfterClass Execution Completed Successfully.");
  }

}
