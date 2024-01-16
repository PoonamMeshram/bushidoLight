package com.bushidolight.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SEE_FAQ extends BaseClass
{
	@Test (groups={"All"})
	public void click() throws InterruptedException
	{
		By FAQbutton = By.xpath("//a[contains(text(),'SEE FAQ')]");
		By First = By.xpath("//body/div[8]/div[1]/div[1]/div[1]/a[1]/h4[1]/i[1]");
		By Second = By.xpath("//body/div[8]/div[1]/div[2]/div[1]/a[1]/h4[1]/i[1]");
		By Third = By.xpath("//body/div[8]/div[1]/div[3]/div[1]/a[1]/h4[1]/i[1]");
		By Fourth = By.xpath("//body/div[8]/div[1]/div[4]/div[1]/a[1]/h4[1]/i[1]");
		By Fifth = By.xpath("//body/div[8]/div[1]/div[5]/div[1]/a[1]/h4[1]/i[1]");
		By Sixth = By.xpath("//body/div[8]/div[1]/div[6]/div[1]/a[1]/h4[1]/i[1]");
		By Seventh = By.xpath("//body/div[8]/div[1]/div[7]/div[1]/a[1]/h4[1]/i[1]");
		By Eighth = By.xpath("//body/div[8]/div[1]/div[8]/div[1]/a[1]/h4[1]/i[1]");
		By Ninth = By.xpath("//body/div[8]/div[1]/div[9]/div[1]/a[1]/h4[1]");
		By Tenth = By.xpath("//body/div[8]/div[1]/div[10]/div[1]/a[1]/h4[1]/i[1]");
		By Eleventh = By.xpath("//body/div[8]/div[1]/div[11]/div[1]/a[1]/h4[1]/i[1]");
		By Twelveth = By.xpath("//body/div[8]/div[1]/div[12]/div[1]/a[1]/h4[1]/i[1]");
		By Thirteenth = By.xpath("//body/div[8]/div[1]/div[13]/div[1]/a[1]/h4[1]/i[1]");
		
		
		driver.findElement(FAQbutton).click();
		Thread.sleep(3000);
		driver.findElement(First).click();
		Thread.sleep(3000);
		driver.findElement(Second).click();
		Thread.sleep(3000);
		driver.findElement(Third).click();
		Thread.sleep(3000);
		driver.findElement(Fourth).click();
		Thread.sleep(3000);
		driver.findElement(Fifth).click();
		Thread.sleep(3000);
		driver.findElement(Sixth).click();
		Thread.sleep(3000);
		driver.findElement(Seventh).click();
		Thread.sleep(3000);
		driver.findElement(Eighth).click();
		Thread.sleep(3000);
		driver.findElement(Ninth).click();
		Thread.sleep(3000);
		driver.findElement(Tenth).click();
		Thread.sleep(3000);
		driver.findElement(Eleventh).click();
		Thread.sleep(3000);
		driver.findElement(Twelveth).click();
		Thread.sleep(3000);
		driver.findElement(Thirteenth).click();
		Thread.sleep(3000);
		
	}

}