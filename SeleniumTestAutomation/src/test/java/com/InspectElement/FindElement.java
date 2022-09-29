package com.InspectElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("C:\\Users\\sonal\\workspace\\SeleniumTestAutomation")+"\\src\\test\\resources\\Drivers.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.opencart.com");
		
		WebElement Search=driver.findElement(By.cssSelector("#search > button"));
		Search.sendKeys("iphone");
		Search.clear();
		Search.sendKeys("Macbook");
		
		WebElement Search_btn=driver.findElement(By.id("search"));
		Search_btn.click();
		
		//Testing Apply
		String ExpectedTitle = "Search - iPhone";
		String ActualTitle = driver.getTitle();
		
		if (ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Result Page Success");
		}
		else
		{
			System.out.print("Failed" + ActualTitle);
		}
	}
}