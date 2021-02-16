package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RolePage {

	
WebDriver ldriver;
	
	public RolePage(WebDriver rdriver)
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
	
	@FindBy(xpath="//span[contains(text(),'Roles')]")
	@CacheLookup
	WebElement roleMenu;
	
	@FindBy(xpath="//div[@class='card-header']")
	@CacheLookup
	WebElement cardHeader;
	
	
	@FindBy(xpath="//button[contains(text(),'Add Role')]")
	@CacheLookup
	WebElement addRole;
	

	@FindBy(xpath="//input[@placeholder='Role Name']")
	@CacheLookup
	WebElement roleName;
	

	@FindBy(xpath="//div[@id='masterMenu']/a")
	@CacheLookup
	WebElement masterMenuAddRole;
	
	
	@FindBy(xpath="//input[@id='masterCheckbox']")
	@CacheLookup
	WebElement masterCheckboxAddRole;
	

	@FindBy(xpath="//div[@id='masterMenu']/a")
	@CacheLookup
	WebElement masterSubMenuAddRole;
	

	@FindBy(xpath="//div[@id='upsiMenu']/a")
	@CacheLookup
	WebElement upsiAddRole;
	
	
	@FindBy(xpath="//input[@id='upsiCheckbox']")
	@CacheLookup
	WebElement upsiSelAllAddRole;
	

	@FindBy(xpath="//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement saveOnAddRole;
	
///*
	@FindBy(xpath="//input[@type='search']")
	@CacheLookup
	WebElement searchTextBox;
	
	
	@FindBy(xpath="//div[@class='fa fa-pencil']")
	@CacheLookup
	WebElement editIcon;
	

	@FindBy(xpath="//input[@type='text']")
	@CacheLookup
	WebElement clearRoleName;
	

	@FindBy(xpath="//input[@type='text']")
	@CacheLookup
	WebElement upRoleName;
	
	@FindBy(xpath="//button[contains(text(),'Update')]")
	@CacheLookup
	WebElement updateButton;
	
	
	//*/
	
	@FindBy(xpath="//div[@class='fa fa-trash-o']")
	@CacheLookup
	WebElement deleteButton;
	
	@FindBy(xpath="//button[contains(text(),'Confirm')]")
	@CacheLookup
	WebElement confirmDeleteButton;
	
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
	
	public void clickroleMenu()
	{
		roleMenu.click();
	}
	
	public void clickcardHeader()
	{
		cardHeader.click();
	}
	
	public void clickaddRole()
	{
		addRole.click();
	}
	
	public void setroleName(String rname)
	{
		roleName.sendKeys(rname);
	}
	
	public void clickmasterMenuAddRole()
	{
		masterMenuAddRole.click();
	}
	
	
	public void clickmasterCheckboxAddRole()
	{
		masterCheckboxAddRole.click();
	}
	
	
	public void clickmasterSubMenuAddRole()
	{
		masterSubMenuAddRole.click();
	}
	
	public void clickupsiAddRole()
	{
		upsiAddRole.click();
	}
	
	public void clickupsiSelAllAddRole()
	{
		upsiSelAllAddRole.click();
	}
	
	public void clicksaveOnAddRole()
	{
		saveOnAddRole.click();
	}
	
	
	public void setsearchTextBox(String search)
	{
		searchTextBox.sendKeys(search);
	}
	
	
	public void clearSearchTextBox()
	{
		searchTextBox.clear();
	}
	
	
	public void clickeditIcon()
	{
		editIcon.click();
	}
	
	
	public void clickclearRoleName()
	{
		clearRoleName.clear();
	}
	
	public void setuprname(String updatername)
	{
		upRoleName.sendKeys(updatername);
	}
	
	public void clickupdateButton()
	{
		updateButton.click();
	}
	
	public void clickdeleteButton()
	{
		deleteButton.click();
	}
	
	public void clickconfirmDeleteButton()
	{
		confirmDeleteButton.click();
	}
	
	
	
	
}
