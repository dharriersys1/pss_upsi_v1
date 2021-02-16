package com.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DetailsPage {

WebDriver ldriver;

String Date_of_initiation_of_UPSI = "20-Sep-2018";

String Date_Made_UPSI_Public = "31-Jan-2020";
	
	public DetailsPage(WebDriver rdriver)
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
	
	@FindBy(xpath="//a[contains(text(),'UPSI Details')]")
	@CacheLookup
	WebElement upsiDetailsMenu;
	
	@FindBy(xpath="(//button[@class='btn btn-sm btn-primary mb-2' and @type='button'])[1]")
	@CacheLookup
	WebElement addDetailsButton;
	
	
	@FindBy(xpath="//label[@for='govevaUser1']")
	@CacheLookup
	WebElement selectRecipientRadio;
	
	
	@FindBy(xpath="//input[@aria-controls='recipientNonGovevaUserList']")
	@CacheLookup
	WebElement searchOnRecipientPopup;
	
	
	@FindBy(xpath="//label[@for='selectedUPSIUser5']")
	@CacheLookup
	WebElement selectRecipient_1;
	
	
	@FindBy(xpath="//label[@for='selectedUPSIUser43']")
	@CacheLookup
	WebElement selectRecipient_2;
	
	
	@FindBy(xpath="//button[@type='button' and @class='btn btn-sm btn-danger']")
	@CacheLookup
	WebElement saveButtonOnRecipient;
	
	
	@FindBy(xpath="//select[@id='NatureId']")
	@CacheLookup
	WebElement natureOfInterest;
	
	
	@FindBy(xpath="//div[@class='col-lg-3']//input[@class='form-control ng-untouched ng-pristine ng-valid']")
	@CacheLookup
	WebElement otherNatureOfInterest;
	
	
	@FindBy(xpath="(//textarea[@class='form-control ng-untouched ng-pristine ng-invalid' and @maxlength='200'])[1]")
	@CacheLookup
	WebElement briefDetailsOfUpsiShared;
	
	
	@FindBy(xpath="(//div[@class='form-group']//textarea[@class='form-control IsDisableEmail ng-untouched ng-pristine ng-valid'])[1]")
	@CacheLookup
	WebElement emailSubject;
	
	
	@FindBy(xpath="//input[@name='Attachment']")
	@CacheLookup
	WebElement attachmentForEmail;
	
	
	@FindBy(xpath="//textarea[@class='form-control IsDisableEmail ng-untouched ng-pristine ng-valid' and @rows='4']")
	@CacheLookup
	WebElement emailText;
	
	
	@FindBy(xpath="(//textarea[@maxlength='200'])[2]")
	@CacheLookup
	WebElement purposeForSharing;
	
	
	@FindBy(xpath="(//textarea[@maxlength='50'])[1]")
	@CacheLookup
	WebElement mannerModeOfSharing;
	
	
	@FindBy(xpath="(//input[@type='file'])[2]")
	@CacheLookup
	WebElement documentUploadNotForEmail;
	
	
	@FindBy(xpath="(//input[@placeholder='dd-mm-yyyy'])[2]")
	@CacheLookup
	WebElement dateOfInitiationOfUpsi;
	
	
	@FindBy(xpath="(//input[@placeholder='dd-mm-yyyy'])[3]")
	@CacheLookup
	WebElement dateMadeUpsiPublic;
	
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	@CacheLookup
	WebElement submitUpsiDetails;
	
	
	@FindBy(xpath="(//button[@type='button' and @data-dismiss='modal' and @class='btn btn-sm btn-primary'])[2]")
	@CacheLookup
	WebElement okAfterSubmit;
	
	@FindBy(xpath="//input[@type='search']")
	@CacheLookup
	WebElement searchOnUpsiDetails;
	
	@FindBy(xpath="//button[@title='Edit']")
	@CacheLookup
	WebElement editIcon;
	
	@FindBy(xpath="//button[contains(text(),'Update')]")
	@CacheLookup
	WebElement UpdateButton;
	
	@FindBy(xpath="(//button[@type='button' and @data-dismiss='modal' and @class='btn btn-sm btn-primary'])[2]")
	@CacheLookup
	WebElement okAfterUpdate;
	
	
	@FindBy(xpath="//button[@type='button' and @class='btn btn-sm btn-default']")
	@CacheLookup
	WebElement backButtonOnEditPage;
	
	@FindBy(xpath="//button[@title='View Email Log']")
	@CacheLookup
	WebElement viewEmailLogIconList;
	
	@FindBy(xpath="//button[@class='btn-sm btn btn-warning' and @title='View']")
	@CacheLookup
	WebElement viewIconOfEmailLog;
	
	@FindBy(xpath="(//button[@class='btn btn-sm btn-primary' and @data-dismiss='modal' and @type='button'])[5]")
	@CacheLookup
	WebElement cancelIconOfInternalEmailLog;
	
	@FindBy(xpath="(//button[@type='button' and @class='btn btn-sm btn-primary'])[6]")
	@CacheLookup
	WebElement cancelIconOfEmailLog;
	
	@FindBy(xpath="//a[@title='Download Document']")
	@CacheLookup
	WebElement downloadDocIcon;
	
	@FindBy(xpath="//a[@title='Download Email Attachment']")
	@CacheLookup
	WebElement downloadEmailAttachIcon;
	
	@FindBy(xpath="//button[@title='History']")
	@CacheLookup
	WebElement historyIcon;
	
	@FindBy(xpath="(//button[@class='dt-button buttons-excel buttons-html5 btn btn-sm btn-warning export-btn'])[2]")
	@CacheLookup
	WebElement expToExcelOnHistory;
	
	@FindBy(xpath="(//button[@class='dt-button buttons-pdf buttons-html5 btn btn-sm btn-warning export-btn'])[2]")
	@CacheLookup
	WebElement expToPDFOnHistory;
	
	@FindBy(xpath="(//button[@class='btn btn-sm btn-primary' and @type='button'])[2]")
	@CacheLookup
	WebElement okIconOnHistory;
	
	@FindBy(xpath="//img[@id='userProfilePic']")
	@CacheLookup
	WebElement profilePic;
	
	@FindBy(xpath="(//a[@class='dropdown-item' and @href='javascript:void(0)'])[3]")
	@CacheLookup
	WebElement logout;
	
	
	
	
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

	public void clickleftMenu()
	{
		leftMenu.click();
	}
	
	public void clickUpsiMenu()
	{
		upsiMenu.click();
	}

	public void clickUpsiDetailsMenu()
	{
		upsiDetailsMenu.click();
	}
	
	public void clickAddDetailst()
	{
		addDetailsButton.click();
	}

	public void clickSelectRecipient()
	{
		selectRecipientRadio.click();
	}

	public void setSearchOnRecipientPopup(String drsearch)
	{
		searchOnRecipientPopup.sendKeys(drsearch);
	}

	public void clickSelectRecipient_1()
	{
		selectRecipient_1.click();
	}
	
	public void clickSelectRecipient_2()
	{
		selectRecipient_2.click();
	}
	
	public void clearSearchOnRecipientPopup()
	{
		searchOnRecipientPopup.clear();
		
	}
	
	public void clicksaveButtonOnRecipient()
	{
		saveButtonOnRecipient.click();
	}
	
	public void selectNatureOfInterest(String dotherNOI)
	{
		
		Select NOI =new Select(natureOfInterest);
		NOI.selectByVisibleText("Other");
		
		otherNatureOfInterest.sendKeys(dotherNOI);
	}
	
	public void setBriefDetailsOfUpsiShared(String dBrief)
	{
		briefDetailsOfUpsiShared.sendKeys(dBrief);
	}
	
	public void setEmailSubject(String dEmailSub)
	{
		emailSubject.sendKeys(dEmailSub);
	}
	
	public void setAttachmentForEmail(String dEmailAttach)
	{
		attachmentForEmail.sendKeys(dEmailAttach);
	}
	
	public void setEmailText(String dEmailText)
	{
		emailText.sendKeys(dEmailText);
	}
	
	public void setPurposeForSharing(String dPurpose)
	{
		purposeForSharing.sendKeys(dPurpose);
	}
	
	public void setMannerModeOfSharing (String dManner)
	{
		mannerModeOfSharing.sendKeys(dManner);
	}
	
	public void clearMannerModeOfSharing()
	{
		mannerModeOfSharing.clear();
		
	}
	
	public void setDocumentUploadNotForEmail(String dDocNotForEmail)
	{
		documentUploadNotForEmail.sendKeys(dDocNotForEmail);
	}
	
	public void setDateOfInitiationOfUpsi() throws Throwable
	{
		if (Date_of_initiation_of_UPSI != null && Date_of_initiation_of_UPSI != "") {
   			Thread.sleep(5000);
   			ldriver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])[2]")).click();
			date(Date_of_initiation_of_UPSI);
		}
	}
	
	public void setDateMadeUpsiPublic() throws Throwable 
	{
		if (Date_Made_UPSI_Public != null && Date_Made_UPSI_Public != "") {
   			Thread.sleep(5000);
   			ldriver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])[3]")).click();
			date(Date_Made_UPSI_Public);
		}
	}
	
	public void clickSubmitUpsiDetails() 
	{
		submitUpsiDetails.click();
//		Thread.sleep(2000);
//		okAfterSubmit.click();
	}
	
	public void clickSubmitUpsiDetailsOK() 
	{
//		submitUpsiDetails.click();
//		Thread.sleep(2000);
		okAfterSubmit.click();
	}
	
	
	public void clickUpdateUpsiDetails() 
	{
		UpdateButton.click();
	}
	
	public void clickUpdateUpsiDetailsOK() 
	{

		okAfterUpdate.click();
	}
	
	
	
	public void setSearchOnUpsiDetails(String dSearch)
	{
		searchOnUpsiDetails.sendKeys(dSearch);
	}
	
	public void clearSearchOnUpsiDetails()
	{
		searchOnUpsiDetails.clear();
	}
	
	public void clickEditIcon() 
	{
		editIcon.click();
	}
	
	public void clickBackButtonOnEditPage() 
	{
		backButtonOnEditPage.click();
	}
	
	public void clickViewEmailLogIconList() 
	{
		viewEmailLogIconList.click();
	}
	
	public void clickViewIconOfEmailLog() 
	{
		viewIconOfEmailLog.click();
	}
	
	public void clickCancelIconOfInternalEmailLog() 
	{
		cancelIconOfInternalEmailLog.click();
	}
	
	public void clickCancelIconOfEmailLog() 
	{
		cancelIconOfEmailLog.click();
	}
	
	public void clickDownloadDocIcon() 
	{
		downloadDocIcon.click();
	}
	
	public void clickDownloadEmailAttachIcon() 
	{
		downloadEmailAttachIcon.click();
	}
	
	public void clickHistoryIcon() 
	{
		historyIcon.click();
	}
	
	public void clickExpToExcelOnHistory() 
	{
		expToExcelOnHistory.click();
	}
	
	public void clickExpToPDFOnHistory() 
	{
		expToPDFOnHistory.click();
	}
	
	public void clickOkIconOnHistory() 
	{
		okIconOnHistory.click();
	}
	

	
}
