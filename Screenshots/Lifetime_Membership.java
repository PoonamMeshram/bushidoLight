package com.bushidolight.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lifetime_Membership extends BaseClass
{
	@Parameters({"firstName","surName","email","address","postCode"})
	@Test
	public void Form(@Optional("Poonam") String firstName,@Optional("Meshram")String surName,
			@Optional("poonam.meshram@geeconstystems.com")String email,@Optional("Mira road")
	        String address,@Optional("401107")String postCode) throws InterruptedException 
	
	{
		By LifetimeMembershipbutton = By.xpath("/html/body/section[6]/div[2]/div/div[2]/div[2]/div[5]/div[2]/a");
		By FirstName                = By.xpath("//input[@name='user_first_name']");
		By SurName                  = By.xpath("//tbody/tr[2]/td[2]/input[1]");
		By Email                    = By.xpath("//tbody/tr[3]/td[1]/input[1]");
		By Address                  = By.xpath("//input[@id='address']");
		By Postcode                 = By.xpath("//input[@id='postcode']");
		By Payonlinechkbox          = By.xpath("//input[@id='paypal_payment']");
		By Agree                    = By.xpath("//input[@id='gdpr']");
		By Create                   = By.xpath("//button[@id='register_create_account_step_1']");
		By successtext              = By.xpath("//p[contains(text(),'Your account details has been updated')]");
		By closebutton              = By.xpath("//body/div[@id='messagePopup']/div[1]/div[1]/div[2]/div[4]/button[1]");
		
		
		
		driver.findElement(LifetimeMembershipbutton).click();
		Thread.sleep(3000);
		driver.findElement(FirstName).sendKeys(firstName);
		Thread.sleep(3000);
		driver.findElement(SurName).sendKeys(surName);
		Thread.sleep(3000);
		driver.findElement(Email).sendKeys(email);
		Thread.sleep(3000);
		driver.findElement(Address).sendKeys(address);
		Thread.sleep(3000);
		driver.findElement(Postcode).sendKeys(postCode);
		Thread.sleep(3000);
		driver.findElement(Payonlinechkbox).click();
		Thread.sleep(3000);
		driver.findElement(Agree).click();
		Thread.sleep(3000);
		driver.findElement(Create).click();
		Thread.sleep(3000);
	
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


		