package com.IFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlliFRame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("C:\\Users\\sonal\\workspace\\SeleniumTestAutomation")+"\\src\\test\\resources\\Drivers.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/guru99home");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		int size = driver.findElements(By.tagName("iFrame")).size();
		for (int i=0; i<=size; i++)
		{
			driver.switchTo().frame(i);
			int total = driver.findElements(By.xpath("/html/body")).size();
			System.out.println(total);
			driver.switchTo().defaultContent();
		}

	}

}
