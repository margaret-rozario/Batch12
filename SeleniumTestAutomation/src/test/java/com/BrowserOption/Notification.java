package com.BrowserOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Notification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe");
		FirefoxOptions option = new FirefoxOptions();
		
		option.addArguments(" -- disable-notification");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");

	}

}
