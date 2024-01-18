package com.bushidolight.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bush_Light_info extends BaseClass
{
	@Test (groups={"All"})
	public void bushlightinfo() throws InterruptedException {

	 
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
		By Readmorebutton = By.xpath("//body/section[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/a[1]");
		By Popupclosebtn   = By.xpath("//body/section[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/button[1]");
	
		WebElement flag = driver.findElement(Readmorebutton);
		js.executeScript("arguments[0].scrollIntoView();", flag);
		//div/div[3]/div[1]/div[1]/div[@class='modal-body']
		
		driver.findElement(Readmorebutton).click();
		Thread.sleep(3000);
		String alert = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]")).getText();
		System.out.println(alert);
		driver.findElement(Popupclosebtn).click();
		Thread.sleep(3000);
	    
	}
	
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

		Reporter.log("********Browser Session End********", true);
	}
	  
}


