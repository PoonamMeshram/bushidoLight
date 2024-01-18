package com.bushidolight.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import bushido.config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	

	public static WebDriver driver;
    public static WebDriverWait wait; @Parameters({"env","username","password"})
	@BeforeClass(groups={"All",})
    public static void setup(@Optional("dev")String env,@Optional ("poonam.meshram@geeconsystems.com") String username, @Optional ("healthy12345") String password) throws InterruptedException
    {
    	try {
    		Reporter.log("**********Browser Session Started***********", true);
    		System.out.println("-- sysout 35 --");
    		WebDriverManager.chromedriver().setup();
    		ChromeOptions options = new ChromeOptions();
    		options.addArguments("--no-sandbox");
			options.addArguments("--remote-allow-origins=*");
		//	options.addArguments("--headless"); //should be enabled for Jenkins
			options.addArguments("--disable-dev-shm-usage"); //should be enabled for Jenkins
			options.addArguments("--window-size=1920x1080"); //should be enabled for Jenkinss
    		driver = new ChromeDriver (options);
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    		driver.manage().window().maximize();
    		
    		System.out.println("-- sysout 43 --: "+driver);

    		if(env.equalsIgnoreCase("live")) {
    			String Liveurl = PropertiesFile.liveurl();
    			driver.get(Liveurl);
    		}else if (env.equalsIgnoreCase("dev"))
    		{
    			String Devurl = PropertiesFile.devurl();
    			driver.get(Devurl);
    		}
    		
    	}catch(Exception e) {
    		System.out.println("-- sysout 55 --: \n"+e.getMessage());
			e.getStackTrace();
    	}
    
    }
      public void login(@Optional ("poonam.meshram@geeconsystems.com") String username, @Optional ("healthy12345") String password)
	{
		try {
    
			By byloginnowbutton = By.xpath("//a[contains(text(),'Login Now')]");
			By byusername = By.id("//input[@id='user_login']");
			By bypassword = By.id("//input[@id='user_pass']");
			By submitbutton = By.xpath("//button[@id='submit_login']");
			
			Thread.sleep(3000);
			driver.findElement(byloginnowbutton).click();
			driver.findElement(byusername).sendKeys(username);
			driver.findElement(bypassword).sendKeys(password);
			driver.findElement(submitbutton).click();
		 }
		catch (Exception ex) 
		{
		ex.printStackTrace();
	}
}
	
		
    
    @AfterClass
    public void close() throws InterruptedException
    {
    	Thread.sleep(3000);
    	//driver.quit();
    	
    	Reporter.log("********Browser Session End********", true);
    }

}