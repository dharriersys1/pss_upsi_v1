package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgendaCategoryPage {
	
	
	WebDriver ldriver;

	public AgendaCategoryPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "leftMenu")
	@CacheLookup
	WebElement leftMenu;

	@FindBy(xpath = "(//a[@href='javascript: void(0);'])[1]")
	@CacheLookup
	WebElement masterMenu;

	@FindBy(xpath = "//a[contains(text(),'Agenda Categories')]")
	@CacheLookup
	WebElement AgendaCategorySubMenu;

	@FindBy(xpath = "//div[@class='card-header']")
	@CacheLookup
	WebElement cardHeader;

	@FindBy(xpath = "//button[@class='btn btn-sm btn-primary mb-2' and @type='button']")
	@CacheLookup
	WebElement addCategoryButton;
	
	
	@FindBy(xpath = "//label[@for='categoryTypeCompany']")
	@CacheLookup
	WebElement catTypeCompany;
	
	@FindBy(xpath = "//label[@for='categoryTypeGlobal']")
	@CacheLookup
	WebElement catTypeGlobal;
	
	@FindBy(xpath = "//label[@for='isDefaultNo']")
	@CacheLookup
	WebElement catDefaultNo;
	
	@FindBy(xpath = "//label[@for='isDefaultYes']")
	@CacheLookup
	WebElement catDefaultYes;
	
	@FindBy(xpath = "//input[@class='form-control ng-untouched ng-pristine ng-invalid']")
	@CacheLookup
	WebElement categoryName;
	
	@FindBy(xpath = "//button[@id='btnsaveCategory']")
	@CacheLookup
	WebElement saveCategoryButton;
	
	@FindBy(xpath = "(//button[@class='close'])[1]")
	@CacheLookup
	WebElement closeCategoryIcon;
	
	@FindBy(xpath = "//input[@type='search']")
	@CacheLookup
	WebElement searchTextBox;
	
	@FindBy(xpath = "//button[@class='btn-sm btn btn-warning']")
	@CacheLookup
	WebElement editCategoryIcon;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[1]")
	@CacheLookup
	WebElement updateCategoryName;
	
	@FindBy(xpath = "//button[@id='btnupdateCategory']")
	@CacheLookup
	WebElement updateCategoryButton;
	
	@FindBy(xpath = "//button[@class='btn-sm btn btn-danger']")
	@CacheLookup
	WebElement deleteCategoryIcon;
	
	@FindBy(xpath = "//button[@class='btn btn-sm btn-danger']")
	@CacheLookup
	WebElement deleteConfirmYes;
	
	
	@FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[3]")
	@CacheLookup
	WebElement deleteOK;
	
	@FindBy(xpath = "//button[@tabindex='0']")
	@CacheLookup
	WebElement exportToExcelCategory;
	
	@FindBy(xpath = "//select[@id='selectMeetingType']")
	@CacheLookup
	WebElement selectMeetingTypeCat;
	
	@FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[3]")
	@CacheLookup
	WebElement saveOK;
	
	@FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[3]")
	@CacheLookup
	WebElement updateOK;
	

	public void clickleftMenu() {
		leftMenu.click();
	}

	public void clickMasterMenu() {
		masterMenu.click();
	}

	public void clickAgendaCategoryMenu() {
		AgendaCategorySubMenu.click();
	}

	public void clickaddCategoryButtons() {
		addCategoryButton.click();
	}

	public void clickcardHeader() {
		cardHeader.click();
	}

	
	public void setCategoryName(String catName) {
		categoryName.sendKeys(catName);
	}

	
	public void selectMeetingType() {
		selectMeetingTypeCat.click();
		
	}
	
	public void clickCatTypeCompany() {
		catTypeCompany.click();
	}
	
	public void clickCatTypeGlobal() {
		catTypeGlobal.click();
	}
	
	public void clickCatDefaultYes() {
		catDefaultYes.click();
	}
	
	public void clickCatDefaultNo() {
		catDefaultNo.click();
	}
	
	public void clickSaveCatButton() {
		saveCategoryButton.click();
	}
	
	public void clickSaveCatOKButton() {
		saveOK.click();
	}

	public void setCategorySearch(String cSearch) {
		searchTextBox.sendKeys(cSearch);
	}
	
	public void clickEditCatIcon() {
		editCategoryIcon.click();
	}
	
	public void setUpdateCatName(String cNameUpdate) {
		updateCategoryName.sendKeys(cNameUpdate);
	}
	
	public void clearUpdateCatName (){
		updateCategoryName.clear();
	}
	
	public void clickUpdateCategoryButton() {
		updateCategoryButton.click();
	}
	
	
	public void clickUpdateOKCategoryButton() {
		updateOK.click();
	}
	
	
	
	
	public void clearCategorySearch() {
		searchTextBox.clear();
	}
	
	public void clickDeleteCatIcon() {
		deleteCategoryIcon.click();
	}
	
	public void clickDeleteYesCatIcon() {
		deleteConfirmYes.click();
	}
	
	public void clickDeleteOKCatIcon() {
		deleteOK.click();
	}
	
	public void clickExportToExcelCategory() {
		exportToExcelCategory.click();
	}
	
	
	
	
	
	
	}

















