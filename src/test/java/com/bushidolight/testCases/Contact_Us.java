package com.bushidolight.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Contact_Us extends BaseClass
	{
	
	@Parameters({"firstName","lastName","businessName","email","mobile","telephone","reason"})
	@Test (groups={"All"})
	public void Form(@Optional("Poonam") String firstName,@Optional("Meshram")String lastName, 
		@Optional("Geeconsystems")String businessName, @Optional("poonam.meshram@geeconsystems.com")String email,
		@Optional("9324320252")String mobile, @Optional("1234567890")String telephone, @Optional("testing")String reason)
				throws InterruptedException
	
	{
		By ContactUsbutton = By.xpath("//a[contains(text(),'CONTACT US')]");
		By FirstName = By.id("first_name");
		By LastName = By.id("last_name");
		By BusinessName = By.id("business");
		By Email       = By.xpath("//form[@id='enquiry_form']/div[4]/input[@id='email']");
		By Mobile      = By.id("mobile");
		By Telephone   = By.id("telephone");
		By Reason      = By.id("reason_for_contact");
		By Submitbutton= By.id("submit_new");
		By popclosebtn = By.xpath("(//*[text()='Close'])[1]");
		
		driver.findElement(ContactUsbutton).click();
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
		driver.findElement(Submitbutton).click();
		String alert = driver.findElement(By.xpath("//p[contains(text(),'Your details saved successfully will connect you s')]")).getText();
		System.out.println(alert);
		Thread.sleep(3000);
		driver.findElement(popclosebtn).click();
		Thread.sleep(3000);
	   
	}

	}
