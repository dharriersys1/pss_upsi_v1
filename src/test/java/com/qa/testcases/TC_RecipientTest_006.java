package com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.RecipientPage;
import com.qa.pageobjects.SharerPage;

public class TC_RecipientTest_006 extends BaseClass {
	
	public String recipientEmail=randomestring()+"@yahoo.com";
	
	//WebDriverWait wait = new WebDriverWait(driver, 30);
	
	@Test(priority=13)
	public void addRecipient() throws InterruptedException
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
	
	
	    RecipientPage rp = new RecipientPage(driver);
	    
	    Thread.sleep(3000);
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
	    rp.setRecipientName("Dinesh Recipient");
	    logger.info("Entered Recipient Name...");	
	    
	    Thread.sleep(3000);
	    rp.setRecipientCode("Dinesh@123");
	    logger.info("Entered Recipient Code...");	
	    
	    Thread.sleep(3000);
	    rp.setRecipientDesignation("Software Test Engineer");
	    logger.info("Clicked On Save");	
	    
	    Thread.sleep(3000);
	    rp.setRecipientCompanyName("Harrier Info.Sys");
	    logger.info("Entered Company Name");	
	    
	    Thread.sleep(3000);
	    rp.setRecipientAddress_1("Shanti Park");
	    logger.info("Entered Address_1...");	
	    
	    Thread.sleep(3000);
	    rp.setRecipientAddress_2("Harrier Nagar");
	    logger.info("Entered Address_2...");	
	    
	    Thread.sleep(3000);
	    rp.setRecipientAddress_3("Besa");
	    logger.info("Entered Address_3...");	
	    
	    Thread.sleep(3000);
	    rp.setRecipientCity("Nagpur");
	    logger.info("Entered City...");	
	    
	    Thread.sleep(3000);
	    rp.setRecipientPIN("123456");
	    logger.info("Entered PIN");	
	    
	    Thread.sleep(3000);
	    rp.clickRcipientTypeOfRecipient();
	    logger.info("Entered Type Of Recipient...");	
	    
	    Thread.sleep(3000);
	    rp.clickRecipientPAN();
	    	
	    
	    Thread.sleep(3000);
	    rp.setRecipientPutPAN("HHHHH7777H");
	    logger.info("Enetered PAN...");	
	    
	    Thread.sleep(3000);
	    rp.setRecipientUploadFile("D:\\Dinesh\\Harrier\\PSS\\PSS+Goveva\\Automation Files(sikuli)\\2.PNG");
	    logger.info("Enetered File...");	
	    
	    Thread.sleep(3000);
	    rp.setRecipientEmailID(recipientEmail.toLowerCase());
	    logger.info("Entered Email");	
	    
	    Thread.sleep(3000);
	    rp.setRecipientMobileNo("7517691781");
	    logger.info("Enetered Mobile Number...");	
	    
	    Thread.sleep(3000);
	    rp.setRecipientTelNo("75176917815");
	    logger.info("Enetered Tel No...");	
	    
	    Thread.sleep(3000);
	    rp.clickRecipientSave();
	    logger.info("Clicked On Save");	
	    
	    
	
	}

	@Test(priority=14)
	public void updateRecipient() throws InterruptedException
	{
		 RecipientPage rp = new RecipientPage(driver);
		
		 
		//Thread.sleep(30000);
	    rp.setRecipientSearchTextBox(recipientEmail);
	   	
	    
	    Thread.sleep(3000);
	    rp.clickRecipientEditIcon();
	    
	    
	    Thread.sleep(3000);
	    rp.clearRecipientName();
	    rp.setRecipientName("Punit Kumbhare");
	    
	    Thread.sleep(3000);
	    rp.clearRecipientCode();
	    rp.setRecipientCode("Test@101");
	    
	    Thread.sleep(3000);
	    rp.clearRecipientDesignation();
	    rp.setRecipientDesignation("Test Manager");
	    
	    Thread.sleep(3000);
	    rp.clearRecipientCompanyName();
	    rp.setRecipientCompanyName("Lupin Ltd");	
	    
	    Thread.sleep(3000);
	    rp.clearRecipientAddress_1();
	    rp.setRecipientAddress_1("Near Hanuman nagar");
	    
	    Thread.sleep(3000);
	    rp.clearrecipientAddress_2();
	    rp.setRecipientAddress_2("plot.no.23");
	    
	    Thread.sleep(3000);
	    rp.clearRecipientAddress_3();
	    rp.setRecipientAddress_3("Sakkardara");
	    
	    Thread.sleep(3000);
	    rp.clearRecipientCity();
	    rp.setRecipientCity("Pune");
	   
	    
	    Thread.sleep(3000);
	    rp.clearRecipientPIN();
	    rp.setRecipientPIN("909090");
	    
	    Thread.sleep(3000);
	    rp.clearRecipientPutPAN();
	    rp.setRecipientPutPAN("UUUUU8888U");
	    
	    Thread.sleep(3000);
	    rp.clearRecipientMobileNo();
	    rp.setRecipientMobileNo("00000000000");
	    
	   
	    Thread.sleep(3000);
	    rp.clickRecipientUpdate();
	    logger.info("User Details Updated Successfully...");	
	
	}
	
	@Test(priority=15)
	public void clickOnDownloadFile() throws InterruptedException
	{
		RecipientPage rp = new RecipientPage(driver);
		
		Thread.sleep(30000);
		rp.clearRecipientSearchTextBox();
		Thread.sleep(3000);
		rp.setRecipientSearchTextBox(recipientEmail);
		logger.info("Search...");
		
		Thread.sleep(3000);
		rp.clickDownloadOnList();
		logger.info("File Downloaded Successfully...");
		
			
	}	
	
	@Test(priority=16)
    public void checkRecipientHistory() throws InterruptedException, IOException
    {
		RecipientPage rp = new RecipientPage(driver);
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
		
    }
	
	@Test(priority=17)
    public void deleteSharerDetails() throws InterruptedException 
    {
		RecipientPage rp = new RecipientPage(driver);
		Thread.sleep(30000);
		rp.clearRecipientSearchTextBox();
		Thread.sleep(3000);
		rp.setRecipientSearchTextBox(recipientEmail);
		logger.info("Search...");
		
		Thread.sleep(3000);
		rp.recipientDelete();
		logger.info("Recipient Delete Successfully...");
		
		
		
		LoginPage lp = new LoginPage(driver);
	    Thread.sleep(5000);	
	    lp.clickOnProfile();
	    Thread.sleep(5000);
	    lp.clickOnLogout();
		
    }}
