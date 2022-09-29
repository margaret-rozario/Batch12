package com.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base64ToImage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/windows");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Take Screenshot
		String scrBase64= ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		
		//Convert the Base64 to file
		File file = OutputType.FILE.convertFromBase64Png(scrBase64);
		
		//Save the converted file as image 
		FileUtils.copyFile(file, new File("C:\\Users\\sonal\\OneDrive\\Pictures\\Screenshots\\Base64-Converted-Image.png"), true);	

		
		
		
	}

}
