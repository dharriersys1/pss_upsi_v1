package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.qa.pageobjects.LibraryTaskListPage;
import com.qa.pageobjects.LoginPage;
import com.qa.utilities.Xls_Reader;

public class TC_LibraryTaskListTest_016 extends BaseClass{
	
	@Test(priority = 22)
	public void addLibraryTaskDetails() throws Throwable 
	{
		LoginPage lp = new LoginPage(driver);

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Committee";
     
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


		LibraryTaskListPage ltp = new LibraryTaskListPage(driver);
		
		Thread.sleep(30000);
		ltp.clickLeftMenu();
		
		Thread.sleep(3000);
		ltp.clickComplianceMenu();
		
		Thread.sleep(3000);
		ltp.clickTaskMenu();
		
		Thread.sleep(3000);
		ltp.clickLibraryTaskListSubMenu();
		
		Thread.sleep(3000);
		ltp.clickCardHeader();
		
		Thread.sleep(3000);
		ltp.clickCreateTaskButton();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
