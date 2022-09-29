package com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		WebElement FirstName = driver.findElement(By.name("firstname"));
		Dimension size = FirstName.getSize();
		System.out.println(size);
		
		String BgColor = FirstName.getCssValue("background-color");
		System.out.println(BgColor);
		
		
		boolean ExpectedSelection = true; 
		WebElement RadioButton = driver.findElement(By.cssSelector("#input-newsletter-no"));
		boolean ActualSelection = RadioButton.isSelected();
		
		if (ActualSelection=true)
		{
			System.out.println("Default Selected");
		}
		else
		{
		System.out.println("Default not selected; Failed");
		}

	}

}
