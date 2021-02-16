package com.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecipientPage {

WebDriver ldriver;

//WebDriverWait wait = new WebDriverWait(ldriver, 30);
	
	public RecipientPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	
		//@CacheLookup
		//WebElement leftMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("leftMenu")));
	
	@FindBy(id="leftMenu")
	@CacheLookup
	WebElement leftMenu;
	
	@FindBy(xpath="(//a[@href='javascript: void(0);'])[2]")
	@CacheLookup
	WebElement upsiMenu;
	
	@FindBy(xpath="//a[contains(text(),'UPSI Recipient')]")
	@CacheLookup
	WebElement upsiRecipientMenu;
	
	
	@FindBy(xpath="(//button[@class='btn btn-sm btn-primary mb-2' ])[1]")
	@CacheLookup
	WebElement addRecipientButton;
	
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	@CacheLookup
	WebElement recipientName;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	@CacheLookup
	WebElement recipientCode;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	@CacheLookup
	WebElement recipientDesignation;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	@CacheLookup
	WebElement recipientCompanyName;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	@CacheLookup
	WebElement recipientAddress_1;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	@CacheLookup
	WebElement recipientAddress_2;
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	@CacheLookup
	WebElement recipientAddress_3;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	@CacheLookup
	WebElement recipientCity;
	
	@FindBy(xpath="(//input[@type='text'])[9]")
	@CacheLookup
	WebElement recipientPIN;
	
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-invalid']//option)[2]")
	@CacheLookup
	WebElement recipientTypeOfRecipient;
	
	@FindBy(xpath="//select[@class='form-control ng-untouched ng-pristine ng-invalid']/option[contains(text(), 'PAN')]")
	@CacheLookup
	WebElement recipientPAN;
	
	@FindBy(xpath="(//input[@type='text'])[10]")
	@CacheLookup
	WebElement recipientPutPAN;
	
	@FindBy(xpath="//div//input[@type='file' and @class='form-control']")
	@CacheLookup
	WebElement recipientUploadFile;
	
	@FindBy(xpath="(//input[@type='text'])[11]")
	@CacheLookup
	WebElement recipientEmailID;
	
	@FindBy(xpath="(//div[@class='form-group']/input)[13]")
	@CacheLookup
	WebElement recipientMobileNo;
	
	@FindBy(xpath="(//div[@class='form-group']/input)[14]")
	@CacheLookup
	WebElement recipientTelNo;
	
	@FindBy(xpath="//button[@id='btnSaveMeeting']")
	@CacheLookup
	WebElement recipientSave;
	
	@FindBy(xpath="(//button[@class='btn btn-sm btn-primary'])[3]")
	@CacheLookup
	WebElement recipientSaveOK;
	
	@FindBy(xpath="//input[@type='search']")
	@CacheLookup
	WebElement recipientSearchTextBox;
	
	@FindBy(xpath="//button[@title='Edit']")
	@CacheLookup
	WebElement recipientEditIcon;
	
	@FindBy(xpath="//button[@id='btnSaveMeeting']")
	@CacheLookup
	WebElement recipientUpdateButton;
	
	@FindBy(xpath="(//button[@type='button'])[8]")
	@CacheLookup
	WebElement recipientUpdateOk;
	
	@FindBy(xpath="(//span[@class='fa fa-download'])[1]")
	@CacheLookup
	WebElement recipientDownloadList;

	@FindBy(xpath="(//span[@class='icmn-history'])[1]")
	@CacheLookup
	WebElement recipientHistoryIcon;
	
	
	@FindBy(xpath="//button[@class='dt-button buttons-excel buttons-html5 btn btn-sm btn-warning export-btn' and @aria-controls='reHistorytable']")
	@CacheLookup
	WebElement recipientExportToXlsOnHistory;
	
	@FindBy(xpath="//button[@class='dt-button buttons-pdf buttons-html5 btn btn-sm btn-warning export-btn' and @aria-controls='reHistorytable']")
	@CacheLookup
	WebElement recipientExportToPdfOnHistory;
	
	@FindBy(xpath="(//button[@class='close'])[2]")
	@CacheLookup
	WebElement recipientHistoryCloseIcon;
	
	@FindBy(xpath="//button[@class='btn-sm btn btn-danger']")
	@CacheLookup
	WebElement sharerDeleteIcon;
	
	
	@FindBy(xpath="//button[@class='btn btn-sm btn-danger']")
	@CacheLookup
	WebElement recipientDeleteYes;
	
	@FindBy(xpath="(//button[@class='btn btn-sm btn-primary'])[6]")
	@CacheLookup
	WebElement recipientDeleteOK;
	
	
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

	public void clickUpsiRecipientMenu()
	{
		upsiRecipientMenu.click();
	}
	
	public void clickAddRecipient()
	{
		addRecipientButton.click();
	}
	
	public void setRecipientName(String rname)
	{
		recipientName.sendKeys(rname);
	}
	
	public void setRecipientCode(String rcode)
	{
		recipientCode.sendKeys(rcode);
	}
	
	public void setRecipientDesignation(String rdesignation)
	{
		recipientDesignation.sendKeys(rdesignation);
	}
	
	public void setRecipientCompanyName(String rcompany)
	{
		recipientCompanyName.sendKeys(rcompany);
	}
	
	public void setRecipientAddress_1(String raddress1)
	{
		recipientAddress_1.sendKeys(raddress1);
	}
	
	public void setRecipientAddress_2(String raddress2)
	{
		recipientAddress_2.sendKeys(raddress2);
	}
	
	public void setRecipientAddress_3(String raddress3)
	{
		recipientAddress_3.sendKeys(raddress3);
	}
	
	public void setRecipientCity(String rcity)
	{
		recipientCity.sendKeys(rcity);
	}
	
	public void setRecipientPIN(String rpin)
	{
		recipientPIN.sendKeys(rpin);
	}
	
	public void clickRcipientTypeOfRecipient()
	{
		recipientTypeOfRecipient.click();
	}
	
	public void clickRecipientPAN()
	{
		recipientPAN.click();
	}
	
	public void setRecipientPutPAN(String rpan)
	{
		recipientPutPAN.sendKeys(rpan);
	}
	
	public void setRecipientUploadFile(String rupload)
	{
		recipientUploadFile.sendKeys(rupload);
	}
	
	public void setRecipientEmailID(String remail)
	{
		recipientEmailID.sendKeys(remail);
	}
	
	public void setRecipientMobileNo(String rmob)
	{
		recipientMobileNo.sendKeys(rmob);
	}
	
	public void setRecipientTelNo(String rtel)
	{
		recipientTelNo.sendKeys(rtel);
	}
	
	public void clickRecipientSave() 
	{
		recipientSave.click();
		//Thread.sleep(3000);
		//recipientSaveOK.click();
	}
	
	public void clickRecipientSaveOK()
	{
	
		recipientSaveOK.click();
	}
	
	
	
	
	public void setRecipientSearchTextBox(String rsearch)
	{
		recipientSearchTextBox.sendKeys(rsearch);
	}
	
	public void clickRecipientEditIcon()
	{
		recipientEditIcon.click();
		
	}
	
	
	public void clearRecipientName()
	{
		recipientName.clear();
		
	}
	
	public void clearRecipientCode()
	{
		recipientCode.clear();
		
	}
	
	
	public void clearRecipientDesignation()
	{
		recipientDesignation.clear();
		
	}
	
	public void clearRecipientCompanyName()
	{
		recipientCompanyName.clear();
	}
	
	public void clearRecipientAddress_1()
	{
		recipientAddress_1.clear();
		
	}
	
	public void clearrecipientAddress_2()
	{
		recipientAddress_2.clear();
		
	}
	
	
	public void clearRecipientAddress_3()
	{
		recipientAddress_3.clear();
		
	}
	
	public void clearRecipientCity()
	{
		recipientCity.clear();
		
	}
	
	public void clearRecipientPIN()
	{
		recipientPIN.clear();
		
	}
	
	public void clearRecipientPutPAN()
	{
		recipientPutPAN.clear();
		
	}
	
	
	public void clearRecipientEmailID()
	{
		recipientEmailID.clear();
		
	}
	
	public void clearRecipientMobileNo()
	{
		recipientMobileNo.clear();
		
	}
	
	
	public void clearRecipientTelNo()
	{
		recipientTelNo.clear();
		
	}
	
	public void clickRecipientUpdate() 
	{
		recipientUpdateButton.click();
		//Thread.sleep(3000);
		//recipientUpdateOk.click();
		
	}
	
	public void clickRecipientUpdateOK() 
	{
		
		recipientUpdateOk.click();
		
	}
	
	
	
	
	
	
	public void clearRecipientSearchTextBox()
	{
		recipientSearchTextBox.clear();
	}
	
	public void clickDownloadOnList()
	{
		recipientDownloadList.click();
		
	}
	
	public void clickHistoryIcon()
	{
		recipientHistoryIcon.click();
		
	}
	
	public void clickExpExcelOfHistory()
	{
		recipientExportToXlsOnHistory.click();
		
	}
	
	
	public void clickExpPDFOfHistory()
	{
		recipientExportToPdfOnHistory.click();
		
	}
	
	
	public void clickCloseIconHistory()
	{
	   recipientHistoryCloseIcon.click();
		
	}

	public void recipientDelete() throws InterruptedException
	{
		sharerDeleteIcon.click();
		Thread.sleep(2000);
		recipientDeleteYes.click();
		//Thread.sleep(2000);
		//recipientDeleteOK.click();
	}
	
	
	public void recipientDeleteOK() 
	{
		recipientDeleteOK.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
