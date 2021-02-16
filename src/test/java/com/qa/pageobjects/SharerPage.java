package com.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SharerPage {
	
	WebDriver ldriver;
	//public static String msg;
	public SharerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy(id="leftMenu")
	@CacheLookup
	WebElement leftMenu;
	
	@FindBy(xpath="(//a[@href='javascript: void(0);'])[2]")
	@CacheLookup
	WebElement upsiMenu;
	
	@FindBy(xpath="//a[contains(text(),'UPSI Sharer')]")
	@CacheLookup
	WebElement upsiSharerMenu;
	
	@FindBy(xpath="(//button[@type='button' and @class='btn btn-sm btn-primary mb-2'])[1]")
	@CacheLookup
	WebElement addSharerButton;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	@CacheLookup
	WebElement sharerName;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	@CacheLookup
	WebElement sharerCode;
	

	@FindBy(xpath="(//input[@type='text'])[3]")
	@CacheLookup
	WebElement sharerDesignation;
	
	

	@FindBy(xpath="(//input[@type='text'])[4]")
	@CacheLookup
	WebElement sharerDepartment;
	
	

	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-invalid']//option)[2]")
	@CacheLookup
	WebElement sharerPAN;
	
	

	@FindBy(xpath="//div//input[@type='file' and @class='form-control']")
	@CacheLookup
	WebElement sharerUploadFile;
	
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	@CacheLookup
	WebElement sharerPutPAN;
	
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	@CacheLookup
	WebElement sharerEmailID;
	
	

	@FindBy(xpath="(//div[@class='form-group']/input)[8]")
	@CacheLookup
	WebElement sharerMobNo;
	
	

	@FindBy(xpath="(//div[@class='form-group']/input)[9]")
	@CacheLookup
	WebElement sharerTelNo;
	
	

	@FindBy(xpath="//button[@id='btnSaveMeeting']")
	@CacheLookup
	WebElement sharerSaveButton;
	
	

	@FindBy(xpath="(//button[@class='btn btn-sm btn-primary' and @data-dismiss='modal'])[2]")
	@CacheLookup
	WebElement sharerSaveOK;
	
	
	
	@FindBy(id="alertSuccessMessage2")
	@CacheLookup
	WebElement sucessMessgae;
	
	

	@FindBy(xpath="//input[@type='search']")
	@CacheLookup
	WebElement sharerSearchTextBox;
	
	

	@FindBy(xpath="//button[@title='Edit' and @type='button' and @class = 'btn-sm btn btn-warning']")
	@CacheLookup
	WebElement sharerEditIcon;
	
	
	@FindBy(xpath="//i[@class='fa fa-download']")
	@CacheLookup
	WebElement sharerDownloadFile;
	
	
	@FindBy(xpath="//i[@class='fa fa-close']")
	@CacheLookup
	WebElement closeSharerDownloadFile;
	
	

	@FindBy(xpath="//input[@type='file' and @class='form-control']")
	@CacheLookup
	WebElement sharerReUploadFile;
	
	

	@FindBy(xpath="//button[@id='btnSaveMeeting']")
	@CacheLookup
	WebElement sharerUpdateButton;
	
	

	@FindBy(xpath="(//button[@class='btn btn-sm btn-primary' and @data-dismiss='modal'])[2]")
	@CacheLookup
	WebElement sharerUpdateOK;
	

	@FindBy(xpath="(//span[@class='fa fa-download'])[1]")
	@CacheLookup
	WebElement sharerDownloadList;
	
	
	
	@FindBy(xpath="//button[@title='History']")
	@CacheLookup
	WebElement sharerHistoryIcon;
	
	

	@FindBy(xpath="//button[@class='dt-button buttons-excel buttons-html5 btn btn-sm btn-warning export-btn' and @aria-controls='sharerHistorytable']")
	@CacheLookup
	WebElement sharerExportToxlsOnHistory;
	
	

	@FindBy(xpath="//button[@class='dt-button buttons-pdf buttons-html5 btn btn-sm btn-warning export-btn' and @aria-controls='sharerHistorytable']")
	@CacheLookup
	WebElement sharerExportPDFOnHistory;
	
	

	@FindBy(xpath="(//button[@class='close'])[2]")
	@CacheLookup
	WebElement sharerHistoryCloseIcon;
	

	@FindBy(xpath="//button[@class='btn-sm btn btn-danger']")
	@CacheLookup
	WebElement sharerDeleteIcon;
	
	
	@FindBy(xpath="//button[@class='btn btn-sm btn-danger']")
	@CacheLookup
	WebElement sharerDeleteYes;
	
	

	@FindBy(xpath="(//button[@class='btn btn-sm btn-primary'])[6]")
	@CacheLookup
	WebElement sharerDeleteOK;
	
	
	@FindBy(xpath="//img[@id='userProfilePic']")
	@CacheLookup
	WebElement profilePic;
	
	@FindBy(xpath="(//a[@class='dropdown-item' and @href='javascript:void(0)'])[3]")
	@CacheLookup
	WebElement logout;
	
	public void clickleftMenu()
	{
		leftMenu.click();
	}
	
	public void clickUpsiMenu()
	{
		upsiMenu.click();
	}

	public void clickUpsiSharerMenu()
	{
		upsiSharerMenu.click();
	}
	
	public void clickAddSharer()
	{
		 
		addSharerButton.click();
		
	}
	
	public void setSharerName(String sname)
	{
		sharerName.sendKeys(sname);
	}
	
	public void setSharerCode(String scode)
	{
		sharerCode.sendKeys(scode);
		
	}
	
	public void setSharerDesignation(String sdesignation)
	{
		sharerDesignation.sendKeys(sdesignation);
		
		
	}
	
	public void setSharerDepartment(String sDept)
	{
		
		sharerDepartment.sendKeys(sDept);
		
	}
	
	public void selSharerPan()
	{
		sharerPAN.click();
		
	}
	
	public void setSharerPan(String span)
	{
		
		sharerPutPAN.sendKeys(span);
		
	}
	
	public void setSharerFile(String sfile)
	{
		
		sharerUploadFile.sendKeys(sfile);
		
	}
	
	public void setSharerEmail(String semail)
	{
		
		sharerEmailID.sendKeys(semail);
		
	}
	
	public void setSharerMob(String smob)
	{
		
		sharerMobNo.sendKeys(smob);
		
	}
	
	public void setSharerTel(String stel)
	{
		
		sharerTelNo.sendKeys(stel);
		
	}
	
	
	public void clickSaveButton() 
	{
		sharerSaveButton.click();
		//Thread.sleep(3000);
		//String msg = sucessMessgae.getText();
		//Thread.sleep(3000);
		//sharerSaveOK.click();
		
	}
	
	public void clickSaveOKButton() 
	{
		sharerSaveOK.click();
		
	}
	
	
	
	//public void setSharerE(String semai)
	//{
		
	//	sharerSearchTextBox.sendKeys(semai);
		
	//}
	
	public void setSharerSearch(String sSearchBox)
	{
		
		sharerSearchTextBox.sendKeys(sSearchBox);
		
	}
	
	public void clickEditIconSharer()
	{
		
		//new WebDriverWait(ldriver, 30).until(ExpectedConditions.elementToBeClickable(sharerEditIcon)).click();
		
		sharerEditIcon.click();
		
	}
	
	public void clearSharerName()
	{
		sharerName.clear();
		
	}
	
	public void clearSharerCode()
	{
		sharerCode.clear();
		
	}
	
	public void clearSharerDesignation()
	{
		sharerDesignation.clear();
		
	}
	
	public void clearSharerDepartment()
	{
		sharerDepartment.clear();
		
	}
	
	public void clearSharerPAN()
	{
		sharerPutPAN.clear();
		
	}
	
	public void clearSharerEmailID()
	{
		sharerEmailID.clear();
		
	}
	
	public void clearSharerMobile()
	{
		sharerMobNo.clear();
		
	}
	
	public void clearSharerTelNo()
	{
		sharerTelNo.clear();
		
	}
	
	
	public void clickUpdateButton() throws InterruptedException
	{
		sharerUpdateButton.click();
		//Thread.sleep(3000);
		//sharerUpdateOK.click();
		
	}
	
	
	public void clickUpdateOkButton() 
	{
	
		sharerUpdateOK.click();
		
	}
	
	
	public void clearSearchTextBox()
	{
		sharerSearchTextBox.clear();
		
	}
	
	
	public void clickDownloadIconListScreen()
	{
		sharerDownloadList.click();
		
	}
	
	public void clickHistoryIcon()
	{
		sharerHistoryIcon.click();
		
	}
	
	public void clickExpExcelOfHistory()
	{
		sharerExportToxlsOnHistory.click();
		
	}
	
	
	public void clickExpPDFOfHistory()
	{
		sharerExportPDFOnHistory.click();
		
	}
	
	
	public void clickCloseIconHistory()
	{
		sharerHistoryCloseIcon.click();
		
	}

	public void sharerDelete() throws InterruptedException
	{
		sharerDeleteIcon.click();
		Thread.sleep(2000);
		sharerDeleteYes.click();
		Thread.sleep(2000);
		sharerDeleteOK.click();
	}
	
	
	
	
	
	
	
	
	
	
}
