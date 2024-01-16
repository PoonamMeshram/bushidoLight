package com.bushidolight.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Membership_benefits extends BaseClass {
	
	@Test (groups={"All"})
	public void membership_benefits() throws InterruptedException {

	 
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
		By membershipBenefitsbutton = By.xpath("//a[contains(text(),'Membership Benefits')]");
    
	WebElement flag = driver.findElement(membershipBenefitsbutton);
		js.executeScript("arguments[0].scrollIntoView();", flag);

		driver.findElement(membershipBenefitsbutton).click();
		Thread.sleep(3000);
		
	}

	
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

		Reporter.log("********Browser Session End********", true);
	}
	  
}
