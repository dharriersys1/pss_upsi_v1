package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryTaskListPage {

	WebDriver ldriver;

	public LibraryTaskListPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "leftMenu")
	@CacheLookup
	WebElement leftMenu;

	@FindBy(xpath = "(//a[@href='javascript: void(0);'])[2]")
	@CacheLookup
	WebElement complianceMenu;

	@FindBy(xpath = "(//a[contains(text(),'Task')])[1]")
	@CacheLookup
	WebElement TaskMenu;

	@FindBy(xpath = "//a[contains(text(),'Library Task List')]")
	@CacheLookup
	WebElement LibraryTaskListSubMenu;

	@FindBy(xpath = "//div[@class='card-header']")
	@CacheLookup
	WebElement cardHeader;

	@FindBy(xpath = "//button[@class='btn btn-sm btn-primary' and @type='button' and @tabindex='0']")
	@CacheLookup
	WebElement CreateTaskButton;

	@FindBy(xpath = "//label[@for='IsGlobalYes']")
	@CacheLookup
	WebElement GlobalRadio;

	@FindBy(xpath = "//label[@for='IsGlobalNo']")
	@CacheLookup
	WebElement CompanyRadio;

	@FindBy(xpath = "//label[@for='sendMailYes']")
	@CacheLookup
	WebElement EmailYes;

	@FindBy(xpath = "//label[@for='sendMailNo']")
	@CacheLookup
	WebElement EmailNo;

	@FindBy(xpath = "//input[@id='taskName']")
	@CacheLookup
	WebElement taskName;

	@FindBy(xpath = "(//textarea[@rows='3'])[1]")
	@CacheLookup
	WebElement taskDescription;

	@FindBy(xpath = "//select[@class='form-control select ng-untouched ng-pristine ng-invalid']")
	@CacheLookup
	WebElement selectTag;

	@FindBy(xpath = "//select[@class='form-control ng-untouched ng-pristine ng-valid']")
	@CacheLookup
	WebElement selectStatutoryOrInternal;

	@FindBy(xpath = "(//select[@class='form-control select ng-untouched ng-pristine ng-valid'])[1]")
	@CacheLookup
	WebElement selectRiskProfile;

	@FindBy(xpath = "(//textarea[@rows='3'])[3]")
	@CacheLookup
	WebElement User_Defined_Consequences;

	@FindBy(xpath = "(//select[@class='form-control select ng-untouched ng-pristine ng-valid'])[2]")
	@CacheLookup
	WebElement selectMeetingType;

	@FindBy(xpath = "(//select[@class='form-control select ng-untouched ng-pristine ng-valid'])[3]")
	@CacheLookup
	WebElement selectAssignedTo;

	@FindBy(xpath = "(//select[@class='form-control select ng-untouched ng-pristine ng-valid'])[4]")
	@CacheLookup
	WebElement selectColleague;

	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[1]")
	@CacheLookup
	WebElement Due_Date_in_days;

	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[2]")
	@CacheLookup
	WebElement Reminder_Start_in_days;

	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[3]")
	@CacheLookup
	WebElement Reminder_Frequency_days;

	@FindBy(xpath = "(//select[@class='form-control select ng-untouched ng-pristine ng-valid'])[5]")
	@CacheLookup
	WebElement select_1st_Escalation;

	@FindBy(xpath = "(//select[@class='form-control select ng-untouched ng-pristine ng-valid'])[6]")
	@CacheLookup
	WebElement select_2nd_Escalation;

	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[4]")
	@CacheLookup
	WebElement Escalation_Start_1st;

	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[5]")
	@CacheLookup
	WebElement Escalation_reminder_frequency_1st;

	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[6]")
	@CacheLookup
	WebElement Escalation_Start_2nd;

	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[7]")
	@CacheLookup
	WebElement Escalation_reminder_frequency_2nd;

	@FindBy(xpath = "//label[@for='IsPeriodic']")
	@CacheLookup
	WebElement Trigger_Type_Periodic;

	@FindBy(xpath = "//label[@for='IsEvent']")
	@CacheLookup
	WebElement Trigger_Type_Event;

	@FindBy(xpath = "(//select[@class='form-control select ng-untouched ng-pristine ng-invalid'])[2]")
	@CacheLookup
	WebElement select_Trigger_Id;

	@FindBy(xpath = "(//select[@class='form-control select ng-untouched ng-pristine ng-invalid'])[3]")
	@CacheLookup
	WebElement select_Date_Option;

	@FindBy(xpath = "//input[@name='dtTriggerStartingDate']")
	@CacheLookup
	WebElement Trigger_Starting_Date;

	@FindBy(xpath = "//input[@name='dtEndDate']")
	@CacheLookup
	WebElement End_Date;

	@FindBy(xpath = "(//select[@class='form-control select ng-valid ng-dirty ng-touched'])")
	@CacheLookup
	WebElement Responsible_User;

	@FindBy(xpath = "(//select[@class='form-control select ng-untouched ng-pristine ng-valid'])[7]")
	@CacheLookup
	WebElement Responsible_User_1st_Escalation;

	@FindBy(xpath = "(//select[@class='form-control select ng-untouched ng-pristine ng-valid'])[8]")
	@CacheLookup
	WebElement Responsible_User_2nd_Escalation;

	@FindBy(xpath = "(//textarea[@rows='3'])[4]")
	@CacheLookup
	WebElement Email_Contents;

	@FindBy(xpath = "//button[@id='btnsaveTask']")
	@CacheLookup
	WebElement Save_To_Library_Button;

	@FindBy(xpath = "//button[@id='btnshowtaskparticulars']")
	@CacheLookup
	WebElement Save_And_Activate_Button;

	@FindBy(xpath = "//button[@id='btnshowaddProcessTask']")
	@CacheLookup
	WebElement Add_To_Process_Button;

	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]")
	@CacheLookup
	WebElement TaskParticulars;

	@FindBy(xpath = "//button[@id='btnsaveandActivateTask']")
	@CacheLookup
	WebElement Save_and_Activate_Button;

	@FindBy(xpath = "//input[@type='search' and @aria-controls='eventLiberyTaskTable']")
	@CacheLookup
	WebElement SearchTextBox_Event;

	@FindBy(xpath = "//input[@type='search' and @aria-controls='PeriodicTaskDataTable']")
	@CacheLookup
	WebElement SearchTextBox_Periodic;

	@FindBy(xpath = "(//button[@class='btn-sm btn btn-warning' and @type='button'])[1]")
	@CacheLookup
	WebElement edit_Icon_Event;

	@FindBy(xpath = "//button[@id='btnupdateTask']")
	@CacheLookup
	WebElement Update_Button_EditLibTask;

	@FindBy(xpath = "//button[@id='btnshowtaskparticulars']")
	@CacheLookup
	WebElement Update_and_Activate_EditLibTask;

	@FindBy(xpath = "//button[@id='btnupdateandActivateTask']")
	@CacheLookup
	WebElement Update_and_Activate_TaskParticulars;

	@FindBy(xpath = "//a[@data-target = '#eventBasedTaskDetails']")
	@CacheLookup
	WebElement EventBasedTask_Tab;

	@FindBy(xpath = "//a[@data-target = '#periodicTaskTab']")
	@CacheLookup
	WebElement PeriodicBasedTask_Tab;

	@FindBy(xpath = "(//button[@class='btn-sm btn btn-warning' and @type='button'])[6]")
	@CacheLookup
	WebElement edit_Icon_Periodic;

	// @FindBy(xpath = "")
	// @CacheLookup
	// WebElement ;
	//
	// @FindBy(xpath = "")
	// @CacheLookup
	// WebElement ;
	//
	// @FindBy(xpath = "")
	// @CacheLookup
	// WebElement ;
	//
	// @FindBy(xpath = "")
	// @CacheLookup
	// WebElement ;
	//
	// @FindBy(xpath = "")
	// @CacheLookup
	// WebElement ;
	//
	// @FindBy(xpath = "")
	// @CacheLookup
	// WebElement ;
	//
	// @FindBy(xpath = "")
	// @CacheLookup
	// WebElement ;
	//
	// @FindBy(xpath = "")
	// @CacheLookup
	// WebElement ;
	//
	// @FindBy(xpath = "")
	// @CacheLookup
	// WebElement ;
	//
	// @FindBy(xpath = "")
	// @CacheLookup
	// WebElement ;

	public void clickLeftMenu() {
		leftMenu.click();
	}

	public void clickComplianceMenu() {
		complianceMenu.click();
	}

	public void clickTaskMenu() {
		TaskMenu.click();
	}

	public void clickLibraryTaskListSubMenu() {
		LibraryTaskListSubMenu.click();
	}

	public void clickCardHeader() {
		cardHeader.click();
	}

	public void clickCreateTaskButton() {
		CreateTaskButton.click();
	}

	public void clickGlobalRadio() {
		GlobalRadio.click();
	}

	public void clickCompanyRadio() {
		CompanyRadio.click();
	}

	public void clickEmailYes() {
		EmailYes.click();
	}

	public void clickEmailNo() {
		EmailNo.click();
	}

	public void setTaskName(String tName) {

		taskName.sendKeys(tName);

	}

	public void setTaskDescription(String tDescription) {

		taskDescription.sendKeys(tDescription);

	}

	public void clickSelectTag() {
		selectTag.click();
	}

	public void clickSelectStatutoryOrInternal() {
		selectStatutoryOrInternal.click();
	}

	public void clickSelectRiskProfile() {
		selectRiskProfile.click();
	}

	public void setUser_Defined_Consequences(String tUserConsequences) {

		User_Defined_Consequences.sendKeys(tUserConsequences);

	}

	public void clickSelectMeetingType() {
		selectMeetingType.click();
	}

	public void clickSelectAssignedTo() {
		selectAssignedTo.click();
	}

	public void clickSelectColleague() {
		selectColleague.click();
	}

	public void setDue_Date_in_days(String tDueDate) {

		Due_Date_in_days.sendKeys(tDueDate);
	}

	public void setReminder_Start_in_days(String tReminderStart) {

		Reminder_Start_in_days.sendKeys(tReminderStart);
	}

	public void setReminder_Frequency_days(String tReminderFreq) {

		Reminder_Frequency_days.sendKeys(tReminderFreq);

	}

	public void clickSelect_1st_Escalation() {
		select_1st_Escalation.click();
	}
	
	public void setEscalation_Start_1st(String tEsca1) {

		Escalation_Start_1st.sendKeys(tEsca1);
	}

	public void setEscalation_reminder_frequency_1st(String tEscalFreq1) {

		Escalation_reminder_frequency_1st.sendKeys(tEscalFreq1);
	}

	public void clickSelect_2nd_Escalation() {
		select_2nd_Escalation.click();
	}
	
	public void setEscalation_Start_2nd(String tEsca2) {

		Escalation_Start_2nd.sendKeys(tEsca2);
	}

	public void setEscalation_reminder_frequency_2nd(String tEscalFreq2) {

		Escalation_reminder_frequency_2nd.sendKeys(tEscalFreq2);
	}
	
	public void clickTrigger_Type_Periodic() {
		Trigger_Type_Periodic.click();
	}
	
	public void clickTrigger_Type_Event() {
		Trigger_Type_Event.click();
	}
	
	public void clickSelect_Trigger_Id() {
		select_Trigger_Id.click();
	}
	
	public void clickSelect_Date_Option() {
		select_Date_Option.click();
	}
	
	public void clickTrigger_Starting_Date() {
		Trigger_Starting_Date.click();
	}
	
	public void clickEnd_Date() {
		End_Date.click();
	}
	
	public void clickResponsible_User() {
		Responsible_User.click();
	}
	
	public void clickResponsible_User_1st_Escalation() {
		Responsible_User_1st_Escalation.click();
	}
	
	public void clickResponsible_User_2nd_Escalation() {
		Responsible_User_2nd_Escalation.click();
	}
	
	public void setEmail_Contents(String tEmailContents) {

		Email_Contents.sendKeys(tEmailContents);
	}
	
	public void clickSave_To_Library_Button() {
		Save_To_Library_Button.click();
	}
	
	public void clickSave_And_Activate_Button() {
		Save_And_Activate_Button.click();
	}
	
	public void setTaskParticulars(String tParticulars) {

		TaskParticulars.sendKeys(tParticulars);
	}
	
	public void clickAdd_To_Process_Button() {
		Add_To_Process_Button.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
