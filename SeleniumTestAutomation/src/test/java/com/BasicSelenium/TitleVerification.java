package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8081/WebProject/index.html");
		
		String ExpectedTitle = "Mys Test Site";
		String ActualTitle = driver.getTitle();
		
		if (ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Title Passed");
		}
		else
		{
			System.out.print("Failed");
		}
	}

}
