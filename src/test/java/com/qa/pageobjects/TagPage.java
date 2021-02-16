package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TagPage {
	
	WebDriver ldriver;

	public TagPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "leftMenu")
	@CacheLookup
	WebElement leftMenu;

	@FindBy(xpath = "(//a[@href='javascript: void(0);'])[1]")
	@CacheLookup
	WebElement masterMenu;

	@FindBy(xpath = "//a[contains(text(),'Tag')]")
	@CacheLookup
	WebElement TagMenu;

	@FindBy(xpath = "//div[@class='card-header']")
	@CacheLookup
	WebElement cardHeader;

	@FindBy(xpath = "(//button[@class='btn btn-sm btn-primary' and @type='button'])[1]")
	@CacheLookup
	WebElement addTagButton;
	
	@FindBy(xpath = "//input[@id='groupName']")
	@CacheLookup
	WebElement Tagfield;
	
	@FindBy(xpath = "//button[@id='btnsaveGroup']")
	@CacheLookup
	WebElement SaveTagButton;
	
//	@FindBy(xpath = "//span[@id='alertSuccessMessage']")
//	@CacheLookup
//	WebElement SuccessMsg;
	
	@FindBy(xpath = "(//button[@class='close'])[1]")
	@CacheLookup
	WebElement CloseTagButton;
	
	@FindBy(xpath = "(//button[@class='btn btn-sm btn-primary' and @data-dismiss='modal'])[1]")
	@CacheLookup
	WebElement SaveOKTagButton;
	
	@FindBy(xpath = "//input[@type='search']")
	@CacheLookup
	WebElement searchTag;
	
	@FindBy(xpath = "//button[@class='btn-sm btn btn-warning' and @type='button']")
	@CacheLookup
	WebElement editTagIcon;
	
	@FindBy(xpath = "//button[@id='btnupdateGroup']")
	@CacheLookup
	WebElement UpdateTagButton;
	
	
	@FindBy(xpath = "(//button[@class='btn btn-sm btn-primary' and @data-dismiss='modal'])[1]")
	@CacheLookup
	WebElement UpdateOKTagButton;
	
	@FindBy(xpath = "//button[@class='btn-sm btn btn-danger']")
	@CacheLookup
	WebElement deleteTagIcon;
	
	@FindBy(xpath = "//button[@class='btn btn-sm btn-danger']")
	@CacheLookup
	WebElement deleteYesTagIcon;
	
	@FindBy(xpath = "(//button[@class='btn btn-sm'])[2]")
	@CacheLookup
	WebElement deleteNOTagIcon;
	
	@FindBy(xpath = "(//button[@class='btn btn-sm btn-primary' and @data-dismiss='modal'])[1]")
	@CacheLookup
	WebElement deleteOKTagIcon;
	
	@FindBy(xpath = "//button[@tabindex='0']")
	@CacheLookup
	WebElement exportToExcelTag;
	
//	@FindBy(xpath = "")
//	@CacheLookup
//	WebElement ;
//	
//	@FindBy(xpath = "")
//	@CacheLookup
//	WebElement ;
//	
//	@FindBy(xpath = "")
//	@CacheLookup
//	WebElement ;
//	
	
	
	
	public void clickleftMenu() {
		leftMenu.click();
	}

	public void clickMasterMenu() {
		masterMenu.click();
	}

	public void clickTagSubMenu() {
		TagMenu.click();
	}

	public void clickAddTagDetails() {
		addTagButton.click();
	}

	public void clickcardHeader() {
		cardHeader.click();
	}
	
	public void setTagFieldData(String tagf) {
		Tagfield.sendKeys(tagf);
	}

	public void clickSaveButton() {
		SaveTagButton.click();
	}
	
	
	public void clickSaveOKButton() {
		SaveOKTagButton.click();
	}
	
	
	public void setSearchTagTextField(String search) {
		searchTag.sendKeys(search);
	}
	
	public void clearSearch() {
		searchTag.clear();
	}
	
	public void clickEditIcon() {
		editTagIcon.click();
	}
	
	public void clearTagFieldData() {
		Tagfield.clear();
	}
	
	
	public void clickUpdateTagButton() {
		UpdateTagButton.click();
	}
	
	public void clickUpdateTagOKButton() {
		UpdateOKTagButton.click();
	}
	
	public void clickDeleteTagButton() {
		deleteTagIcon.click();
	}
	public void clickDeleteTagYesButton() {
		deleteYesTagIcon.click();
	}
	
	public void clickDeleteTagOKButton() {
		deleteOKTagIcon.click();
	}
	

	public void clickExportToExcelTag() {
		exportToExcelTag.click();
	}
	
	
	
	
	
	
	
	
	
	
	

}
