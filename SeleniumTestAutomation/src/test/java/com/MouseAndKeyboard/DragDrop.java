package com.MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("C:\\Users\\sonal\\workspace\\SeleniumTestAutomation")+"\\src\\test\\resources\\Drivers.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.findElement(By.id("box1")).click();
		
		WebElement drag = driver.findElement(By.id("box1"));
		WebElement drop = driver.findElement(By.id("box101"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop);
		act.build();
		act.perform();

	}

}
