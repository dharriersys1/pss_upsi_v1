package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

WebDriver ldriver;
	
	public UserPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(id="leftMenu")
	@CacheLookup
	WebElement leftMenu;
	
	@FindBy(xpath="(//a[@href='javascript: void(0);'])[1]")
	@CacheLookup
	WebElement masterMenu;
	
	@FindBy(xpath="//span[contains(text(),'Users')]")
	@CacheLookup
	WebElement usersMenu;
	
	@FindBy(xpath="//div[@class='card-header']")
	@CacheLookup
	WebElement cardHeader;
	
	@FindBy(xpath="//button[contains(text(),'Create')]")
	@CacheLookup
	WebElement createUserButton;
	
	@FindBy(xpath="//input[@value='Employee']")
	@CacheLookup
	WebElement empRadio;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(xpath="//input[@placeholder='Designation']")
	@CacheLookup
	WebElement designation;
	
	@FindBy(xpath="//input[@placeholder='Area of Expertise']")
	@CacheLookup
	WebElement areaOfExperties;
	
	
	@FindBy(xpath="//input[@placeholder='Email Id']")
	@CacheLookup
	WebElement emailID;
	
	@FindBy(xpath="//input[@placeholder='Mobile No.']")
	@CacheLookup
	WebElement mobNo;
	
	@FindBy(xpath="//button[@class='input-group-addon']")
	@CacheLookup
	WebElement dateOfBirth ;
	
	@FindBy(xpath="//input[@value='Male']")
	@CacheLookup
	WebElement genderM;
	
	@FindBy(xpath="//input[@placeholder='Years']")
	@CacheLookup
	WebElement experience;
	
	@FindBy(xpath="(//div[@class='multiple'])[1]")
	@CacheLookup
	WebElement userRole;
	
	
	@FindBy(xpath="//div[@class='options']/ul/li[contains(text(), 'Test IND')]")
	@CacheLookup
	WebElement selectUserRole ;
	
	@FindBy(xpath="//input[@placeholder='PAN']")
	@CacheLookup
	WebElement pan;
	
	@FindBy(xpath="//input[@placeholder='DIN']")
	@CacheLookup
	WebElement din;
	
	@FindBy(xpath="//input[@formcontrolname='SMSNotification']")
	@CacheLookup
	WebElement notificationSMS;
	
	@FindBy(xpath="//button[contains(text(),'Send for Approval')]")
	@CacheLookup
	WebElement sendForApproval;
	
	@FindBy(xpath="//span[@aria-hidden='true']")
	@CacheLookup
	WebElement cancelButton;
	
	@FindBy(xpath="//a[@id='ngb-tab-0']/b")
	@CacheLookup
	WebElement unauthorizedUserTab;
	
	
	@FindBy(xpath="//input[@type='search' and @class='form-control form-control-sm' and @aria-controls='unAuthUserDetailsTable']")
	@CacheLookup
	WebElement searchOnUnathorized ;
	
	@FindBy(xpath="(//div[@class='fa fa-pencil'])[5]")
	@CacheLookup
	WebElement editIconOfUnauthorized;
	
	@FindBy(xpath="//button[contains(text(),'Authorize')]")
	@CacheLookup
	WebElement authorizeButton;
	
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
	
	public void clickmasterMenu()
	{
		masterMenu.click();
	}
	
	public void clickusersMenu()
	{
		usersMenu.click();
	}
	
	public void clickcardHeader()
	{
		cardHeader.click();
	}
	
	public void clickcreateUserButton()
	{
		createUserButton.click();
	}
	
	public void clickempRadio()
	{
		empRadio.click();
	}
	
	public void setfirstName(String fname)
	{
		firstName.sendKeys(fname);
	}
	
	
	public void setlastName(String lname)
	{
		lastName.sendKeys(lname);
	}
	
	public void setdesignation(String designatioOfUser)
	{
		designation.sendKeys(designatioOfUser);
	}
	
	public void setareaOfExperties(String areaOfExpOfUser)
	{
		areaOfExperties.sendKeys(areaOfExpOfUser);
	}
	
	
	public void setemailID(String emailOfUser)
	{
		emailID.sendKeys(emailOfUser);
	}
	
	public void setmobNo(String mobOfUser)
	{
		mobNo.sendKeys(mobOfUser);
	}
	
	public void clickgenderM()
	{
		genderM.click();
	}
	
	
	public void setdateOfBirth(String dobOfUser)
	{
		dateOfBirth.sendKeys(dobOfUser);
	}
	
	public void setexperience(String experienceOfUser)
	{
		experience.sendKeys(experienceOfUser);
	}
	
	public void clickuserRole()
	{
		userRole.click();
	}
	
	public void clickselectUserRole()
	{
		selectUserRole.click();
	}
	
	
	public void setpan(String panOfUser)
	{
		pan.sendKeys(panOfUser);
	}
	
	public void setdin(String dinOfUser)
	{
		din.sendKeys(dinOfUser);
	}
	
	public void clicknotificationSMS()
	{
		notificationSMS.click();
	}
	
	public void clicksendForApproval()
	{
		sendForApproval.click();
	}
	
	public void clickcancelButton()
	{
		cancelButton.click();
	}
	
	public void clickunauthorizedUserTab()
	{
		unauthorizedUserTab.click();
	}
	
	
	public void setsearchOnUnathorized(String searchOfUnauthorizedUser)
	{
		searchOnUnathorized.sendKeys(searchOfUnauthorizedUser);
	}
	
	
	public void clickeditIconOfUnauthorized()
	{
		editIconOfUnauthorized.click();
	}
	
	public void clickauthorizeButton()
	{
		authorizeButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
