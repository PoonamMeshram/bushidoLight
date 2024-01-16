package com.bushidolight.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Useful_Links extends BaseClass
{
	@Test (groups={"All"})
	public void use_links() throws InterruptedException
	{

	 
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
		By UsefulLinkbtn = By.xpath("//a[contains(text(),'Useful Links')]");
		By Donatebtn   = By.xpath("//span[contains(text(),'Donate')]");
	    WebElement flag = driver.findElement(UsefulLinkbtn);
	    Thread.sleep(6000);
		js.executeScript("arguments[0].scrollIntoView();", flag);
         
		
		driver.findElement(UsefulLinkbtn).click();
		Thread.sleep(3000);
		
		String alert = driver.findElement(By.xpath("//h3[contains(text(),'Working in communities across London to fight pove')]")).getText();
	    System.out.println(alert);
		driver.findElement(Donatebtn).click();
		Thread.sleep(3000);
		System.out.println(alert);
		
		js.executeScript("arguments[0].scrollIntoView();", flag);
	//	driver.findElement(Searchbtn).sendKeys(AboutPage);
	
	}
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

		Reporter.log("********Browser Session End********", true);
	}
	  
}



