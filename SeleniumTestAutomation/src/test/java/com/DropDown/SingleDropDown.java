package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//Find Drop Down
		WebElement DropDownElementDay = driver.findElement(By.name("birthday_day"));
		
		//Create Object foe Select Class
		Select DropDownDay = new Select(DropDownElementDay);
		
		
		boolean SingleorMultiple = DropDownDay.isMultiple();
		if(SingleorMultiple)
		{
			System.out.println("DropDown is multi-value dropdown");
		}
		else
		{
			System.out.println("DropDown is single-value dropdown");
		}
		//Select Date From DropDown
		DropDownDay.selectByIndex(10);
		
		//Get all values and store it in a list 
		List<WebElement> allElements = DropDownDay.getOptions();
		System.out.println("Values Present in DropDwon");
		for (WebElement element : allElements)
		{
			System.out.println(element.getText());
		}
		
		//Verify the particular value present 
		List<WebElement> allElements2 = DropDownDay.getOptions();
		System.out.println("Values Present in DropDwon");
		for (WebElement element : allElements2)
		{
			String DropDownValues = element.getText();
			if (DropDownValues.equals("Day"))
			{
				System.out.println("Day Present in DropDown");
			}
		}
		
		

	}

}
