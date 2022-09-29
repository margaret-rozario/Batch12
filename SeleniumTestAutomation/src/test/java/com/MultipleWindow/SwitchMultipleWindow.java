package com.MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchMultipleWindow {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/windows");
		
		String parentGUID = driver.getWindowHandle();
		System.out.println("Parent Window GUID: " + parentGUID);
		
		driver.findElement(By.cssSelector(".example > a:nth-child(2)")).click();
		Thread.sleep(3000);
		
		//Get All Session ID of The Browser 
		Set <String> allGUID = driver.getWindowHandles();
		System.out.println(allGUID);
		
		//Print The Title of The Page 
		System.out.println("Page Title Before Switching: " + driver.getTitle());
		System.out.println("Total Windows: " + allGUID.size());
		
		//Iterate The Value In The Set 
		for(String Childguid: allGUID)
		{
			if (!Childguid.equals(parentGUID))
			{
				driver.switchTo().window(Childguid);
				System.out.println("New Window Title: " + driver.getTitle());
				//Break The Loop
				break;
				
			}
		}
		
		driver.navigate().to("www.google.com");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		for(String Childguid: allGUID)
		{
			if (!Childguid.equals(parentGUID))
			{
				driver.switchTo().window(parentGUID);
				//System.out.println("New Window Title: " + driver.getTitle());
				//Break The Loop
				
				driver.get("https://bing.com");
				System.out.println(driver.getTitle());
				break;
				
			}
		}
		
		
		
		
		
	

}
	
}