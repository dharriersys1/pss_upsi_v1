package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@type='email']")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath="//*[@class='placeholder']")
	@CacheLookup
	WebElement compnayname;
	
	@FindBy(xpath="//input[@autocomplete='off']")
	@CacheLookup
	WebElement selectCompanyName;
	
	@FindBy(xpath="//*[@name='Password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//*[@type='button']")
	@CacheLookup
	WebElement loginButton;
	
	@FindBy(xpath="//img[@id='userProfilePic']")
	@CacheLookup
	WebElement profilePic;
	
	@FindBy(xpath="(//a[@class='dropdown-item' and @href='javascript:void(0)'])[3]")
	@CacheLookup
	WebElement logout;
	
	
	
	
	public void setUserName(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void clickcompnayname()
	{
		compnayname.click();
	}
	
	public void selcompnayname(String selcname)
	{
		selectCompanyName.sendKeys(selcname);
	}
	
	public void setpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}
	
	
	public void clickOnProfile()
	{
		profilePic.click();
	}
	
	public void clickOnLogout()
	{
		logout.click();
	}
	
	
	
	
	
	
}
