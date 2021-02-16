package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageobjects.CompanyFinancialDetailsPage;
import com.qa.pageobjects.LoginPage;
import com.qa.utilities.Xls_Reader;

public class TC_ComapnyFinancialDetailsTest_012 extends BaseClass {
	
	
	//String financial_year = "2010-11" ;
	
	@Test(priority = 22)
	public void addCompanyFinancialDetails() throws Exception
	{
		
		LoginPage lp = new LoginPage(driver);

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Company Financial Details";
		
		String financial_year = reader.getCellData(sheetName, "Financial Year", 2);
		

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

		CompanyFinancialDetailsPage fp = new CompanyFinancialDetailsPage(driver);
		
		
		Thread.sleep(30000);
		fp.clickleftMenu();
		logger.info("Clicked on Left Menu");
   
		Thread.sleep(3000);
		fp.clickMasterMenu();
		logger.info("Clicked On Master Menu...");

		Thread.sleep(3000);
		fp.clickCompanyFinancialMenu();
		logger.info("Clicked On Company Financial Sub menu...");

		Thread.sleep(3000);
		fp.clickcardHeader();
		
		
		Thread.sleep(3000);
		fp.clickaddFinancialDetails();
		logger.info("Clicked On Add Financial Details...");
		
		Thread.sleep(3000);
		fp.selectFinancialYear();
		driver.findElement(By.xpath("//option[@value='" + financial_year + "']")).click();
		//System.out.println(financial_year);
		logger.info("Financial Year Selected...");
		
		
		Thread.sleep(3000);
		fp.setAuthorizedEquity(reader.getCellData(sheetName, "Authorized Equity Share Capital", 2));
		logger.info("Entered Authorized Equity Share Capital...");
		
		Thread.sleep(3000);
		fp.setIssuedEquity(reader.getCellData(sheetName, "Issued Equity Share Capital", 2));
		logger.info("Entered Issued Equity Share Capital...");
		
		Thread.sleep(3000);
		fp.setSubscribedEquity(reader.getCellData(sheetName, "Subscribed Equity Share Capital", 2));
		logger.info("Entered Subscribed Equity Share Capital...");
		
		Thread.sleep(3000);
		fp.setPaidupEquity(reader.getCellData(sheetName, "Paidup Equity Share Capital", 2));
		logger.info("Entered Paidup Equity Share Capital...");
		
		
		Thread.sleep(3000);
		fp.setAuthorizedPreference(reader.getCellData(sheetName, "Authorized Preference Share Capital", 2));
		logger.info("Entered Authorized Preference Share Capital...");
		
		Thread.sleep(3000);
		fp.setIssuedPreference(reader.getCellData(sheetName, "Issued Preference Share Capital", 2));
		logger.info("Entered Issued Preference Share Capital...");
		
		Thread.sleep(3000);
		fp.setSubscribedPreference(reader.getCellData(sheetName, "Subscribed Preference Share Capital", 2));
		logger.info("Entered Subscribed Preference Share Capital...");
		
		Thread.sleep(3000);
		fp.setPaidupPreference(reader.getCellData(sheetName, "Paidup Preference Share Capital", 2));
		logger.info("Entered Paidup Preference Share Capital...");
		
		Thread.sleep(3000);
		fp.clickSaveButton();
		Thread.sleep(3000);
		fp.clickSaveOKButton();
		logger.info("Save Share Capital Details...");
		
		
		
		Thread.sleep(3000);
		fp.clickReserveAndSurplusTab();
		logger.info("Clicked On Reserve And Surplus Tab...");

		
		Thread.sleep(3000);
		fp.setGeneralReserve(reader.getCellData(sheetName, "General Reserve", 2));
		logger.info("Entered General Reserve...");
		
		Thread.sleep(3000);
		fp.setSurplusinPL(reader.getCellData(sheetName, "Surplus in P & L", 2));
		logger.info("Entered Surplus in P & L...");
		
		Thread.sleep(3000);
		fp.setDebitBalanceinPL(reader.getCellData(sheetName, "Debit Balance in P & L", 2));
		logger.info("Entered Debit Balance in P & L...");
		
		Thread.sleep(3000);
		fp.setOthers1(reader.getCellData(sheetName, "Others R&S", 2));
		logger.info("Entered Others 1...");
		
		
		Thread.sleep(3000);
		fp.setCapital_Reserve_proceeds_received_in_cash(reader.getCellData(sheetName, "Capital Reserve (proceeds received in cash)", 2));
		logger.info("Entered Capital Reserve (proceeds received in cash)...");
		
		Thread.sleep(3000);
		fp.setCapital_Reserve_proceeds_not_received_in_cash(reader.getCellData(sheetName, "Capital Reserve (proceeds not received in cash)"
		, 2));
		logger.info("Entered Capital Reserve (proceeds not received in cash)...");
		
		Thread.sleep(3000);
		fp.setCapitalRedemptionReserve(reader.getCellData(sheetName, "Capital Redemption Reserve (In excess of Preference shares redeemed)", 2));
		logger.info("Entered Capital Redemption Reserve (In excess of Preference shares redeemed)...");
		
		Thread.sleep(3000);
		fp.setSecurityPremiumReserve(reader.getCellData(sheetName, "Security Premium Reserve", 2));
		logger.info("Entered Security Premium Reserve...");
		
		Thread.sleep(3000);
		fp.setOthers2(reader.getCellData(sheetName, "Others2 R&S", 2));
		logger.info("Entered Others 2...");
		
		
		Thread.sleep(3000);
		fp.setTurnover(reader.getCellData(sheetName, "Turnover", 2));
		logger.info("Entered Turnover...");
		
		Thread.sleep(3000);
		fp.setNetProfitManagerial(reader.getCellData(sheetName, "Net Profit (For managerial remuneration)", 2));
		logger.info("Entered Net Profit (For managerial remuneration)...");
		
		Thread.sleep(3000);
		fp.setNetProfitCSR(reader.getCellData(sheetName, "Net Profit (For CSR Applicability)", 2));
		logger.info("Entered Net Profit (For CSR Applicability)...");
		
		Thread.sleep(3000);
		fp.clickSaveButton();
		Thread.sleep(3000);
		fp.clickSaveOKButton();
		logger.info("Save Reserve And Surplus Details...");
		
		
		Thread.sleep(6000);
		fp.clickLoansAndInvestmentsTab();
		logger.info("Clicked On Loans And Investments Tab...");
		
		
		Thread.sleep(3000);
		fp.setLoansGiven(reader.getCellData(sheetName, "Loans given", 2));
		logger.info("Entered Loans given...");
		
		Thread.sleep(3000);
		fp.setGuaranteeOrSecurityGiven(reader.getCellData(sheetName, "Guarantee or security given", 2));
		logger.info("Guarantee or security given...");
		
		Thread.sleep(3000);
		fp.setAcquisitionOfSecurities(reader.getCellData(sheetName, "Acquisition of securities", 2));
		logger.info("Entered Acquisition of securities...");
		
		Thread.sleep(3000);
		fp.setOthersLoansAndInvestment(reader.getCellData(sheetName, "Others L&I", 2));
		logger.info("Entered Others Loans And Investments...");
		
		
		Thread.sleep(3000);
		fp.clickSaveButton();
		Thread.sleep(3000);
		fp.clickSaveOKButton();
		logger.info("Save Loan And Investment Details...");
		
		
		
		
		Thread.sleep(6000);
		fp.clickBorrowingsTab();
		logger.info("Clicked On Borrowings Tab...");
		
		
		Thread.sleep(3000);
		fp.setLoansFromBank(reader.getCellData(sheetName, "Loans from Bank and Financial Institutions", 2));
		logger.info("Entered Loans from Bank and Financial Institutions...");
		
		Thread.sleep(3000);
		fp.setDeferredPaymentLiabilities(reader.getCellData(sheetName, "Deferred Payment Liabilities", 2));
		logger.info("Entered Deferred Payment Liabilities...");
		
		Thread.sleep(3000);
		fp.setDepositsLongAndShort(reader.getCellData(sheetName, "Deposits (long term and short term)", 2));
		logger.info("Entered Deposits (long term and short term)...");
		
		Thread.sleep(3000);
		fp.setLoansAndAdvances(reader.getCellData(sheetName, "Loans and Advances", 2));
		logger.info("Entered Loans and Advances...");
		
		Thread.sleep(3000);
		fp.setLongTermMaturities(reader.getCellData(sheetName, "Long Term Maturities of Lease Obligations", 2));
		logger.info("Entered Long Term Maturities of Lease Obligations...");
		
		Thread.sleep(3000);
		fp.setBondsAndDebentures(reader.getCellData(sheetName, "Bonds and Debentures", 2));
		logger.info("Entered Bonds and Debentures...");
		
		Thread.sleep(3000);
		fp.setOthersBorrowings(reader.getCellData(sheetName, "Others Borrowings", 2));
		logger.info("Entered Others Borrowings...");
		
		
		Thread.sleep(3000);
		fp.clickSaveButton();
		Thread.sleep(3000);
		fp.clickSaveOKButton();
		logger.info("Save Borrowings Details...");
		
		
		
		Thread.sleep(6000);
		fp.clickTemporaryLoansTab();
		logger.info("Clicked On Temporary Loans Tab...");
		
		Thread.sleep(3000);
		fp.setShortTermLoans(reader.getCellData(sheetName, "Short Term Loans", 2));
		logger.info("Entered Short Term Loans...");
		
		Thread.sleep(3000);
		fp.setCashCreditArrangements(reader.getCellData(sheetName, "Cash Credit Arrangements", 2));
		logger.info("Entered Cash Credit Arrangements...");
		
		Thread.sleep(3000);
		fp.setDiscountingOfBills(reader.getCellData(sheetName, "Discounting of Bills", 2));
		logger.info("Entered Discounting of Bills...");
		
		Thread.sleep(3000);
		fp.setOtherShortTermLoans(reader.getCellData(sheetName, "Other Short Term Loans of Seasonal Character", 2));
		logger.info("Entered Other Short Term Loans of Seasonal Character...");
		
		Thread.sleep(3000);
		fp.setOthersTemporaryLoans(reader.getCellData(sheetName, "Others Temp", 2));
		logger.info("Entered Others Temporory Loans...");
		
		Thread.sleep(3000);
		fp.clickSaveButton();
		logger.info("Save Temporory Loans Details...");
		
		Thread.sleep(3000);
	    String msg = driver.findElement(By.xpath("//span[@id='alertSuccessMessage']")).getText();
		
		
		Thread.sleep(3000);
		fp.clickSaveOKButton();
		logger.info("Save Ok Temporory Loans Details...");
		
		Thread.sleep(3000);
		fp.clickBackButton();
		logger.info("Click On Back Button...");
		
		
		 if (msg.equals("Financial data updated successfully.")) {
				Assert.assertTrue(true);
				logger.info("Add Financial Details Passed");
				reader.addColumn(sheetName, "Test Case Result");

				reader.setCellData(sheetName, "Test Case Result", 2, "PASS");
			} else {
				captureScreen(driver, "Financial Details Add");
				// Assert.assertTrue(false);
				logger.info("Add Financial Details Failed");

				reader.addColumn(sheetName, "Test Case Result");

				reader.setCellData(sheetName, "Test Case Result", 2, "FAIL");
			}

		
		
	}
	
	
	
	
	@Test(priority = 23)
	public void updateCompanyFinancialDetails() throws Exception {
		
		LoginPage lp = new LoginPage(driver);

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Company Financial Details";
		
		String financial_year = reader.getCellData(sheetName, "Financial Year", 2);
		
		CompanyFinancialDetailsPage fp = new CompanyFinancialDetailsPage(driver);
		
		
		Thread.sleep(30000);
		fp.setSearch(financial_year);
		logger.info("Searched...");
		
		Thread.sleep(3000);
		fp.clickEditIcon();
		logger.info("Clicked On Edit Icon...");
		
		Thread.sleep(3000);
		fp.clickUpdateButton();
		logger.info("Clicked On Update Button...");
		
		Thread.sleep(3000);
	    String msg = driver.findElement(By.xpath("//span[@id='alertSuccessMessage']")).getText();
		
		Thread.sleep(3000);
		fp.clickupdateOKButton();
		logger.info("Click On Update ok Button...");
		
		Thread.sleep(3000);
		fp.clickBackButton();
		logger.info("Click On Back Button...");
		
		
		if (msg.equals("Financial data updated successfully.")) {
			Assert.assertTrue(true);
			logger.info("Update Financial Details Passed");
			reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 2, "PASS");
		} else {
			captureScreen(driver, "Financial Details Add");
			// Assert.assertTrue(false);
			logger.info("Update Financial Details Failed");

			reader.addColumn(sheetName, "Test Case Result");

			reader.setCellData(sheetName, "Test Case Result", 2, "FAIL");
		}

	
		
	}
	
	
	@Test(priority = 24)
	public void exportToExcelCompanyFinancialDetails() throws Exception {
	
	
		LoginPage lp = new LoginPage(driver);

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Company Financial Details";
		
		String financial_year = reader.getCellData(sheetName, "Financial Year", 2);
		
		CompanyFinancialDetailsPage fp = new CompanyFinancialDetailsPage(driver);
		
		Thread.sleep(30000);
		fp.clickClear();
		logger.info("SearchBox Cleared...");
		
		Thread.sleep(3000);
		fp.clickExportToExcel();
		logger.info("Export To Excel...");
		
		Thread.sleep(3000);
		fp.clickcardHeader();
		logger.info("Export To Excel...");
		
		
		Thread.sleep(3000);
		String msg = driver.findElement(By.xpath("//span[@class = 'cat__core__title']")).getText();
		
		if (msg.equals("Financial Data List")) {
			Assert.assertTrue(true);
			logger.info("Export To Excel File Passed");
			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 4, "PASS");
		} else {
			captureScreen(driver, "Export To Excel File Download");
			// Assert.assertTrue(false);
			logger.info("Export To Excel File Failed");

			// reader.addColumn(sheetName, "status");

			reader.setCellData(sheetName, "Test Case Result", 4, "FAIL");
		}
		
	
		
		
	}
	
	
	

}
