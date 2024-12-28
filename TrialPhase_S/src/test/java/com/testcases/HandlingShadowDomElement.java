package com.testcases;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingShadowDomElement {
	
	
	public static void main(String[] args) throws InterruptedException {
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://dev.automationtesting.in/shadow-dom");
//		driver.get("https://books-pwakit.appspot.com/");
//		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
//		driver.findElement(By.linkText("Login")).click();
		
//		SearchContext ele1 = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
//		Thread.sleep(1000);
//		ele1.findElement(By.cssSelector("#input")).sendKeys("Selenium");
		
//		SearchContext shadowelement = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
//		Thread.sleep(1000);
//		SearchContext shadowelement2 = shadowelement.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
//		Thread.sleep(1000);
//		SearchContext shadowelemnt3=shadowelement2.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
//		Thread.sleep(1000);
//		String element = shadowelemnt3.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
//		System.out.println(element);
//		driver.quit();
		
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.applitools.com/app.html");
		driver.manage().window().maximize();
		
		int rowcount = driver.findElements(By.xpath("//table[@class='table table-padded']//tbody//tr")).size();
		List<WebElement> descriptions = driver.findElements(By.xpath("//table[@class='table table-padded']//tbody//tr//td[3]"));
		List<WebElement> categories = driver.findElements(By.xpath("//table[@class='table table-padded']//tbody//tr//td[4]"));
		String actualcategory ="";
	
		for(int i=0; i<rowcount; i++) {		
			
			if(descriptions.get(i).getText().equals("Ebay Marketplace")) {
				
				 actualcategory = categories.get(i).getText();				
			}									
		}
		if(actualcategory.equals("Ecommerce")) {
			boolean status = true;
			System.out.println(status);
			driver.close();
		}
				
    }	
}
