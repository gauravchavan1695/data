package com.testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handlingdynamicelement {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> productnames = driver.findElements(By.xpath("//a[@class='hrefch']"));
		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='hrefch']//following::h5"));
		int size = productnames.size();
		boolean flag = false;
		String actualprice="";
		
		
		for(int i=0; i<size; i++) {
			
			if(productnames.get(i).getText().equals("Sony vaio i5")) {
				actualprice = prices.get(i).getText().replace("$", "");						
				
					if(actualprice.equals("790")) {						
						flag=true;
						System.out.println(productnames.get(i).getText()+" : "+actualprice);
						System.out.println(flag);
						break;
					}
			}			
		}
		if(!flag) {
			System.out.println("Product not found or price did not match.");
		}
		
		driver.quit();		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
	}
}
