package com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageobjects.LoginPage;
import com.qa.utilities.ScreenRecorderUtil;
import com.qa.utilities.SendEmailWithReport;

public class TC_LoginTest_001 extends BaseClass{

	//LoginPage lp = new LoginPage(driver);
	@Test(priority=1)
	public void loginTest() throws Exception
	{
		
		
		
		Thread.sleep(5000);
		driver.get(url);
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		//ScreenRecorderUtil.startRecord("CheckingLinks");
		
		Thread.sleep(5000);
		lp.setUserName(uname); 
		logger.info("Entered username");
		
		Thread.sleep(5000);
		lp.clickcompnayname();
				
		Thread.sleep(5000);
		lp.selcompnayname(selcname);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		lp.setpassword(pwd);
		logger.info("Entered password");
		
		Thread.sleep(5000);
		lp.clickLogin();
		logger.info("Clicked On Login");
		
		
		if(driver.getTitle().equals("GovEva Client"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
	
	@Test(priority=2)
	public void logoutTest() throws InterruptedException, Throwable
	{
		LoginPage lp = new LoginPage(driver);
	
	    Thread.sleep(30000);	
	    lp.clickOnProfile();
	    
	   // Thread.sleep(5000);
       // SendEmailWithReport email = new SendEmailWithReport();
		//email.SendEmail();
	    
	    
	    Thread.sleep(5000);
	    lp.clickOnLogout();
		
	    
	
	if(driver.getTitle().equals("GovEva Client"))
	{
		Assert.assertTrue(true);
		logger.info("Logout test passed");
	}
	else
	{
		captureScreen(driver,"loginTest");
		Assert.assertTrue(false);
		logger.info("Logout test failed");
	}
	
	
	//ScreenRecorderUtil.stopRecord();
	
	}
	
}
