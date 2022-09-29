package com.IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("C:\\Users\\sonal\\workspace\\SeleniumTestAutomation")+"\\src\\test\\resources\\Drivers.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/iframe");
		
		//Switch to iframe
		driver.switchTo().frame("mce_0_ifr");
		
		WebElement iFrame = driver.findElement(By.id("tinymce"));
		iFrame.clear();
		iFrame.sendKeys("Test Automation");
	}

}
