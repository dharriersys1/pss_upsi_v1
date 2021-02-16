package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyFinancialDetailsPage {

	WebDriver ldriver;

	public CompanyFinancialDetailsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "leftMenu")
	@CacheLookup
	WebElement leftMenu;

	@FindBy(xpath = "(//a[@href='javascript: void(0);'])[1]")
	@CacheLookup
	WebElement masterMenu;

	@FindBy(xpath = "//a[contains(text(),'Company Financial Details')]")
	@CacheLookup
	WebElement companyFinancialMenu;

	@FindBy(xpath = "//div[@class='card-header']")
	@CacheLookup
	WebElement cardHeader;

	@FindBy(xpath = "//button[@class='btn btn-sm btn-primary pull-right']")
	@CacheLookup
	WebElement addFinancialDetails;
	
	@FindBy(xpath = "//a[contains(text(), 'Share Capital')]")
	@CacheLookup
	WebElement Share_Capital;

	@FindBy(xpath = "(//div/select[@style='padding:6px;'])[1]")
	@CacheLookup
	WebElement FinancialYear;

	//@FindBy(xpath = "//option[@value='2010-11']")
	//@CacheLookup
	//WebElement FinancialYear20;

	@FindBy(xpath = "(//input[@min='0'])[1]")
	@CacheLookup
	WebElement Authorized_Equity_Share_Capital;

	@FindBy(xpath = "(//input[@min='0'])[2]")
	@CacheLookup
	WebElement Issued_Equity_Share_Capital;

	@FindBy(xpath = "(//input[@min='0'])[3]")
	@CacheLookup
	WebElement Subscribed_Equity_Share_Capital;

	@FindBy(xpath = "(//input[@min='0'])[4]")
	@CacheLookup
	WebElement Paidup_Equity_Share_Capital;

	@FindBy(xpath = "(//input[@min='0'])[5]")
	@CacheLookup
	WebElement Authorized_Preference_Share_Capital;

	@FindBy(xpath = "(//input[@min='0'])[6]")
	@CacheLookup
	WebElement Issued_Preference_Share_Capital;

	@FindBy(xpath = "(//input[@min='0'])[7]")
	@CacheLookup
	WebElement Subscribed_Preference_Share_Capital;

	@FindBy(xpath = "(//input[@min='0'])[8]")
	@CacheLookup
	WebElement Paidup_Preference_Share_Capital;

	@FindBy(xpath = "//button[@id='btnsaveCompany']")
	@CacheLookup
	WebElement SaveButton;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	@CacheLookup
	WebElement SaveOKButton;
	
	
	
	

	@FindBy(xpath = "//a[contains(text(), 'Reserves and Surplus')]")
	@CacheLookup
	WebElement Reserves_and_Surplus;

	@FindBy(xpath = "(//input[@min='0'])[1]")
	@CacheLookup
	WebElement General_Reserve;

	@FindBy(xpath = "(//input[@min='0'])[2]")
	@CacheLookup
	WebElement Surplus_in_PL;

	@FindBy(xpath = "(//input[@min='0'])[3]")
	@CacheLookup
	WebElement Debit_Balance_in_PL;

	@FindBy(xpath = "(//input[@min='0'])[4]")
	@CacheLookup
	WebElement Others_1;

	@FindBy(xpath = "(//input[@min='0'])[5]")
	@CacheLookup
	WebElement Capital_Reserve_proceeds_received_in_cash;

	@FindBy(xpath = "(//input[@min='0'])[6]")
	@CacheLookup
	WebElement Capital_Reserve_proceeds_not_received_in_cash;

	@FindBy(xpath = "(//input[@min='0'])[7]")
	@CacheLookup
	WebElement Capital_Redemption_Reserve_In_excess_of_Preference_shares_redeemed;

	@FindBy(xpath = "(//input[@min='0'])[8]")
	@CacheLookup
	WebElement Security_Premium_Reserve;

	@FindBy(xpath = "(//input[@min='0'])[9]")
	@CacheLookup
	WebElement Others_2;

	@FindBy(xpath = "(//input[@min='0'])[14]")
	@CacheLookup
	WebElement Turnover;

	@FindBy(xpath = "(//input[@min='0'])[15]")
	@CacheLookup
	WebElement Net_Profit_For_managerial_remuneration;

	@FindBy(xpath = "(//input[@min='0'])[16]")
	@CacheLookup
	WebElement Net_Profit_For_CSR_Applicability;
	
	
	@FindBy(xpath = "//a[contains(text(), 'Loans and Investments')]")
	@CacheLookup
	WebElement Loans_and_Investments;
	
	@FindBy(xpath = "(//input[@min='0'])[1]")
	@CacheLookup
	WebElement Loans_given;
	
	@FindBy(xpath = "(//input[@min='0'])[2]")
	@CacheLookup
	WebElement Guarantee_or_security_given;
	
	@FindBy(xpath = "(//input[@min='0'])[3]")
	@CacheLookup
	WebElement Acquisition_of_securities;
	
	@FindBy(xpath = "(//input[@min='0'])[4]")
	@CacheLookup
	WebElement Others_LI;
	
	
	
	@FindBy(xpath = "//a[contains(text(), 'Borrowings')]")
	@CacheLookup
	WebElement Borrowings;
	
	@FindBy(xpath = "(//input[@min='0'])[1]")
	@CacheLookup
	WebElement Loans_from_Bank_and_Financial_Institutions;
	
	@FindBy(xpath = "(//input[@min='0'])[2]")
	@CacheLookup
	WebElement Deferred_Payment_Liabilities;
	
	@FindBy(xpath = "(//input[@min='0'])[3]")
	@CacheLookup
	WebElement Deposits_long_term_and_short_term;
	
	@FindBy(xpath = "(//input[@min='0'])[4]")
	@CacheLookup
	WebElement Loans_and_Advances;
	
	@FindBy(xpath = "(//input[@min='0'])[5]")
	@CacheLookup
	WebElement Long_Term_Maturities_of_Lease_Obligations;
	
	@FindBy(xpath = "(//input[@min='0'])[6]")
	@CacheLookup
	WebElement Bonds_and_Debentures;
	
	@FindBy(xpath = "(//input[@min='0'])[7]")
	@CacheLookup
	WebElement Others_Borrowings;
	
	
	@FindBy(xpath = "//a[contains(text(), 'Temporary Loan')]")
	@CacheLookup
	WebElement Temporary_Loans;
	
	@FindBy(xpath = "(//input[@min='0'])[1]")
	@CacheLookup
	WebElement Short_Term_Loans;
	
	@FindBy(xpath = "(//input[@min='0'])[2]")
	@CacheLookup
	WebElement Cash_Credit_Arrangements;
	
	@FindBy(xpath = "(//input[@min='0'])[3]")
	@CacheLookup
	WebElement Discounting_of_Bills;
	
	@FindBy(xpath = "(//input[@min='0'])[4]")
	@CacheLookup
	WebElement Other_Short_Term_Loans_of_Seasonal_Character;
	
	
	@FindBy(xpath = "(//input[@min='0'])[5]")
	@CacheLookup
	WebElement Others_Temporary_Loans;
	
	
	@FindBy(xpath = "(//button[@type='button'])[1]")
	@CacheLookup
	WebElement BackButton;
	
	@FindBy(xpath = "//input[@type='search']")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	@CacheLookup
	WebElement editIcon;
	
	@FindBy(xpath = "//button[@id='btnsaveCompany']")
	@CacheLookup
	WebElement updateButton;
	
	@FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[1]")
	@CacheLookup
	WebElement updateOKButton;
	
	@FindBy(xpath = "//button[@tabindex='0']")
	@CacheLookup
	WebElement exportToExcel;
	

	

	public void clickleftMenu() {
		leftMenu.click();
	}

	public void clickMasterMenu() {
		masterMenu.click();
	}

	public void clickCompanyFinancialMenu() {
		companyFinancialMenu.click();
	}

	public void clickaddFinancialDetails() {
		addFinancialDetails.click();
	}

	public void clickcardHeader() {
		cardHeader.click();
	}

	public void selectFinancialYear() {
		FinancialYear.click();
		//FinancialYear20.click();
	}

	public void setAuthorizedEquity(String authEquity) {
		Authorized_Equity_Share_Capital.sendKeys(authEquity);
	}

	public void setIssuedEquity(String issueEquity) {
		Issued_Equity_Share_Capital.sendKeys(issueEquity);
	}

	public void setSubscribedEquity(String subEquity) {
		Subscribed_Equity_Share_Capital.sendKeys(subEquity);
	}

	public void setPaidupEquity(String paidEquity) {
		Paidup_Equity_Share_Capital.sendKeys(paidEquity);
	}

	public void setAuthorizedPreference(String authPreference) {
		Authorized_Preference_Share_Capital.sendKeys(authPreference);
	}

	public void setIssuedPreference(String issuePreference) {
		Issued_Preference_Share_Capital.sendKeys(issuePreference);
	}

	public void setSubscribedPreference(String subPreference) {
		Subscribed_Preference_Share_Capital.sendKeys(subPreference);
	}

	public void setPaidupPreference(String paidPreference) {
		Paidup_Preference_Share_Capital.sendKeys(paidPreference);
	}

	public void clickReserveAndSurplusTab() {
		Reserves_and_Surplus.click();
	}

	public void setGeneralReserve(String genRes) {
		General_Reserve.sendKeys(genRes);
	}

	public void setSurplusinPL(String SurPL) {
		Surplus_in_PL.sendKeys(SurPL);
	}

	public void setDebitBalanceinPL(String DebtPL) {
		Debit_Balance_in_PL.sendKeys(DebtPL);
	}

	public void setOthers1(String oth1) {
		Others_1.sendKeys(oth1);
	}

	public void setCapital_Reserve_proceeds_received_in_cash(String CapRes1) {
		Capital_Reserve_proceeds_received_in_cash.sendKeys(CapRes1);
	}

	public void setCapital_Reserve_proceeds_not_received_in_cash(String CapRes2) {
		Capital_Reserve_proceeds_not_received_in_cash.sendKeys(CapRes2);
	}

	public void setCapitalRedemptionReserve(String capRedemption) {
		Capital_Redemption_Reserve_In_excess_of_Preference_shares_redeemed.sendKeys(capRedemption);
	}

	public void setSecurityPremiumReserve(String secPremiumRes) {
		Security_Premium_Reserve.sendKeys(secPremiumRes);
	}

	public void setOthers2(String oth2) {
		Others_2.sendKeys(oth2);
	}

	public void setTurnover(String turn) {
		Turnover.sendKeys(turn);
	}

	public void setNetProfitManagerial(String npManegerial) {
		Net_Profit_For_managerial_remuneration.sendKeys(npManegerial);
	}

	public void setNetProfitCSR(String npCSR) {
		Net_Profit_For_CSR_Applicability.sendKeys(npCSR);
	}
	
	
	
	public void clickLoansAndInvestmentsTab() {
		Loans_and_Investments.click();
	}
	
	
	public void setLoansGiven(String loansGiven) {
		Loans_given.sendKeys(loansGiven);
	}
	
	public void setGuaranteeOrSecurityGiven(String guaranteeGiven) {
		Guarantee_or_security_given.sendKeys(guaranteeGiven);
	}
	
	public void setAcquisitionOfSecurities(String AcquSecurities) {
		Acquisition_of_securities.sendKeys(AcquSecurities);
	}
	
	public void setOthersLoansAndInvestment(String othLI) {
		Others_LI.sendKeys(othLI);
	}
	
	
	public void clickBorrowingsTab() {
		Borrowings.click();
	}
	
	public void setLoansFromBank(String lfromBank) {
		Loans_from_Bank_and_Financial_Institutions.sendKeys(lfromBank);
	}
	
	public void setDeferredPaymentLiabilities(String dfl) {
		Deferred_Payment_Liabilities.sendKeys(dfl);
	}
	
	public void setDepositsLongAndShort(String depo) {
		Deposits_long_term_and_short_term.sendKeys(depo);
	}
	
	public void setLoansAndAdvances(String loansAndAdv) {
		Loans_and_Advances.sendKeys(loansAndAdv);
	}
	
	public void setLongTermMaturities(String longTermMaturity) {
		Long_Term_Maturities_of_Lease_Obligations.sendKeys(longTermMaturity);
	}
	
	public void setBondsAndDebentures(String bondAndDebt) {
		Bonds_and_Debentures.sendKeys(bondAndDebt);
	}
	
	public void setOthersBorrowings(String othBorr) {
		Others_Borrowings.sendKeys(othBorr);
	}
	
	
	public void clickTemporaryLoansTab() {
		Temporary_Loans.click();
	}
	
	
	public void setShortTermLoans(String shortTermLoans) {
		Short_Term_Loans.sendKeys(shortTermLoans);
	}
	
	public void setCashCreditArrangements(String cashCredit) {
		Cash_Credit_Arrangements.sendKeys(cashCredit);
	}
	
	public void setDiscountingOfBills(String discOfBills) {
		Discounting_of_Bills.sendKeys(discOfBills);
	}
	
	public void setOtherShortTermLoans(String othShortTermLoans) {
		Other_Short_Term_Loans_of_Seasonal_Character.sendKeys(othShortTermLoans);
	}
	
	public void setOthersTemporaryLoans(String othTemp) {
		Others_Temporary_Loans.sendKeys(othTemp);
	}
	

	public void clickSaveButton() {
		SaveButton.click();
	}
	
	
	public void clickSaveOKButton() {
		SaveOKButton.click();
	}
	
	public void setSearch(String search) {
		Search.sendKeys(search);
	}
	
	public void clickClear() {
		Search.clear();
	}
	
	public void clickEditIcon() {
		editIcon.click();
	}
	
	public void clickUpdateButton() {
		updateButton.click();
	}
	
	public void clickupdateOKButton() {
		updateOKButton.click();
	}
	
	public void clickExportToExcel() {
		exportToExcel.click();
	}
	
	public void clickBackButton() {
	 BackButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
