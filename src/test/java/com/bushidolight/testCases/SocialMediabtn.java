package com.bushidolight.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SocialMediabtn extends BaseClass {
	
	@Test (groups={"Alltest","SocialMediabtn"})
	public void passiveincome() throws InterruptedException {

	 
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
		By Youtubebutton = By.xpath("//body/section[6]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/i[1]");
		
		WebElement flag = driver.findElement(Youtubebutton);
		js.executeScript("arguments[0].scrollIntoView();", flag);
		
		
		driver.findElement(Youtubebutton).click();
		Thread.sleep(3000);
		
		System.out.println("-- Bushido Socail Impact CIC 5 videos load --: \n");
	}
	
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

		Reporter.log("********Browser Session End********", true);
	}
	  
}



