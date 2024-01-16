package com.bushidolight.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Register_interest extends BaseClass
{

	@Parameters({"firstName","lastName","businessName","email","mobile","telephone","reason"})
	@Test
	public void Form(@Optional("Poonam") String firstName,@Optional("Meshram")String lastName, @Optional("Geeconsystems")String businessName, @Optional("poonam.meshram@geeconstystems.com")String email, @Optional("9324320252")String mobile, @Optional("1234567890")String telephone, @Optional("testing")String reason) throws InterruptedException
	
	{
		By RegisterInterestbutton = By.xpath("//a[contains(text(),'Register Your Interest')]");
		By FirstName = By.id("first_name");
		By LastName = By.id("last_name");
		By BusinessName = By.id("business");
		By Email       = By.id("email");
		By Mobile      = By.id("mobile");
		By Telephone   = By.id("telephone");
		By Reason      = By.id("reason_for_contact");
		By SubmitInterestbutton= By.id("submit_new");
		By successtext = By.xpath("//p[contains(text(),'Your details saved successfully will connect you s')]");
		By closebutton = By.xpath("//body/div[@id='messagePopup']/div[1]/div[1]/div[2]/div[4]/button[1]");
		
		driver.findElement(RegisterInterestbutton).click();
		Thread.sleep(3000);
		driver.findElement(FirstName).sendKeys(firstName);
		Thread.sleep(3000);
		driver.findElement(LastName).sendKeys(lastName);
		Thread.sleep(3000);
		driver.findElement(BusinessName).sendKeys(businessName);
		Thread.sleep(3000);
		driver.findElement(Email).sendKeys(email);
		Thread.sleep(3000);
		driver.findElement(Mobile).sendKeys(mobile);
		Thread.sleep(3000);
		driver.findElement(Telephone).sendKeys(telephone);
		Thread.sleep(3000);
		driver.findElement(Reason).sendKeys(reason);
		Thread.sleep(3000);
		driver.findElement(SubmitInterestbutton).click();
		
		try
		{
			Thread.sleep(3000);
			String actualtext=driver.findElement(successtext).getText();
			String expectedtext="Your details saved successfully willconnect you shortly !!!!!";
			Assert.assertEquals(expectedtext,actualtext);
			System.out.println(actualtext);
			Thread.sleep(3000);
			driver.findElement(closebutton).click();
			System.out.println("Test case has been passed");
			
		}
		
		catch(Exception e)
		
		{
			String Actualtext=driver.findElement(successtext).getText();
			Thread.sleep(2000);
			System.out.println(Actualtext);
			System.out.println("Test case has been failed");
			
		}
	}

}


