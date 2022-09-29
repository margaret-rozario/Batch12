package com.MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("C:\\Users\\sonal\\workspace\\SeleniumTestAutomation")+"\\src\\test\\resources\\Drivers.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8081/WebProject/index.html");
		
		WebElement Ele = driver.findElement(By.cssSelector("body > p:nth-child(1)"));
		Actions act = new Actions(driver);
		act.moveToElement(Ele).build().perform();
		

	}

}
