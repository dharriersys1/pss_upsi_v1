package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.qa.pageobjects.CompanySetUpPage;
import com.qa.pageobjects.LoginPage;
import com.qa.utilities.Xls_Reader;

public class TC_CompanySetup_011 extends BaseClass{
	
	
	
	@Test(priority = 22)
	public void addNewCompany() throws Throwable
	{
      LoginPage lp = new LoginPage(driver);
      
      
      Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Comapny Setup";
		
		
		
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
		
		
		CompanySetUpPage cp = new CompanySetUpPage(driver);
		
		Thread.sleep(30000);
		cp.clickleftMenu();
		logger.info("Click On Left Menu");
		
		Thread.sleep(5000);
		cp.clickMasterMenu();
		logger.info("Click On Master Menu");
		
		Thread.sleep(5000);
		cp.clickCompanySubmenu();
		logger.info("Click On Company Sub Menu");
		
		Thread.sleep(30000);
		cp.clickcardHeader();
		
		Thread.sleep(5000);
		cp.clickAddNewCompany();
		logger.info("Click On Add New Company");
		
		Thread.sleep(3000);
		cp.setPssApiUrl(reader.getCellData(sheetName, "API URL", 2));
		logger.info("PSS API Url Added");
		
		Thread.sleep(3000);
		cp.clickGEMSub();
		logger.info("Click On GEM Subscribe");
		
		Thread.sleep(3000);
		cp.setGEMurl(reader.getCellData(sheetName, "GEM API URL", 2));
		logger.info("GEM API Url Added");
		
		Thread.sleep(3000);
		cp.clickRegdIDasCIN();
		logger.info("CIN is selected");
		
		Thread.sleep(3000);
		cp.setRegdNumber(reader.getCellData(sheetName, "Registration Number", 2));
		logger.info("Registration Number is Added");
		
		Thread.sleep(3000);
		cp.clickTypeOfComapny();
		logger.info("Type Of Company is selected");
		
		Thread.sleep(3000);
		cp.clickListed();
		logger.info("Listed selected");
		
		Thread.sleep(3000);
		cp.clickCatOfCompany();
		logger.info("Category Of Company is selected");
		
		Thread.sleep(3000);
		cp.setRegdOfficeAddress(reader.getCellData(sheetName, "Registered Office Address", 2));
		logger.info("Registered Office Address is Added");
		
		Thread.sleep(3000);
	    cp.setDateOfIncorporation();
	    logger.info("Date of Incorporation Added...");
		
		Thread.sleep(3000);
		cp.setComISIN(reader.getCellData(sheetName, "ISIN", 2));
		logger.info("ISIN is Added");
		
		Thread.sleep(3000);
		cp.setComEVA(reader.getCellData(sheetName, "EVA", 2));
		logger.info("EVA is Added");
		
		Thread.sleep(3000);
		cp.clickNBFC();
		logger.info("NBFC selected");
		
		Thread.sleep(3000);
		cp.clickAcceptDeposite();
		logger.info("Accept Deposite selected");
		
		Thread.sleep(3000);
		cp.setNumberOfShareHolders(reader.getCellData(sheetName, "Number of Shareholders", 2));
		logger.info("Number of Shareholders is Added");
		
		Thread.sleep(3000);
		cp.setNumberOfDebentures(reader.getCellData(sheetName, "Number of Debenture-Holders", 2));
		logger.info("Number of Debenture-Holders is Added");
		
		Thread.sleep(3000);
		cp.setNumberOfDeposite(reader.getCellData(sheetName, "Number of Deposit-Holders", 2));
		logger.info("Number of Deposit-Holders is Added");
		
		Thread.sleep(3000);
		cp.setNumberOfSecurity(reader.getCellData(sheetName, "Number of Security-Holders", 2));
		logger.info("Number of Security-Holders is Added");
		

//		Thread.sleep(3000);
//		cp.clickSaveComapny();
//		logger.info("Click On Saved Company Details");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
