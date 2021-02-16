package com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageobjects.DetailsPage;
import com.qa.pageobjects.LoginPage;
import com.qa.utilities.Xls_Reader;

public class TC_UpsiDetailsTest_010 extends BaseClass{

public String upsidetailsname = "Testing of UPSI Details By automation@" + randomeNum();
	
	
	@Test(priority=18)
	public void addUpsiDetails() throws Throwable
	{
		
       LoginPage lp = new LoginPage(driver);
       
       Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Details";
		
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
		    dp.setSearchOnRecipientPopup(reader.getCellData(sheetName, "Select Recipient_1", 2));
		    Thread.sleep(5000);
		    dp.clickSelectRecipient_1();
		    Thread.sleep(5000);
		    dp.clearSearchOnRecipientPopup();
		    Thread.sleep(5000);
		    dp.setSearchOnRecipientPopup(reader.getCellData(sheetName, "Select Recipient_2", 2));
		    Thread.sleep(5000);
		    dp.clickSelectRecipient_2();
		    Thread.sleep(5000);
		    dp.clearSearchOnRecipientPopup();
		    Thread.sleep(5000);
		    dp.clicksaveButtonOnRecipient();
		    logger.info("Recipient selected for UPSI Details...");
		   
		
		    Thread.sleep(3000);
		    dp.selectNatureOfInterest(reader.getCellData(sheetName, "Other Nature of UPSI:", 2));
		    logger.info("Nature of UPSI Added...");
		    
		    Thread.sleep(3000);
		    dp.setBriefDetailsOfUpsiShared(upsidetailsname);
		    logger.info("Brief details of UPSI shared Added...");
		    
		    Thread.sleep(3000);
		    dp.setEmailSubject(reader.getCellData(sheetName, "Email Subject:", 2));
		    logger.info("Email Subject Added...");
		    
		    Thread.sleep(3000);
		    dp.setAttachmentForEmail(reader.getCellData(sheetName, "Attachment for Email:", 2));
		    logger.info("Attachment for Email Added...");
		
		    Thread.sleep(3000);
		    dp.setEmailText(reader.getCellData(sheetName, "Email Text:", 2));
		    logger.info("Email Text Added...");
		    
//		    Thread.sleep(3000);
//		    dp.setEmailText("New UPSI Details Text");
//		    logger.info("Email Text Added...");
//		    
		    Thread.sleep(3000);
		    dp.setPurposeForSharing(reader.getCellData(sheetName, "Purpose for Sharing:", 2));
		    logger.info("Purpose for Sharing Added...");
		    
		    Thread.sleep(3000);
		    dp.clearMannerModeOfSharing();
		    dp.setMannerModeOfSharing(reader.getCellData(sheetName, "Manner/mode of sharing:", 2));
		    logger.info("Manner/mode of sharing Added...");
		    
		    Thread.sleep(3000);
		    dp.setDocumentUploadNotForEmail(reader.getCellData(sheetName, "Document Upload (Not for Email):", 2));
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
		    

			 Thread.sleep(3000);
		     String msg = driver.findElement(By.id("alertSuccessMessage2")).getText();
		     
		     Thread.sleep(3000);
			 dp.clickSubmitUpsiDetailsOK();
		     
		    
		    if (msg.equals("UPSI Detail is added successfully.")) {
				Assert.assertTrue(true);
				logger.info("Add UPSI Details Passed");
				reader.addColumn(sheetName, "Test Case Result");

				reader.setCellData(sheetName, "Test Case Result", 2, "PASS");
			} else {
				captureScreen(driver, "Upsi Details Add");
				// Assert.assertTrue(false);
				logger.info("Add UPSI Details Failed");

				reader.addColumn(sheetName, "Test Case Result");

				reader.setCellData(sheetName, "Test Case Result", 2, "FAIL");
			}

		      
	}
	
	@Test(priority=19)
    public void updateUpsiDetails() throws Exception
    {
		DetailsPage dp = new DetailsPage(driver);
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Details";
		
		
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
		 
		 
		 Thread.sleep(3000);
	     String msg = driver.findElement(By.id("alertSuccessMessage2")).getText();
		 
		 
		 Thread.sleep(5000);
		 dp.clickUpdateUpsiDetailsOK();
		 logger.info("Clicked On Update Ok Button...");
		 
		 if (msg.equals("Upsi Details Added successfully.")) {
				Assert.assertTrue(true);
				logger.info("Upsi Details updated Passed");
				// reader.addColumn(sheetName, "status");

				reader.setCellData(sheetName, "Test Case Result", 3, "PASS");
			} else {
				captureScreen(driver, "UPSI Details Update");
				// Assert.assertTrue(false);
				logger.info("Upsi Details updated Failed");

				// reader.addColumn(sheetName, "status");

				reader.setCellData(sheetName, "Test Case Result", 3, "FAIL");
			} 
		 
		 
    }
	
	
	
	@Test(priority=20)
    public void emailLog() throws Exception
    {
	
	
		DetailsPage dp = new DetailsPage(driver);
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Details";
		
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
    public void clickOnDownloadDocument() throws InterruptedException, Exception 
    {
	
	
		DetailsPage dp = new DetailsPage(driver);
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Details";
		
		Thread.sleep(30000);
		 dp.clearSearchOnUpsiDetails();
		 logger.info("Clearing...");

		 Thread.sleep(3000);
		 dp.setSearchOnUpsiDetails(upsidetailsname);
		 logger.info("Searching...");
		
		Thread.sleep(3000);
		dp.clickDownloadDocIcon();
		logger.info("Clicked On Download Document...");
		
		Thread.sleep(3000);
		String msg = driver.findElement(By.xpath("//span[@class = 'cat__core__title']")).getText();
		
		if (msg.equals("Recipient List")) {
			Assert.assertTrue(true);
			logger.info("Recipient Download File Passed");
			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 4, "PASS");
		} else {
			captureScreen(driver, "Recipient File Download");
			// Assert.assertTrue(false);
			logger.info("Recipient Download File Failed");

			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 4, "FAIL");
		}
		
		
	
    }
	
	
	@Test(priority=22)
    public void clickOnDownloadEmailAttach() throws InterruptedException, Exception 
    {
	
	
		DetailsPage dp = new DetailsPage(driver);
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Details";
		
		Thread.sleep(30000);
		 dp.clearSearchOnUpsiDetails();
		 logger.info("Clearing...");
		
		
		
		 Thread.sleep(3000);
		 dp.setSearchOnUpsiDetails(upsidetailsname);
		 logger.info("Searching...");

		Thread.sleep(3000);
		dp.clickDownloadEmailAttachIcon();
		logger.info("Clicked On Download Email Attachment...");
		
		Thread.sleep(3000);
		String msg = driver.findElement(By.xpath("//span[@class = 'cat__core__title']")).getText();
		
		if (msg.equals("UPSI Details List")) {
			Assert.assertTrue(true);
			logger.info("Download Email Attachment Passed");
			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 5, "PASS");
		} else {
			captureScreen(driver, "Download Email Attachment");
			// Assert.assertTrue(false);
			logger.info("Download Email Attachment Failed");

			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 5, "FAIL");
		}
		
		
	
    }
	
	@Test(priority=23)
    public void clickOnHistoryIcon() throws InterruptedException, IOException 
    {
	
	
		DetailsPage dp = new DetailsPage(driver);
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Details";
		
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
	
		
		Thread.sleep(3000);
		String msg = driver.findElement(By.xpath("//span[@class = 'cat__core__title']")).getText();
		
		if (msg.equals("UPSI Details List")) {
			Assert.assertTrue(true);
			logger.info("History Of UPSI Passed");
			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 5, "PASS");
		} else {
			captureScreen(driver, "History Of UPSI");
			// Assert.assertTrue(false);
			logger.info("History Of UPSI Failed");

			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 5, "FAIL");
		}
		
		
		LoginPage lp = new LoginPage(driver);
	    Thread.sleep(5000);	
	    lp.clickOnProfile();
	    Thread.sleep(5000);
	    lp.clickOnLogout();
		
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
