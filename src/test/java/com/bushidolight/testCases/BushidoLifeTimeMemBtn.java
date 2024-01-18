package com.bushidolight.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BushidoLifeTimeMemBtn extends BaseClass{
	

	@Parameters({"firstName","surName","email","address","postCode"})
	@Test (groups={"All"})
	public void Form(@Optional("Pooja") String firstName,@Optional("Chunarkar")String surName, 
		 @Optional("poonammanishm@gmail.com")String email,
		@Optional("Borivali")String address, @Optional("401177")String postCode)
				throws InterruptedException
				
	{
		By BushidoLifeTMbutton = By.xpath("//a[contains(text(),'Bushido Light Lifetime membership')]");
		By FirstName = By.xpath("//tbody/tr[1]/td[2]/input[1]");
		By SurName = By.xpath("//tbody/tr[2]/td[2]/input[1]");
		By Email       = By.xpath("//tbody/tr[3]/td[1]/input[1]");
		By Address     = By.xpath("//input[@id='address']");
		By Postcode     = By.xpath("//input[@id='postcode']");
		By PayOnline    = By.xpath("//input[@id='paypal_payment']");
		By Agree        = By.xpath("//input[@id='gdpr']");
		By Createbutton= By.id("//button[@id='register_create_account_step_1']");
		
		driver.findElement(BushidoLifeTMbutton).click();
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
		driver.findElement(PayOnline).click();
		Thread.sleep(3000);
		driver.findElement(Agree).click();
		Thread.sleep(3000);
		driver.findElement(Createbutton).click();
		String alert = driver.findElement(By.xpath("//h3[contains(text(),'Bushido Online Payment')]")).getText();
		System.out.println(alert);
		Thread.sleep(3000);
	   
	}

	}



