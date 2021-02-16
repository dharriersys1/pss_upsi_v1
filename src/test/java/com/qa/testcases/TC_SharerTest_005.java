package com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.SharerPage;
import com.qa.utilities.ScreenRecorderUtil;



public class TC_SharerTest_005 extends BaseClass{
	
	public String sharerEmail=randomestring()+"@gmail.com";
	
	@Test(priority=8)
	public void addSharer() throws Exception
	{
		//ScreenRecorderUtil.startRecord("CheckingLinks");
		
		
		
		
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
		
		SharerPage sp = new SharerPage(driver);
		
		Thread.sleep(30000);
		sp.clickleftMenu();
		logger.info("Click On Left Menu");
		
		Thread.sleep(3000);
		sp.clickUpsiMenu();
		logger.info("Click On UPSI Menu");
		
		Thread.sleep(5000);
		sp.clickUpsiSharerMenu();
		logger.info("Click On UPSI Sharer Menu");
		
		ScreenRecorderUtil.startRecord("CheckingLinks");
		Thread.sleep(3000);
		sp.clickAddSharer();
		logger.info("Click On Add Sharer button");
		
		Thread.sleep(3000);
		sp.setSharerName("Dinesh Wasudeo Kumbhare");
		logger.info("Sharer Name Added");
		
		
		Thread.sleep(3000);
		sp.setSharerCode("Test_123");
		logger.info("Sharer Code Added");
		
		
		Thread.sleep(3000);
		sp.setSharerDesignation("Software Test Engineer");
		logger.info("Sharer Designation Added");
		
		Thread.sleep(3000);
		sp.setSharerDepartment("Testing");
		logger.info("Sharer Department Added");
		
		
		Thread.sleep(3000);
		sp.selSharerPan();
		logger.info("PAN Selected");
		
		Thread.sleep(3000);
		sp.setSharerPan("AAAAA1111A");
		logger.info("PAN Entered");
		
		Thread.sleep(3000);
		sp.setSharerFile("D:\\Dinesh\\Harrier\\PSS\\PSS+Goveva\\Automation Files(sikuli)\\2.PNG");
		logger.info("File Uploaded");
		
		//String email=randomestring()+"@gmail.com";
		
		Thread.sleep(3000);
		sp.setSharerEmail(sharerEmail.toLowerCase());
		logger.info("Email Entered");
		
		Thread.sleep(3000);
		sp.setSharerMob("7517691781");
		logger.info("Mob No. Entered");
		
		Thread.sleep(3000);
		sp.setSharerTel("75176917814");
		logger.info("Tel No. Entered");
		
		
		Thread.sleep(3000);
		sp.clickSaveButton();
		logger.info("Clicked On Save");	
		ScreenRecorderUtil.stopRecord();
		
	}
	
	@Test(priority=9)
	public void updateSharer() throws InterruptedException
	{
		SharerPage sp = new SharerPage(driver);
		
		Thread.sleep(30000);
		sp.setSharerSearch(sharerEmail);
		logger.info("Search...");
		
		Thread.sleep(3000);
		sp.clickEditIconSharer();
		logger.info("Clicked On Edit...");
		
		Thread.sleep(3000);
		sp.clearSharerName();
		sp.setSharerName("Punit Kumbhare");
		logger.info("Sharer Name Updated...");
		
		Thread.sleep(3000);
		sp.clearSharerCode();
		sp.setSharerCode("Test@1234");
		logger.info("Sharer Code Updated...");
		
		Thread.sleep(3000);
		sp.clearSharerDesignation();
		sp.setSharerDesignation("Quality Analyst");
		logger.info("Sharer Designation Updated...");
		
		Thread.sleep(3000);
		sp.clearSharerDepartment();
		sp.setSharerDepartment("Softwrae");
		logger.info("Sharer Department Updated...");
		
		
		Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='fa fa-download']")).click();
		
        Thread.sleep(3000);
		sp.clearSharerPAN();
		sp.setSharerPan("BBBBB1111B");
		logger.info("Sharer PAN Updated...");
        
		Thread.sleep(3000);
		sp.clearSharerMobile();
		sp.setSharerMob("9175046907");
		logger.info("Sharer Tel Updated...");
		
		
		//Thread.sleep(3000);
		//sp.clearSharerTelNo();
		//sp.setSharerTel("91750469078");
		//logger.info("Sharer Tel No. Updated...");
		
		Thread.sleep(3000);
		sp.clickUpdateButton();
		logger.info("Sharer Updated Successfully...");
		
		
	}
	
	@Test(priority=10)
	public void clickOnDownloadFile() throws InterruptedException
	{
		SharerPage sp = new SharerPage(driver);
		
		Thread.sleep(30000);
		sp.clearSearchTextBox();
		Thread.sleep(3000);
		sp.setSharerSearch(sharerEmail);
		logger.info("Search...");
		
		Thread.sleep(3000);
		sp.clickDownloadIconListScreen();
		logger.info("File Downloaded Successfully...");
		
	}
	
	@Test(priority=11)
    public void checkSharerHistory() throws InterruptedException, IOException
    {
		SharerPage sp = new SharerPage(driver);
		Thread.sleep(30000);
		sp.clearSearchTextBox();
		Thread.sleep(3000);
		sp.setSharerSearch(sharerEmail);
		logger.info("Search...");
		
		Thread.sleep(3000);
		sp.clickHistoryIcon();
		logger.info("Clicked On History Icon...");
		
		Thread.sleep(3000);
		captureScreen(driver,"Sharer History");
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
		
    }
	
	@Test(priority=12)
    public void deleteSharerDetails() throws Exception 
    {
		SharerPage sp = new SharerPage(driver);
		Thread.sleep(30000);
		sp.clearSearchTextBox();
		Thread.sleep(3000);
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
		
	  //  ScreenRecorderUtil.stopRecord();
    }
	
}
