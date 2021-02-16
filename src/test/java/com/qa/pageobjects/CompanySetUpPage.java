package com.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanySetUpPage {

	WebDriver ldriver;

	String date_of_incorporation = "10-May-2000";

	public CompanySetUpPage(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	@FindBy(id = "leftMenu")
	@CacheLookup
	WebElement leftMenu;

	@FindBy(xpath = "(//a[@href='javascript: void(0);'])[1]")
	@CacheLookup
	WebElement masterMenu;

	@FindBy(xpath = "//span[contains(text(),'Company')]")
	@CacheLookup
	WebElement companyMenu;

	@FindBy(xpath = "//button[contains(text(), 'Add New Company')]")
	@CacheLookup
	WebElement addNewCompany;

	@FindBy(xpath = "(//input[@name='url'])[1]")
	@CacheLookup
	WebElement pssApiUrl;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	@CacheLookup
	WebElement isGEMSub;

	@FindBy(xpath = "(//input[@name='url'])[3]")
	@CacheLookup
	WebElement gemApiUrl;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	@CacheLookup
	WebElement isADSub;

	@FindBy(xpath = "//input[@placeholder='Url']")
	@CacheLookup
	WebElement ADurl;

	@FindBy(xpath = "//input[@placeholder= 'AD Password']")
	@CacheLookup
	WebElement ADPassword;

	@FindBy(xpath = "//input[@placeholder= 'Email ID']")
	@CacheLookup
	WebElement ADAdminEmail;

	@FindBy(xpath = "(//div/select[@style='padding:6px;'])[1]")
	@CacheLookup
	WebElement regdIDCIN;

	@FindBy(xpath = "//option[@value='CIN']")
	@CacheLookup
	WebElement regdIDCIN2;

	@FindBy(xpath = "//input[@placeholder = 'Registration Number']")
	@CacheLookup
	WebElement regdNumber;

	@FindBy(xpath = "(//div/select[@style='padding:6px;'])[2]")
	@CacheLookup
	WebElement typeOfCompanyPublic;

	@FindBy(xpath = "//option[@value='Public']")
	@CacheLookup
	WebElement typeOfCompanyPublic2;

	@FindBy(xpath = "(//div/select[@style='padding:6px;'])[3]")
	@CacheLookup
	WebElement CatOfCompanyResident;

	@FindBy(xpath = "//option[@value='Resident']")
	@CacheLookup
	WebElement CatOfCompanyResident2;

	@FindBy(xpath = "//textarea[@rows=3]")
	@CacheLookup
	WebElement regdOfficeAddress;

	@FindBy(xpath = "//input[@placeholder='ISIN']")
	@CacheLookup
	WebElement ISIN;

	@FindBy(xpath = "//input[@placeholder='EVA']")
	@CacheLookup
	WebElement EVA;

	@FindBy(xpath = "//input[@name='listedCompany' and @type = 'radio' and @value='true']")
	@CacheLookup
	WebElement listedComYes;

	@FindBy(xpath = "//input[@name='listedCompany' and @type = 'radio' and @value='false']")
	@CacheLookup
	WebElement listedComNo;

	@FindBy(xpath = "//input[@name = 'nbfc' and @value = 'Yes']")
	@CacheLookup
	WebElement NBFCYes;

	@FindBy(id = "//input[@name = 'nbfc' and @value = 'No']")
	@CacheLookup
	WebElement NBFCNo;

	@FindBy(xpath = "//input[@name = 'acceptdeposits' and @value = 'true']")
	@CacheLookup
	WebElement AcceptsDepositsYes;

	@FindBy(xpath = "//input[@name = 'acceptdeposits' and @value = 'false']")
	@CacheLookup
	WebElement AcceptsDepositsNo;

	@FindBy(xpath = "(//input[@type='number'])[2]")
	@CacheLookup
	WebElement numberOfShareholders;

	@FindBy(xpath = "(//input[@type='number'])[3]")
	@CacheLookup
	WebElement numberOfDebt;

	@FindBy(xpath = "(//input[@type='number'])[4]")
	@CacheLookup
	WebElement numberOfDepo;

	@FindBy(xpath = "(//input[@type='number'])[5]")
	@CacheLookup
	WebElement numberOfSecurity;

	@FindBy(xpath = "//button[@id = 'btnsaveCompany']")
	@CacheLookup
	WebElement saveCompany;

	@FindBy(xpath = "//div[@class='card-header']")
	@CacheLookup
	WebElement cardHeader;

	public void date(String date) throws Throwable {
		String date1 = date;
		System.out.println(date1);
		String splitter[] = date1.split("-");
		String day = splitter[0];
		String month = splitter[1];
		String year = splitter[2];

		ldriver.findElement(By.xpath("(//select[@tabindex='-1'])[2]")).click();
		WebElement year1 = ldriver.findElement(By.xpath("//option[contains(text(),'" + year + "')]"));
		Thread.sleep(1000);
		JavascriptExecutor yearscroll = (JavascriptExecutor) ldriver;
		yearscroll.executeScript("arguments[0].scrollIntoView(true);", year1);
		year1.click();
		Thread.sleep(1000);
		// month
		ldriver.findElement(By.xpath("(//select[@tabindex='-1'])[1]")).click();
		ldriver.findElement(By.xpath("//option[contains(text(),'" + month + "')]")).click();
		Thread.sleep(1000);
		// day
		ldriver.findElement(By.xpath("(//div[@class='btn-light'][contains(text(),'" + day + "')])[1]")).click();
	}

	public void clickleftMenu() {
		leftMenu.click();
	}

	public void clickMasterMenu() {
		masterMenu.click();
	}

	public void clickCompanySubmenu() {
		companyMenu.click();
	}

	public void clickAddNewCompany() {
		addNewCompany.click();
	}

	public void setPssApiUrl(String pssapi) {
		pssApiUrl.sendKeys(pssapi);
	}

	public void clickGEMSub() {
		isGEMSub.click();
	}

	public void setGEMurl(String gemapi) {
		gemApiUrl.sendKeys(gemapi);
	}

	public void clickADSub() {
		isADSub.click();
	}

	public void setADUrl(String adurl) {
		ADurl.sendKeys(adurl);
	}

	public void setADAdminEmail(String adminEmail) {
		ADAdminEmail.sendKeys(adminEmail);
	}

	public void setAdPassword(String adpass) {
		ADPassword.sendKeys(adpass);
	}

	public void clickRegdIDasCIN() throws Exception {

		regdIDCIN.click();

		Thread.sleep(3000);

		regdIDCIN2.click();
	}

	public void setRegdNumber(String rnumb) {
		regdNumber.sendKeys(rnumb);
	}

	public void clickTypeOfComapny() {
		typeOfCompanyPublic.click();
		typeOfCompanyPublic2.click();
	}

	public void clickListed() {
		listedComYes.click();
	}

	public void clickCatOfCompany() {
		CatOfCompanyResident.click();
		CatOfCompanyResident2.click();
	}

	public void setRegdOfficeAddress(String ComAddress) {
		regdOfficeAddress.sendKeys(ComAddress);
	}

	public void setDateOfIncorporation() throws Throwable {

		// date_of_incorporation
		if (date_of_incorporation != null && date_of_incorporation != "") {
			ldriver.findElement(By.name("dpIncorporation")).click();
			date(date_of_incorporation);
		}

	}

	public void setComISIN(String isin) {
		ISIN.sendKeys(isin);
	}

	public void setComEVA(String eva) {
		EVA.sendKeys(eva);
	}

	public void clickNBFC() {
		NBFCYes.click();
	}

	public void clickAcceptDeposite() {
		AcceptsDepositsYes.click();
	}

	public void setNumberOfShareHolders(String nShare) {
		numberOfShareholders.sendKeys(nShare);
	}

	public void setNumberOfDebentures(String nDebt) {
		numberOfDebt.sendKeys(nDebt);
	}

	public void setNumberOfDeposite(String nDepo) {
		numberOfDepo.sendKeys(nDepo);
	}

	public void setNumberOfSecurity(String nSecurity) {
		numberOfSecurity.sendKeys(nSecurity);
	}

	public void clickSaveComapny() {
		saveCompany.click();
	}

	public void clickcardHeader() {
		cardHeader.click();
	}

}
