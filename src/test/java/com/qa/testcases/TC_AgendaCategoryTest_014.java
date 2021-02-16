package com.qa.testcases;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageobjects.AgendaCategoryPage;
import com.qa.pageobjects.LoginPage;
import com.qa.utilities.Xls_Reader;



public class TC_AgendaCategoryTest_014 extends BaseClass{
	
	
	@Test(priority = 22)
	public void addAgendaCategory() throws Exception
	{
		LoginPage lp = new LoginPage(driver);

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Agenda Category";
		
		String meeting_type = reader.getCellData(sheetName, "Meeting Type", 2);
		
		
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
		logger.info("Login Successfully");
		

		AgendaCategoryPage ac = new AgendaCategoryPage(driver);
		
		Thread.sleep(30000);
		ac.clickleftMenu();
		logger.info("Clicked On Left Menu");
		
		Thread.sleep(3000);
		ac.clickMasterMenu();
		logger.info("Clicked On Master Menu");
		
		Thread.sleep(3000);
		ac.clickAgendaCategoryMenu();
		logger.info("Clicked On Category Menu");
		
		Thread.sleep(3000);
		ac.clickcardHeader();
		
		Thread.sleep(3000);
		ac.clickaddCategoryButtons();
		logger.info("Clicked On Add Category Button");
		
		Thread.sleep(3000);
		ac.setCategoryName(reader.getCellData(sheetName, "Category Name", 2));
		logger.info("Entered Category Name");
		
		Thread.sleep(3000);
		ac.clickCatTypeGlobal();
		logger.info("Selected Category Type Global");
		
		Thread.sleep(3000);
		ac.clickCatDefaultYes();
		logger.info("Selected Category Default Yes");
		
		Thread.sleep(3000);
		ac.selectMeetingType();
		
		
		//driver.findElement(By.xpath("//option[@value='" + meeting_type + "']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[contains(text(), '" + meeting_type + "')]")).click();
		logger.info("Meeting Type Selected");
		
		Thread.sleep(3000);
		ac.clickSaveCatButton();
		logger.info("Clicked On Save Button");
		
		Thread.sleep(3000);
	    String msg = driver.findElement(By.xpath("//span[@id='alertSuccessMessage']")).getText();
		
		Thread.sleep(3000);
		ac.clickSaveCatOKButton();
		logger.info("Clicked On Save OK Button");
		
		
		if (msg.equals("Category created successfully.")) {
			Assert.assertTrue(true);
			logger.info("Add Category Passed");
			reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 2, "PASS");
		} else {
			captureScreen(driver, "Agenda Category Add");
			// Assert.assertTrue(false);
			logger.info("Add Category Failed");

			reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 2, "FAIL");
		}

	
	}
	
	
	@Test(priority = 23)
	public void updateAgendaCategory() throws InterruptedException, Exception
	{
		AgendaCategoryPage ac = new AgendaCategoryPage(driver);
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Agenda Category";
		
		Thread.sleep(30000);
		ac.setCategorySearch(reader.getCellData(sheetName, "Category Name", 2));
		logger.info("Searching...");
		
		Thread.sleep(3000);
		ac.clickEditCatIcon();
		logger.info("Clicked On Edit Icon");
		
		Thread.sleep(3000);
		ac.clearUpdateCatName();
		
		Thread.sleep(3000);
		ac.setUpdateCatName(reader.getCellData(sheetName, "Category Name", 3));
		logger.info("Category Name Updated");
		
		Thread.sleep(3000);
		ac.clickCatDefaultNo();
		logger.info("Category Default Updated as NO");
		
		
		Thread.sleep(3000);
		ac.clickUpdateCategoryButton();
		logger.info("Clicked On Update Category Button");
		
		Thread.sleep(3000);
	    String msg = driver.findElement(By.xpath("//span[@id='alertSuccessMessage']")).getText();
		
		Thread.sleep(3000);
		ac.clickUpdateOKCategoryButton();
		logger.info("Clicked On Update OK Category Button");
		
		
		if (msg.equals("Category updated successfully.")) {
			Assert.assertTrue(true);
			logger.info("Update Category Passed");
			//reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 3, "PASS");
		} else {
			captureScreen(driver, "Agenda Category Update");
			// Assert.assertTrue(false);
			logger.info("Update Category Failed");

			//reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 3, "FAIL");
		}
		
		
		
		
		
	}
	
	@Test(priority = 24)
	public void exportAgendaCategory() throws Exception
	{
	
		AgendaCategoryPage ac = new AgendaCategoryPage(driver);
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Agenda Category";
		
		Thread.sleep(30000);
		ac.clearCategorySearch();
		logger.info("Clear Searching...");
		
		Thread.sleep(3000);
		ac.setCategorySearch(reader.getCellData(sheetName, "Category Name", 3));
		logger.info("Searching...");
		
		Thread.sleep(3000);
		ac.clickExportToExcelCategory();
		logger.info("Clicked On Export To Excel...");
		
		Thread.sleep(3000);
	    String msg = driver.findElement(By.xpath("//strong[contains(text(), 'Agenda Category')]")).getText();
	    
	    if (msg.equals("Agenda Category")) {
			Assert.assertTrue(true);
			logger.info("Export To Excel Category Passed");
			//reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 4, "PASS");
		} else {
			captureScreen(driver, "Agenda Category Export");
			// Assert.assertTrue(false);
			logger.info("Export To Excel Category Failed");

			//reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 4, "FAIL");
		}
		
	}
	
	@Test(priority = 25)
	public void deleteAgendaCategory() throws Exception
	{
	
		AgendaCategoryPage ac = new AgendaCategoryPage(driver);
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Agenda Category";
		
		Thread.sleep(30000);
		ac.clearCategorySearch();
		logger.info("Clear Searching...");
		
		Thread.sleep(3000);
		ac.setCategorySearch(reader.getCellData(sheetName, "Category Name", 3));
		logger.info("Searching...");
		
		Thread.sleep(3000);
		ac.clickDeleteCatIcon();
		logger.info("Clicked On Delete Icon...");
		
		Thread.sleep(3000);
		ac.clickDeleteYesCatIcon();
		logger.info("Clicked On Yes of Delete...");
		
		Thread.sleep(3000);
	    String msg = driver.findElement(By.xpath("//span[@id='alertSuccessMessage']")).getText();
		
		Thread.sleep(3000);
		ac.clickDeleteOKCatIcon();
		logger.info("Clicked On Delete OK button...");
		
		if (msg.equals("Category is deleted successfully.")) {
			Assert.assertTrue(true);
			logger.info("Delete Category Passed");
			//reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 5, "PASS");
		} else {
			captureScreen(driver, "Agenda Category Delete");
			// Assert.assertTrue(false);
			logger.info("Delete Category Failed");

			//reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 5, "FAIL");
		}
		
	}
	
	
	
	
	
	

}
