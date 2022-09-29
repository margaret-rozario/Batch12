package com.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NormalAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("C:\\Users\\sonal\\workspace\\SeleniumTestAutomation")+"\\src\\test\\resources\\Drivers.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
		System.out.println(driver.switchTo().alert().getText());
		String inputText = "Selenium";
		driver.switchTo().alert().sendKeys(inputText);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		String Expected = "Toy entered: Selenium";
		String Output = driver.findElement(By.id("result")).getText();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		if (Expected.equals(Output))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Failed");
		}
	

	}

}
