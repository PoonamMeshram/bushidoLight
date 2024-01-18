package com.bushidolight.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Useful_Links extends BaseClass
{
	

	 
		@Test (groups={"All"})
		public void usefulClick() throws InterruptedException {

		 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
			By usefullinkbtn = By.xpath("//a[contains(text(),'Useful Links')]");
			By findmorebtn   = By.xpath("//a[contains(text(),'Find out more')]");
		
			WebElement flag = driver.findElement(usefullinkbtn);
			js.executeScript("arguments[0].scrollIntoView();", flag);
			
			
			driver.findElement(usefullinkbtn).click();
			Thread.sleep(3000);
			String alert = driver.findElement(By.xpath("//h3[contains(text(),'Working in communities across London to fight pove')]")).getText();
			System.out.println(alert);
			driver.findElement(findmorebtn).click();
			Thread.sleep(3000);
		    
		}
		
		public void close() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();

			Reporter.log("********Browser Session End********", true);
		}
		  
	}