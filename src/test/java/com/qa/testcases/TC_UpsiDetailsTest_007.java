package com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.qa.pageobjects.DetailsPage;
import com.qa.pageobjects.LoginPage;

public class TC_UpsiDetailsTest_007 extends BaseClass {

	public String upsidetailsname = "Testing of UPSI Details By automation@" + randomeNum();
	
	
	@Test(priority=18)
	public void addDetails() throws Throwable
	{
		
       LoginPage lp = new LoginPage(driver);
		
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
		
		
		DetailsPage dp = new DetailsPage(driver);
		
		    Thread.sleep(3000);
		    dp.clickleftMenu();
		    logger.info("Clicked on Left Menu");
		    
		    Thread.sleep(3000);
		    dp.clickUpsiMenu();
		    logger.info("Clicked On UPSI Menu...");	
		    
		    Thread.sleep(3000);
		    dp.clickUpsiDetailsMenu();
		    logger.info("Clicked On UPSI Details menu...");	
		    
		    Thread.sleep(3000);
		    dp.clickAddDetailst();
		    logger.info("Clicked On Add Details...");	
		
		    Thread.sleep(5000);
		    dp.clickSelectRecipient();
		    Thread.sleep(30000);
		    dp.setSearchOnRecipientPopup("dharriersys4@gmail.com");
		    Thread.sleep(5000);
		    dp.clickSelectRecipient_1();
		    Thread.sleep(5000);
		    dp.clearSearchOnRecipientPopup();
		    Thread.sleep(5000);
		    dp.setSearchOnRecipientPopup("dharriersys5@gmail.com");
		    Thread.sleep(5000);
		    dp.clickSelectRecipient_2();
		    Thread.sleep(5000);
		    dp.clearSearchOnRecipientPopup();
		    Thread.sleep(5000);
		    dp.clicksaveButtonOnRecipient();
		    logger.info("Recipient selected for UPSI Details...");
		   
		
		    Thread.sleep(3000);
		    dp.selectNatureOfInterest("Other New Nature OF Upsi");
		    logger.info("Nature of UPSI Added...");
		    
		    Thread.sleep(3000);
		    dp.setBriefDetailsOfUpsiShared(upsidetailsname);
		    logger.info("Brief details of UPSI shared Added...");
		    
		    Thread.sleep(3000);
		    dp.setEmailSubject("Email Subject for UPSI");
		    logger.info("Email Subject Added...");
		    
		    Thread.sleep(3000);
		    dp.setAttachmentForEmail("D:\\Dinesh\\Harrier\\PSS\\PSS+Goveva\\Automation Files(sikuli)\\2.PNG");
		    logger.info("Attachment for Email Added...");
		
		    Thread.sleep(3000);
		    dp.setEmailText("New UPSI Details Text");
		    logger.info("Email Text Added...");
		    
		    Thread.sleep(3000);
		    dp.setEmailText("New UPSI Details Text");
		    logger.info("Email Text Added...");
		    
		    Thread.sleep(3000);
		    dp.setPurposeForSharing("Purpose of UPSI Details");
		    logger.info("Purpose for Sharing Added...");
		    
		    Thread.sleep(3000);
		    dp.clearMannerModeOfSharing();
		    dp.setMannerModeOfSharing("Test Manner of Mode Of UPSI");
		    logger.info("Manner/mode of sharing Added...");
		    
		    Thread.sleep(3000);
		    dp.setDocumentUploadNotForEmail("D:\\Dinesh\\Harrier\\PSS\\PSS+Goveva\\Automation Files(sikuli)\\2.PNG");
		    logger.info("Document Upload (Not for Email) Added...");
		    
		    Thread.sleep(3000);
		    dp.setDateOfInitiationOfUpsi();
		    logger.info("Date of initiation of UPSI Added...");
		    
		    Thread.sleep(3000);
		    dp.setDateMadeUpsiPublic();
		    logger.info("Date of initiation of UPSI Added...");
	
		    Thread.sleep(3000);
		    dp.clickSubmitUpsiDetails();
		    logger.info("UPSI Details Save successfully...");
		    
		   
	}
	
	
	@Test(priority=19)
    public void updateUpsiDetails() throws Exception
    {
		DetailsPage dp = new DetailsPage(driver);
		
		Thread.sleep(30000);
		 dp.clearSearchOnUpsiDetails();
		 logger.info("Clearing...");
		
		 Thread.sleep(5000);
		 dp.setSearchOnUpsiDetails(upsidetailsname);
		 logger.info("Searching...");
		
		 Thread.sleep(5000);
		 dp.clickEditIcon();
		 logger.info("Clicked On Edit Icon...");
		 
//		 Thread.sleep(3000);
//		 dp.clickBackButtonOnEditPage();
//		 logger.info("Clicked On Back Button...");
		 
		 Thread.sleep(5000);
		 dp.clickUpdateUpsiDetails();
		 logger.info("Clicked On Update Button...");
		 
		 
		 
		 
		 Thread.sleep(5000);
		 dp.clickUpdateUpsiDetailsOK();
		 logger.info("Clicked On Update Ok Button...");
		 
		 
		 
		 
		 
    }
	
	@Test(priority=20)
    public void emailLog() throws Exception
    {
	
	
		DetailsPage dp = new DetailsPage(driver);
		
		Thread.sleep(30000);
		 dp.clearSearchOnUpsiDetails();
		 logger.info("Clearing...");
		
		 Thread.sleep(3000);
		 dp.setSearchOnUpsiDetails(upsidetailsname);
		 logger.info("Searching...");
		
		 Thread.sleep(3000);
		 dp.clickViewEmailLogIconList();
		 logger.info("Clicked On View EmailLog Icon ...");
	
		 Thread.sleep(3000);
		 captureScreen(driver,"Email Log");
		 logger.info("Screenshot Taken of Email Log...");
		 
		 
		 Thread.sleep(3000);
		 dp.clickViewIconOfEmailLog();
		 logger.info("Clicked On View Icon on EmailLog Popup ...");
	
		 Thread.sleep(3000);
	     captureScreen(driver,"Email Contains");
	     logger.info("Screenshot Taken of Email Contains...");
		 
		 Thread.sleep(3000);
		 dp.clickCancelIconOfInternalEmailLog();
		 Thread.sleep(1000);
		 dp.clickCancelIconOfEmailLog();
		 logger.info("Clicked On Cancel...");
		  
		 
    }
	

	@Test(priority=21)
    public void clickOnDownloadDocument() throws InterruptedException 
    {
	
	
		DetailsPage dp = new DetailsPage(driver);
		
		Thread.sleep(30000);
		 dp.clearSearchOnUpsiDetails();
		 logger.info("Clearing...");

		 Thread.sleep(3000);
		 dp.setSearchOnUpsiDetails(upsidetailsname);
		 logger.info("Searching...");
		
		Thread.sleep(3000);
		dp.clickDownloadDocIcon();
		logger.info("Clicked On Download Document...");
		
	
    }
	
	
	@Test(priority=22)
    public void clickOnDownloadEmailAttach() throws InterruptedException 
    {
	
	
		DetailsPage dp = new DetailsPage(driver);
		
		Thread.sleep(30000);
		 dp.clearSearchOnUpsiDetails();
		 logger.info("Clearing...");
		
		
		
		 Thread.sleep(3000);
		 dp.setSearchOnUpsiDetails(upsidetailsname);
		 logger.info("Searching...");

		Thread.sleep(3000);
		dp.clickDownloadEmailAttachIcon();
		logger.info("Clicked On Download Email Attachment...");
		
	
    }
	
	@Test(priority=23)
    public void clickOnHistoryIcon() throws InterruptedException, IOException 
    {
	
	
		DetailsPage dp = new DetailsPage(driver);
		
		Thread.sleep(30000);
		 dp.clearSearchOnUpsiDetails();
		 logger.info("Clearing...");
		
		 Thread.sleep(3000);
		 dp.setSearchOnUpsiDetails(upsidetailsname);
		 logger.info("Searching...");

		Thread.sleep(3000);
		dp.clickHistoryIcon();
		logger.info("Clicked On History Icon...");
		
		
		Thread.sleep(3000);
		captureScreen(driver,"UPSI Details History");
		logger.info("Screenshot Taken of UPSI Details History...");
		
		Thread.sleep(3000);
		dp.clickExpToExcelOnHistory();
		logger.info("Clicked On Export To Excel of History Popup...");
		
		Thread.sleep(3000);
		dp.clickExpToPDFOnHistory();
		logger.info("Clicked On Export To PDF of History Popup...");
		
		Thread.sleep(3000);
		dp.clickOkIconOnHistory();
		logger.info("Closed History Popup...");
	
		
		
		
		LoginPage lp = new LoginPage(driver);
	    Thread.sleep(5000);	
	    lp.clickOnProfile();
	    Thread.sleep(5000);
	    lp.clickOnLogout();
		
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
