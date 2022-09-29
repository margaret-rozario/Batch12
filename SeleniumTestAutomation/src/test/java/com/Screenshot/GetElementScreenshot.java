package com.Screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetElementScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/windows");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Locate Image Element to Capture a Screenshot 
		WebElement element = driver.findElement(By.cssSelector("#content > ul:nth-child(4) > li:nth-child(1) > a:nth-child(1)"));
		
		//Capture Entire Page Screenshot as a File 
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//Using Selenium Point Class to get X Y Coordinates of Image 
		//Get Location (X Y Coordinates) of the Element 
		Point point = element.getLocation();
		int xcoordinate = point.getX();
		int ycoordinate = point.getY();
		
		//Using Selenium getSize() method to get height & width 
		//Retrieves Width of Element 
		//Retrieves Height of Element 
		int imageWidth = element.getSize().getWidth();
		int imageHeight = element.getSize().getHeight();
		
		//Reading Full Image Screenshot 
		BufferedImage img = ImageIO.read(screen);
		
		//Curt Image With Height, Width, X Y Coordinates
		BufferedImage destination = img.getSubimage(xcoordinate, ycoordinate, imageWidth, imageHeight);
		ImageIO.write(destination, "png", screen);
		
		//Save Image Screenshot to Drive 
		FileUtils.copyFile(screen, new File("C:\\Users\\sonal\\OneDrive\\Pictures\\Screenshots\\ElementScreenshot.png"), true);
		

	}

}
