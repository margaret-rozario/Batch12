package com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextVerify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.opencart.com/");
		
		
		System.out.print(driver.findElement(By.cssSelector("#narbar-menu > ul > li:nth-child(1) > a")).getText());
		String value = driver.findElement(By.cssSelector("#content > div.row > div:nth-child(1) > form > div > div.content > div.description > h4 > a")).getAttribute("value");
		System.out.println(value);
		
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("id"));
	}

}
