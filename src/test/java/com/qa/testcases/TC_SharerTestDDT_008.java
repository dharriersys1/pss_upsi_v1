package com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.SharerPage;
import com.qa.utilities.ScreenRecorderUtil;
import com.qa.utilities.Xls_Reader;

public class TC_SharerTestDDT_008 extends BaseClass {

	public String sharerEmail = randomestring() + "@gmail.com";

	@Test(priority = 8)
	public void addSharer() throws Exception {

		LoginPage lp = new LoginPage(driver);

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Sharer";

		// System.out.println(reader.getCellData(sheetName, "Name", 2));
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

		//ScreenRecorderUtil.stopRecord();

		SharerPage sp = new SharerPage(driver);

		Thread.sleep(30000);
		sp.clickleftMenu();
		logger.info("Click On Left Menu");

		//ScreenRecorderUtil.startRecord("CheckingLinks");
		Thread.sleep(3000);
		sp.clickUpsiMenu();
		logger.info("Click On UPSI Menu");

		Thread.sleep(5000);
		sp.clickUpsiSharerMenu();
		logger.info("Click On UPSI Sharer Menu");

		Thread.sleep(3000);
		sp.clickAddSharer();
		logger.info("Click On Add Sharer button");

		Thread.sleep(3000);
		sp.setSharerName(reader.getCellData(sheetName, "Name", 2));
		logger.info("Sharer Name Added");

		Thread.sleep(3000);
		sp.setSharerCode(reader.getCellData(sheetName, "Sharer Code", 2));
		logger.info("Sharer Code Added");

		Thread.sleep(3000);
		sp.setSharerDesignation(reader.getCellData(sheetName, "Designation", 2));
		logger.info("Sharer Designation Added");

		Thread.sleep(3000);
		sp.setSharerDepartment(reader.getCellData(sheetName, "Department", 2));
		logger.info("Sharer Department Added");

		Thread.sleep(3000);
		sp.selSharerPan();
		logger.info("PAN Selected");

		Thread.sleep(3000);
		sp.setSharerPan(reader.getCellData(sheetName, "Unique Identifier", 2));
		logger.info("PAN Entered");

		Thread.sleep(3000);
		sp.setSharerFile(reader.getCellData(sheetName, "Upload Document", 2));
		logger.info("File Uploaded");

		// String email=randomestring()+"@gmail.com";

		Thread.sleep(3000);
		sp.setSharerEmail(sharerEmail.toLowerCase());
		logger.info("Email Entered");

		Thread.sleep(3000);
		sp.setSharerMob(reader.getCellData(sheetName, "Mobile Number", 2));
		logger.info("Mob No. Entered");

		Thread.sleep(3000);
		sp.setSharerTel(reader.getCellData(sheetName, "Tel Number", 2));
		logger.info("Tel No. Entered");

		Thread.sleep(3000);
		sp.clickSaveButton();
		logger.info("Clicked On Save");

		Thread.sleep(3000);
		String msg = driver.findElement(By.id("alertSuccessMessage2")).getText();

		// Thread.sleep(3000);
		// System.out.println(msg);

		Thread.sleep(3000);
		sp.clickSaveOKButton();

		if (msg.equals("Sharer added successfully.")) {
			Assert.assertTrue(true);
			logger.info("Add Sharer Passed");
			reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 2, "PASS");
		} else {
			captureScreen(driver, "SharerAdd");
			// Assert.assertTrue(false);
			logger.info("Add Sharer Failed");

			reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 2, "FAIL");
		}

		//ScreenRecorderUtil.stopRecord();
	}

	@Test(priority = 9)
	public void updateSharer() throws Exception {
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Sharer";

		SharerPage sp = new SharerPage(driver);

		Thread.sleep(30000);
		sp.setSharerSearch(sharerEmail);
		logger.info("Search...");

		//ScreenRecorderUtil.startRecord("CheckingLinks");
		Thread.sleep(3000);
		sp.clickEditIconSharer();
		logger.info("Clicked On Edit...");

		Thread.sleep(3000);
		sp.clearSharerName();
		sp.setSharerName(reader.getCellData(sheetName, "Name", 3));
		logger.info("Sharer Name Updated...");

		Thread.sleep(3000);
		sp.clearSharerCode();
		sp.setSharerCode(reader.getCellData(sheetName, "Sharer Code", 3));
		logger.info("Sharer Code Updated...");

		Thread.sleep(3000);
		sp.clearSharerDesignation();
		sp.setSharerDesignation(reader.getCellData(sheetName, "Designation", 3));
		logger.info("Sharer Designation Updated...");

		Thread.sleep(3000);
		sp.clearSharerDepartment();
		sp.setSharerDepartment(reader.getCellData(sheetName, "Department", 3));
		logger.info("Sharer Department Updated...");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='fa fa-download']")).click();

		Thread.sleep(3000);
		sp.clearSharerPAN();
		sp.setSharerPan(reader.getCellData(sheetName, "Unique Identifier", 3));
		logger.info("Sharer PAN Updated...");

		Thread.sleep(3000);
		sp.clearSharerMobile();
		sp.setSharerMob(reader.getCellData(sheetName, "Tel Number", 3));
		logger.info("Sharer Tel Updated...");

		// Thread.sleep(3000);
		// sp.clearSharerTelNo();
		// sp.setSharerTel("91750469078");
		// logger.info("Sharer Tel No. Updated...");

		Thread.sleep(3000);
		sp.clickUpdateButton();
		logger.info("Sharer Updated Successfully...");

		Thread.sleep(3000);
		String msg = driver.findElement(By.id("alertSuccessMessage2")).getText();

		Thread.sleep(3000);
		sp.clickUpdateOkButton();

		if (msg.equals("Sharer updated successfully.")) {
			Assert.assertTrue(true);
			logger.info("Sharer updated Passed");
			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 3, "PASS");
		} else {
			captureScreen(driver, "SharerAdd");
			// Assert.assertTrue(false);
			logger.info("Sharer updated Failed");

			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 3, "FAIL");
		}
		//ScreenRecorderUtil.stopRecord();

	}

	@Test(priority = 10)
	public void clickOnDownloadFile() throws Exception {
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Sharer";

		SharerPage sp = new SharerPage(driver);

		Thread.sleep(30000);
		sp.clearSearchTextBox();
		Thread.sleep(3000);
		sp.setSharerSearch(sharerEmail);
		logger.info("Search...");

		//ScreenRecorderUtil.startRecord("CheckingLinks");

		Thread.sleep(3000);
		sp.clickDownloadIconListScreen();
		logger.info("File Downloaded Successfully...");

		Thread.sleep(3000);
		String msg = driver.findElement(By.xpath("//span[@class = 'cat__core__title']")).getText();

		if (msg.equals("Sharer List")) {
			Assert.assertTrue(true);
			logger.info("Sharer Download File Passed");
			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 4, "PASS");
		} else {
			captureScreen(driver, "SharerAdd");
			// Assert.assertTrue(false);
			logger.info("Sharer updated Failed");

			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 4, "FAIL");
		}
		//ScreenRecorderUtil.stopRecord();

	}

	@Test(priority = 11)
	public void checkSharerHistory() throws Exception {
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Sharer";

		SharerPage sp = new SharerPage(driver);
		Thread.sleep(30000);
		sp.clearSearchTextBox();

		//ScreenRecorderUtil.startRecord("CheckingLinks");
		Thread.sleep(3000);
		sp.setSharerSearch(sharerEmail);
		logger.info("Search...");

		Thread.sleep(3000);
		sp.clickHistoryIcon();
		logger.info("Clicked On History Icon...");

		Thread.sleep(3000);
		captureScreen(driver, "Sharer History");
		logger.info("Screenshot Taken of History Page...");

		Thread.sleep(3000);
		sp.clickExpExcelOfHistory();
		logger.info("Download Excel of History Page...");

		Thread.sleep(30000);
		sp.clickExpPDFOfHistory();
		logger.info("Download Excel of History Page...");

		Thread.sleep(3000);
		sp.clickCloseIconHistory();
		logger.info("Close History Popup...");

		Thread.sleep(3000);
		String msg = driver.findElement(By.xpath("//span[@class = 'cat__core__title']")).getText();

		if (msg.equals("Sharer List")) {
			Assert.assertTrue(true);
			logger.info("Sharer History Passed");
			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 5, "PASS");
		} else {
			captureScreen(driver, "SharerAdd");
			// Assert.assertTrue(false);
			logger.info("Sharer History Failed");

			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 5, "FAIL");
		}

		//ScreenRecorderUtil.stopRecord();

	}

	@Test(priority = 12)
	public void deleteSharerDetails() throws Exception {
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Sharer";

		SharerPage sp = new SharerPage(driver);
		Thread.sleep(30000);
		sp.clearSearchTextBox();
		Thread.sleep(3000);
		//ScreenRecorderUtil.startRecord("CheckingLinks");
		sp.setSharerSearch(sharerEmail);
		logger.info("Search...");

		Thread.sleep(3000);
		sp.sharerDelete();
		logger.info("Sharer Delete Successfully...");

		LoginPage lp = new LoginPage(driver);
		Thread.sleep(5000);
		lp.clickOnProfile();
		Thread.sleep(5000);
		lp.clickOnLogout();

		Thread.sleep(3000);
		String msg = driver.findElement(By.xpath("//span[@class = 'cat__core__title']")).getText();

		if (msg.equals("Sharer List")) {
			Assert.assertTrue(true);
			logger.info("Sharer Deleted Passed");
			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 6, "PASS");
		} else {
			captureScreen(driver, "SharerAdd");
			// Assert.assertTrue(false);
			logger.info("Sharer Deleted Passed");

			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 6, "FAIL");
		}

		//ScreenRecorderUtil.stopRecord();
	}

}
