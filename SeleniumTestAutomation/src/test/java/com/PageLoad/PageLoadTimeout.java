package com.PageLoad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class PageLoadTimeout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebElement driver = null; 
		Select dis = new Select(driver);
		dis.selectByValue("10");
		dis.selectByVisibleText("DHAKA");
		 

	}

}
