package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class URLVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8081/WebProject/index.html");
		
		String ExpectedURL = "http://localhost:8081/WebProject/index.html";
		String ActualURL = driver.getCurrentUrl();
		
		if (ExpectedURL.equals(ActualURL))
		{
			System.out.println("URL Passed");
		}
		else
		{
			System.out.print("Failed");
		}
	}

}
