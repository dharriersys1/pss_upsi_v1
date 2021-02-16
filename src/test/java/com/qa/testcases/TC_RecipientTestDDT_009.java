package com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.RecipientPage;
import com.qa.utilities.Xls_Reader;

public class TC_RecipientTestDDT_009 extends BaseClass {

	public String recipientEmail = randomestring() + "@yahoo.com";

	//WebDriverWait wait = new WebDriverWait(driver, 30);

	@Test(priority = 13)
	public void addRecipient() throws InterruptedException, Exception {

		LoginPage lp = new LoginPage(driver);

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Recipient";

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

		RecipientPage rp = new RecipientPage(driver);

		Thread.sleep(30000);
		rp.clickleftMenu();
		logger.info("Clicked on Left Menu");

		Thread.sleep(3000);
		rp.clickUpsiMenu();
		logger.info("Clicked On UPSI Menu...");

		Thread.sleep(3000);
		rp.clickUpsiRecipientMenu();
		logger.info("Clicked On UPSI Recipient menu...");

		Thread.sleep(3000);
		rp.clickAddRecipient();
		logger.info("Clicked On Add Recipient...");

		Thread.sleep(3000);
		rp.setRecipientName(reader.getCellData(sheetName, "Name", 2));
		logger.info("Entered Recipient Name...");

		Thread.sleep(3000);
		rp.setRecipientCode(reader.getCellData(sheetName, "Recipient Code", 2));
		logger.info("Entered Recipient Code...");

		Thread.sleep(3000);
		rp.setRecipientDesignation(reader.getCellData(sheetName, "Designation", 2));
		logger.info("Clicked On Save");

		Thread.sleep(3000);
		rp.setRecipientCompanyName(reader.getCellData(sheetName, "Company Name", 2));
		logger.info("Entered Company Name");

		Thread.sleep(3000);
		System.out.println("Test"+reader.getCellData(sheetName, "Address_1", 2));
		rp.setRecipientAddress_1(reader.getCellData(sheetName, "Address_1", 2));
		
		//rp.setRecipientAddress_1(reader.getCellData(sheetName, "Address_2", 2));
		logger.info("Entered Address_1...");

		Thread.sleep(3000);
		rp.setRecipientAddress_2(reader.getCellData(sheetName, "Address_2", 2));
		logger.info("Entered Address_2...");

		Thread.sleep(3000);
		rp.setRecipientAddress_3(reader.getCellData(sheetName, "Address_3", 2));
		logger.info("Entered Address_3...");

		Thread.sleep(3000);
		rp.setRecipientCity(reader.getCellData(sheetName, "City", 2));
		logger.info("Entered City...");

		Thread.sleep(3000);
		rp.setRecipientPIN(reader.getCellData(sheetName, "PIN", 2));
		logger.info("Entered PIN");

		Thread.sleep(3000);
		rp.clickRcipientTypeOfRecipient();
		logger.info("Entered Type Of Recipient...");

		Thread.sleep(3000);
		rp.clickRecipientPAN();

		Thread.sleep(3000);
		rp.setRecipientPutPAN(reader.getCellData(sheetName, "Unique Identifier", 2));
		logger.info("Enetered PAN...");

		Thread.sleep(3000);
		rp.setRecipientUploadFile(reader.getCellData(sheetName, "Upload Document", 2));
		logger.info("Enetered File...");

		Thread.sleep(3000);
		rp.setRecipientEmailID(recipientEmail.toLowerCase());
		logger.info("Entered Email");

		Thread.sleep(3000);
		System.out.println("Test"+reader.getCellData(sheetName, "Mobile Number", 2));
		rp.setRecipientMobileNo(reader.getCellData(sheetName, "Mobile Number", 2));
		logger.info("Enetered Mobile Number...");

		Thread.sleep(3000);
		rp.setRecipientTelNo(reader.getCellData(sheetName, "Tel Number", 2));
		logger.info("Enetered Tel No...");

		 Thread.sleep(3000);
		 rp.clickRecipientSave();
		 logger.info("Clicked On Save");
		 
		 Thread.sleep(3000);
	     String msg = driver.findElement(By.id("alertSuccessMessage2")).getText();
		 
		 
		 Thread.sleep(3000);
		 rp.clickRecipientSaveOK();
		 
		 
		 if (msg.equals("Recipient added successfully.")) {
				Assert.assertTrue(true);
				logger.info("Add Recipient Passed");
				reader.addColumn(sheetName, "Test Case Result");

				reader.setCellData(sheetName, "Test Case Result", 2, "PASS");
			} else {
				captureScreen(driver, "RecipientAdd");
				// Assert.assertTrue(false);
				logger.info("Add Recipient Failed");

				reader.addColumn(sheetName, "Test Case Result");

				reader.setCellData(sheetName, "Test Case Result", 2, "FAIL");
			}

		 

	}

	@Test(priority=14)
	public void updateRecipient() throws InterruptedException, Exception
	{
		 RecipientPage rp = new RecipientPage(driver);
		
		 Xls_Reader reader = new Xls_Reader(
					"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Recipient";
		 
		Thread.sleep(30000);
	    rp.setRecipientSearchTextBox(recipientEmail);
	   	
	    
	    Thread.sleep(3000);
	    rp.clickRecipientEditIcon();
	    
	    
	    Thread.sleep(3000);
	    rp.clearRecipientName();
	    rp.setRecipientName(reader.getCellData(sheetName, "Name", 3));
	    
	    Thread.sleep(3000);
	    rp.clearRecipientCode();
	    rp.setRecipientCode(reader.getCellData(sheetName, "Recipient Code", 3));
	    
	    Thread.sleep(3000);
	    rp.clearRecipientDesignation();
	    rp.setRecipientDesignation(reader.getCellData(sheetName, "Designation", 3));
	    
	    Thread.sleep(3000);
	    rp.clearRecipientCompanyName();
	    rp.setRecipientCompanyName(reader.getCellData(sheetName, "Company Name", 3));	
	    
	    Thread.sleep(3000);
	    rp.clearRecipientAddress_1();
	    rp.setRecipientAddress_1(reader.getCellData(sheetName, "Address_1", 3));	
	    
	    Thread.sleep(3000);
	    rp.clearrecipientAddress_2();
	    rp.setRecipientAddress_2(reader.getCellData(sheetName, "Address_2", 3));
	    
	    Thread.sleep(3000);
	    rp.clearRecipientAddress_3();
	    rp.setRecipientAddress_3(reader.getCellData(sheetName, "Address_3", 3));
	    
	    Thread.sleep(3000);
	    rp.clearRecipientCity();
	    rp.setRecipientCity(reader.getCellData(sheetName, "City", 3));
	   
	    
	    Thread.sleep(3000);
	    rp.clearRecipientPIN();
	    rp.setRecipientPIN(reader.getCellData(sheetName, "PIN", 3));
	    
	    Thread.sleep(3000);
	    rp.clearRecipientPutPAN();
	    rp.setRecipientPutPAN(reader.getCellData(sheetName, "Unique Identifier", 3));
	    
	    Thread.sleep(3000);
	    rp.clearRecipientMobileNo();
	    rp.setRecipientMobileNo(reader.getCellData(sheetName, "Tel Number", 3));
	    
	   
	    Thread.sleep(3000);
	    rp.clickRecipientUpdate();
	    logger.info("User Details Updated Successfully...");
	    
	    Thread.sleep(3000);
	    String msg = driver.findElement(By.id("alertSuccessMessage2")).getText();
	    
	    Thread.sleep(3000);
	    rp.clickRecipientUpdateOK();
	    
	    
	    if (msg.equals("Recipient updated successfully.")) {
			Assert.assertTrue(true);
			logger.info("Recipient updated Passed");
			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 3, "PASS");
		} else {
			captureScreen(driver, "RecipientAdd");
			// Assert.assertTrue(false);
			logger.info("Recipient updated Failed");

			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 3, "FAIL");
		}
	
	}
	

	@Test(priority=15)
	public void clickOnDownloadFile() throws InterruptedException, Exception
	{
		RecipientPage rp = new RecipientPage(driver);
		

		 Xls_Reader reader = new Xls_Reader(
					"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Recipient";
		
		Thread.sleep(30000);
		rp.clearRecipientSearchTextBox();
		Thread.sleep(3000);
		rp.setRecipientSearchTextBox(recipientEmail);
		logger.info("Search...");
		
		Thread.sleep(3000);
		rp.clickDownloadOnList();
		logger.info("File Downloaded Successfully...");
		
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
	
	
	@Test(priority=16)
    public void checkRecipientHistory() throws InterruptedException, IOException
    {
		RecipientPage rp = new RecipientPage(driver);
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

	    String sheetName = "Recipient";
		
		Thread.sleep(30000);
		rp.clearRecipientSearchTextBox();
		Thread.sleep(3000);
		rp.setRecipientSearchTextBox(recipientEmail);
		logger.info("Search...");
		
		Thread.sleep(3000);
		rp.clickHistoryIcon();
		logger.info("Clicked On History Icon...");
		
		Thread.sleep(3000);
		captureScreen(driver,"Recipient History");
		logger.info("Screenshot Taken of Recipient History Page...");
		
		
		Thread.sleep(3000);
		rp.clickExpExcelOfHistory();
		logger.info("Download Excel of History Page...");
		
		
		Thread.sleep(3000);
		rp.clickExpPDFOfHistory();
		logger.info("Download Excel of History Page...");
		
		
		Thread.sleep(3000);
		rp.clickCloseIconHistory();
		logger.info("Close History Popup...");
		
		Thread.sleep(3000);
		String msg = driver.findElement(By.xpath("//span[@class = 'cat__core__title']")).getText();
		
		if (msg.equals("Recipient List")) {
			Assert.assertTrue(true);
			logger.info("Recipient History Passed");
			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 5, "PASS");
		} else {
			captureScreen(driver, "Recipient History");
			// Assert.assertTrue(false);
			logger.info("Recipient History Failed");

			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 5, "FAIL");
		}
		
		
		
    }
	
	@Test(priority=17)
    public void deleteSharerDetails() throws InterruptedException, Exception 
    {
		RecipientPage rp = new RecipientPage(driver);
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

	    String sheetName = "Recipient";
		
		Thread.sleep(30000);
		rp.clearRecipientSearchTextBox();
		Thread.sleep(3000);
		rp.setRecipientSearchTextBox(recipientEmail);
		logger.info("Search...");
		
		Thread.sleep(3000);
		rp.recipientDelete();
		logger.info("Recipient Delete Successfully...");
		
		
		Thread.sleep(3000);
	    String msg = driver.findElement(By.id("alertSuccessMessage2")).getText();
		
		Thread.sleep(3000);
		rp.recipientDeleteOK();
		
		
		
		 
		 if (msg.equals("Recipient deleted successfully.")) {
				Assert.assertTrue(true);
				logger.info("Delete Recipient Passed");
				//reader.addColumn(sheetName, "Test Case Result");

				reader.setCellData(sheetName, "Test Case Result", 6, "PASS");
			} else {
				captureScreen(driver, "RecipientDelete");
				// Assert.assertTrue(false);
				logger.info("Delete Recipient Failed");

				//reader.addColumn(sheetName, "Test Case Result");

				reader.setCellData(sheetName, "Test Case Result", 6, "FAIL");
			}

		 
		
		
		//LoginPage lp = new LoginPage(driver);
	   // Thread.sleep(5000);	
	    //lp.clickOnProfile();
	    //Thread.sleep(5000);
	    //lp.clickOnLogout();
		
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
