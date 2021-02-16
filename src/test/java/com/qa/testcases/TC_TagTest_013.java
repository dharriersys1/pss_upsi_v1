package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.TagPage;
import com.qa.utilities.Xls_Reader;

public class TC_TagTest_013 extends BaseClass{
	
	
	
	@Test(priority = 25)
	public void addTag() throws Exception
	{
		 LoginPage lp = new LoginPage(driver);
		 
		 Xls_Reader reader = new Xls_Reader(
					"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

			String sheetName = "Tag";
			
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
		
		
			TagPage tp = new TagPage(driver);
		
			Thread.sleep(30000);
			tp.clickleftMenu();
			logger.info("Clicked on Left Menu");
			
			Thread.sleep(3000);
			tp.clickMasterMenu();
			logger.info("Clicked on Master Menu");
			
			Thread.sleep(3000);
			tp.clickTagSubMenu();
			logger.info("Clicked on Tag sub Menu");
			
			Thread.sleep(3000);
			tp.clickAddTagDetails();
			logger.info("Clicked on Add Tag button");
			
			
			Thread.sleep(3000);
			tp.setTagFieldData(reader.getCellData(sheetName, "Tag Name", 2));
			logger.info("Entered Tag Name...");
		
		
			Thread.sleep(3000);
			tp.clickSaveButton();
			logger.info("Clicked on Tag Save button");
			
			Thread.sleep(3000);
		    String msg = driver.findElement(By.xpath("//span[@id='alertSuccessMessage']")).getText();
		
			Thread.sleep(3000);
			tp.clickSaveOKButton();
			logger.info("Clicked on Tag Save OK button");
			
			if (msg.equals("Tag created successfully")) {
				Assert.assertTrue(true);
				logger.info("Adding Tag Passed");
				reader.addColumn(sheetName, "Test Case Result");

				reader.setCellData(sheetName, "Test Case Result", 2, "PASS");
			} else {
				captureScreen(driver, "Tag Add");
				// Assert.assertTrue(false);
				logger.info("Adding Tag Failed");

				reader.addColumn(sheetName, "Test Case Result");

				reader.setCellData(sheetName, "Test Case Result", 2, "FAIL");
			}
			
			
		
	}
	
	
	@Test(priority = 26)
	public void updateTag() throws Exception
	{
		
		TagPage tp = new TagPage(driver);
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Tag";

		Thread.sleep(30000);
		tp.setSearchTagTextField(reader.getCellData(sheetName, "Tag Name", 2));
		logger.info("Searched...");
		
		Thread.sleep(3000);
		tp.clickEditIcon();
		logger.info("Clicked on Edit Icon...");
		
		Thread.sleep(3000);
	    tp.clearTagFieldData();
	    logger.info("Clear Tag Field Data...");
	    
	    Thread.sleep(3000);
	    tp.setTagFieldData(reader.getCellData(sheetName, "Tag Name", 3));
	    logger.info("Update Tag Field Data...");
	    
	    Thread.sleep(3000);
	    tp.clickUpdateTagButton();
	    logger.info("Clicked on Update Button...");
	    
	    Thread.sleep(3000);
	    String msg = driver.findElement(By.xpath("//span[@id='alertSuccessMessage']")).getText();
	    
	    Thread.sleep(3000);
	    tp.clickUpdateTagOKButton();
	    logger.info("Clicked on Update OK Button...");
		
		
	    if (msg.equals("Tag Updated successfully")) {
			Assert.assertTrue(true);
			logger.info("Update Tag Passed");
			reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 3, "PASS");
		} else {
			captureScreen(driver, "Tag Update");
			// Assert.assertTrue(false);
			logger.info("Update Tag Failed");

			reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 3, "FAIL");
		}
	    
	    
	    
		
	}
	
	@Test(priority = 27)
	public void exportTag() throws Exception
	{
		
       TagPage tp = new TagPage(driver);
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Tag";

		Thread.sleep(30000);
		tp.clearSearch();
		logger.info("Search Clear...");
		
		Thread.sleep(10000);
		tp.clickExportToExcelTag();
		logger.info("Export To Excel...");
		
		
		
	}
	
	@Test(priority = 28)
	public void deleteTag() throws Exception
	{
		
       TagPage tp = new TagPage(driver);
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Tag";

		Thread.sleep(30000);
		tp.clearSearch();
		logger.info("Search Clear...");
		
		Thread.sleep(30000);
		tp.setSearchTagTextField(reader.getCellData(sheetName, "Tag Name", 2));
		logger.info("Searched...");
		
		Thread.sleep(3000);
		tp.clickDeleteTagButton();
		logger.info("Searched...");
		
		Thread.sleep(3000);
		tp.clickDeleteTagYesButton();
		logger.info("Searched...");
		
		
		Thread.sleep(3000);
	    String msg = driver.findElement(By.xpath("//span[@id='alertSuccessMessage']")).getText();
		
		Thread.sleep(3000);
		tp.clickDeleteTagOKButton();
		logger.info("Searched...");
		
		if (msg.equals(" Tag deleted successfully")) {
			Assert.assertTrue(true);
			logger.info("Delete Tag Passed");
			reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 5, "PASS");
		} else {
			captureScreen(driver, "Tag Delete");
			// Assert.assertTrue(false);
			logger.info("Update Tag Failed");

			reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 5, "FAIL");
		}
		
		
		
	}
	
	
	
	
}
