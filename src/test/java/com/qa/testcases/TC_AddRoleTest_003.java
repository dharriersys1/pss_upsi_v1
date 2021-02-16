package com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.RolePage;

public class TC_AddRoleTest_003 extends BaseClass {

	@Test(priority = 3)
	public void addNewRole() throws InterruptedException, IOException {

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

		RolePage rp = new RolePage(driver);

		Thread.sleep(5000);
		rp.clickleftMenu();
		Thread.sleep(3000);
		rp.clickmasterMenu();
		Thread.sleep(3000);
		rp.clickroleMenu();
		Thread.sleep(3000);
		rp.clickcardHeader();
		Thread.sleep(3000);
		rp.clickaddRole();
		Thread.sleep(3000);
		rp.setroleName("Harrier");
		Thread.sleep(3000);
		rp.clickmasterMenuAddRole();
		Thread.sleep(3000);
		rp.clickmasterCheckboxAddRole();
		Thread.sleep(3000);
		rp.clickmasterSubMenuAddRole();
		Thread.sleep(3000);
		rp.clickupsiAddRole();
		Thread.sleep(3000);
		rp.clickupsiSelAllAddRole();
		Thread.sleep(3000);
		rp.clicksaveOnAddRole();

		logger.info("validation started....");

		String card = driver.findElement(By.xpath("//div[@class='card-header']")).getText();

		System.out.println(card);

		boolean res = driver.findElement(By.xpath("//div[@class='card-header']")).getText().contains("Role Master");

		// boolean res=driver.getPageSource().contains("Role added
		// successfully.");

		if (res == true) {
			Assert.assertTrue(true);
			logger.info("test case passed....");

		} else {
			logger.info("test case failed....");
			captureScreen(driver, "Add New Role");
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 4)
	public void updateNewRole() throws InterruptedException, IOException {

		RolePage rp = new RolePage(driver);

		logger.info("Searching....");
		Thread.sleep(30000);
		rp.setsearchTextBox("Harrier");

		logger.info("Click On Edit Icon....");
		Thread.sleep(5000);
		rp.clickeditIcon();

		logger.info("Clear Role Name....");
		Thread.sleep(5000);
		rp.clickclearRoleName();

		logger.info("Update Role Name....");
		Thread.sleep(5000);
		rp.setuprname("New Harrier");

		logger.info("Click on UpdateButton....");
		Thread.sleep(5000);
		rp.clickupdateButton();

		logger.info("validation started....");

		String card = driver.findElement(By.xpath("//div[@class='card-header']")).getText();

		System.out.println(card);

		boolean res = driver.findElement(By.xpath("//div[@class='card-header']")).getText().contains("Role Master");

		// boolean res=driver.getPageSource().contains("Role added
		// successfully.");

		if (res == true) {
			Assert.assertTrue(true);
			logger.info("test case passed....");

		} else {
			logger.info("test case failed....");
			captureScreen(driver, "Update Role Name");
			Assert.assertTrue(false);
		}

	}

	/*
	 * @Test public void DeleteNewRole() throws InterruptedException,
	 * IOException {
	 * 
	 * RolePage rp = new RolePage(driver);
	 * 
	 * logger.info("Click on Delete Button...."); Thread.sleep(3000);
	 * rp.clickdeleteButton();
	 * 
	 * logger.info("Click on Confirm Delete Button...."); Thread.sleep(3000);
	 * rp.clickconfirmDeleteButton();
	 * 
	 * 
	 * boolean
	 * res=driver.findElement(By.xpath("//div[@class='card-header']")).getText()
	 * .contains("Role Master");
	 * 
	 * //boolean res=driver.getPageSource().contains("Role added successfully."
	 * );
	 * 
	 * if(res==true) { Assert.assertTrue(true); logger.info(
	 * "test case passed....");
	 * 
	 * } else { logger.info("test case failed...."); captureScreen(driver,
	 * "Delete Role"); Assert.assertTrue(false); }
	 * 
	 * }
	 */

	@Test(priority = 5)
	public void DeleteNewRole() throws InterruptedException, IOException {

		RolePage rp = new RolePage(driver);

		Thread.sleep(30000);
		rp.clearSearchTextBox();

		logger.info("Searching....");
		Thread.sleep(5000);
		rp.setsearchTextBox("Harrier");

		Thread.sleep(5000);
		rp.clickdeleteButton();

		Thread.sleep(5000);
		rp.clickconfirmDeleteButton();

		LoginPage lp = new LoginPage(driver);
		Thread.sleep(5000);
		lp.clickOnProfile();
		Thread.sleep(5000);
		lp.clickOnLogout();

	}

}
