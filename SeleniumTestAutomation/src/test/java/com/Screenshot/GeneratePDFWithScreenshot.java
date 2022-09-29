package com.Screenshot;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePDFWithScreenshot {

	public static void main(String[] args) throws DocumentException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		//Take Screenshot & Store it in Byte[] array Format 
		byte[] input = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		Document document = new Document();
		String output = "C:\\Users\\sonal\\OneDrive\\Pictures\\Screenshots\\RestReport.png";
		FileOutputStream fos = new FileOutputStream(output);
		
		//Instantiate the PDF Writer 
		PdfWriter writer = PdfWriter.getInstance(document, fos);
		
		//Open the PDF for Writing 
		writer.open();
		document.open();
		
		//Process content into an image 
		Image im = Image.getInstance(input);
		
		//Set the size of the image
		im.scaleToFit(PageSize.A4.getWidth()/2, PageSize.A4.getHeight()/2);
		
		//Add Image to PDF
		document.add(im);
		document.add(new Paragraph(""));
		
		//Close the files and save to local drive 
		document.close();
		writer.close();
		
		

	}

}
