package com.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.Xls_Reader;

public class CommitteePage {

	
	Xls_Reader reader = new Xls_Reader(
			"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

	String sheetName = "Committee";
	
	String Date_of_Activation_of_Committee = reader.getCellData(sheetName, "Date of Activation of Committee", 2);
	
	String Appointment_Date_of_Member_Director = reader.getCellData(sheetName, "Appointment Date", 2);
	
	String Cessation_Date_of_Member_Director = reader.getCellData(sheetName, "Appointment Date", 2);
	
	String End_Term_Date_of_Member_Director = reader.getCellData(sheetName, "Appointment Date", 2);
	
	
	WebDriver ldriver;

	public CommitteePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "leftMenu")
	@CacheLookup
	WebElement leftMenu;

	@FindBy(xpath = "(//a[@href='javascript: void(0);'])[1]")
	@CacheLookup
	WebElement masterMenu;

	@FindBy(xpath = "//a[contains(text(),'Committee')]")
	@CacheLookup
	WebElement CommitteeMenu;

	@FindBy(xpath = "//div[@class='card-header']")
	@CacheLookup
	WebElement cardHeader;

	@FindBy(xpath = "//button[@class='btn btn-sm btn-primary mb-2' and @type='button']")
	@CacheLookup
	WebElement addCommitteeButton;
	
	@FindBy(xpath = "//select[@id='committeeName']")
	@CacheLookup
	WebElement selectCommitteeType;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	@CacheLookup
	WebElement Other_Committee_Name ;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	@CacheLookup
	WebElement Committee_Alias;
	
	@FindBy(xpath = "(//input[@type='number'])[1]")
	@CacheLookup
	WebElement Frequency_Number;
	
	@FindBy(xpath = "(//input[@type='number'])[2]")
	@CacheLookup
	WebElement Gap_between_meeting;
	
	@FindBy(xpath = "(//input[@type='number'])[3]")
	@CacheLookup
	WebElement Notice_period;
	
	@FindBy(xpath = "(//input[@type='number'])[4]")
	@CacheLookup
	WebElement Quorum;
	
	@FindBy(xpath = "(//input[@type='file'])[1]")
	@CacheLookup
	WebElement Charter_file;
	
	
	@FindBy(xpath = "(//input[@type='file'])[2]")
	@CacheLookup
	WebElement Policies_file;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	@CacheLookup
	WebElement Sitting_Fees;
	
	@FindBy(xpath = "//label[@for='statutoryCommitteeYes']")
	@CacheLookup
	WebElement Statutory_Committee_Yes;
	
	@FindBy(xpath = "//label[@for='statutoryCommitteeNo']")
	@CacheLookup
	WebElement Statutory_Committee_No;
	
	@FindBy(xpath = "//button[@id='btnsaveCommittee']")
	@CacheLookup
	WebElement Save_CommitteeButton;
	
	@FindBy(xpath = "//button[@class='btn btn-sm']")
	@CacheLookup
	WebElement Close_CommitteeButton;
	
	@FindBy(xpath = "//input[@type='search']")
	@CacheLookup
	WebElement SearchTextBox_Committee;
	
	
	@FindBy(xpath = "//button[@class='btn-sm btn btn-warning']")
	@CacheLookup
	WebElement EditIcon_Commttee;
	
	@FindBy(xpath = "//button[@id='editBtnAgenda']")
	@CacheLookup
	WebElement UpdateButton_Committee;
	
	@FindBy(xpath = "//a[contains(text(),'Members')]")
	@CacheLookup
	WebElement Members_Committee;
	
	
	
	@FindBy(xpath = "(//button[@class='btn btn-sm btn-primary ml-2'])[1]")
	@CacheLookup
	WebElement addMember_Committee;
	
	@FindBy(xpath = "//label[@for='directorType']")
	@CacheLookup
	WebElement DirectorRadio_Committee;
	
	@FindBy(xpath = "//label[@for='otherType']")
	@CacheLookup
	WebElement MemberRadio_Committee;
	
	
	@FindBy(xpath = "//label[@for='isChairmanY']")
	@CacheLookup
	WebElement ChairmanYes_Committee;
	
	@FindBy(xpath = "//label[@for='isChairmanN']")
	@CacheLookup
	WebElement ChairmanNo_Committee;
	
	@FindBy(xpath = "//select[@class='form-control ng-valid ng-touched ng-dirty']")
	@CacheLookup
	WebElement SelectMember_Committee;
	
	@FindBy(xpath = "//button[@id='btnaddDirectorRow']")
	@CacheLookup
	WebElement SaveMember_Commttee;
	
	@FindBy(xpath = "//a[contains(text(),'Invitees Details')]")
	@CacheLookup
	WebElement Invittee_Comittee;
	
	@FindBy(xpath = "//button[@data-target='#existingInviteeDialog']")
	@CacheLookup
	WebElement ExistingInviteeButton;
	
	@FindBy(xpath = "//select[@class='form-control ng-untouched ng-pristine ng-valid']")
	@CacheLookup
	WebElement Select_Invitee;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[22]")
	@CacheLookup
	WebElement Address_of_Invitee;
	
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[23]")
	@CacheLookup
	WebElement City_of_Invitee;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[24]")
	@CacheLookup
	WebElement State_of_Invitee;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[25]")
	@CacheLookup
	WebElement Tel_O_of_Invitee;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[26]")
	@CacheLookup
	WebElement Tel_R_of_Invitee;
	
	@FindBy(xpath = "(//label[@for='ThroughVCY'])[2]")
	@CacheLookup
	WebElement Through_VC_Yes;
	
	@FindBy(xpath = "(//label[@for='ThroughVCN'])[2]")
	@CacheLookup
	WebElement Through_VC_No;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[27]")
	@CacheLookup
	WebElement Fax_No_Invitee;
	
	
	@FindBy(xpath = "(//label[@for='InAttendanceY'])[2]")
	@CacheLookup
	WebElement In_Attendance;
	
	@FindBy(xpath = "(//label[@for='InAttendanceN'])[2]")
	@CacheLookup
	WebElement Permanent_Invitee;
	
	@FindBy(xpath = "(//button[@id='btnaddInviteeRow'])[2]")
	@CacheLookup
	WebElement Save_ExistingInvittee;
	
	@FindBy(xpath = "(//input[@type='search'])[2]")
	@CacheLookup
	WebElement Search_Invittee;
	
	@FindBy(xpath = "//button[@class='btn-sm btn btn-danger']")
	@CacheLookup
	WebElement DeleteIcon_Invitee;
	
	@FindBy(xpath = "//button[@id='deleteInvitee']")
	@CacheLookup
	WebElement DeleteConfirmYes_Invitee;
	
	@FindBy(xpath = "(//button[@data-dismiss='modal' and @class='btn btn-sm btn-primary'])[3]")
	@CacheLookup
	WebElement DeleteConfirmOK_Invitee;
	
	@FindBy(xpath = "(//input[@type='search'])[1]")
	@CacheLookup
	WebElement SearchTextBox_MemberCommittee;
	
	@FindBy(xpath = "//button[@class='btn-sm btn btn-warning']")
	@CacheLookup
	WebElement EditIcon_MemberCommittee;
	
	
	@FindBy(xpath = "//button[@id='btnUpdateDirectorRow']")
	@CacheLookup
	WebElement UpdatButton_MemberCommittee;
	
	@FindBy(xpath = "//button[@class='btn-sm btn btn-danger']")
	@CacheLookup
	WebElement DeleteIcon_MemberCommittee;
	
	@FindBy(xpath = "//button[@id='deleteDirector']")
	@CacheLookup
	WebElement DeleteConfirm_MemberCommittee;
	
	@FindBy(xpath = "//button[@data-target='#inviteeDialog']")
	@CacheLookup
	WebElement Add_NewInvitee_Button;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]")
	@CacheLookup
	WebElement InviteeName_NewInvitee;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[2]")
	@CacheLookup
	WebElement InviteeMobNo_NewInvitee;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[3]")
	@CacheLookup
	WebElement InviteeEmail_NewInvitee;
	
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[18]")
	@CacheLookup
	WebElement InviteeDesignation_NewInvitee;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[19]")
	@CacheLookup
	WebElement InviteeAddress_NewInvitee;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[20]")
	@CacheLookup
	WebElement InviteeCity_NewInvitee;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[21]")
	@CacheLookup
	WebElement InviteeState_NewInvitee;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[22]")
	@CacheLookup
	WebElement InviteeTelO_NewInvitee;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[23]")
	@CacheLookup
	WebElement InviteeTelR_NewInvitee;
	
	@FindBy(xpath = "(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[24]")
	@CacheLookup
	WebElement InviteeFax_NewInvitee;
	
	@FindBy(xpath = "(//label[@for='ThroughVCY'])[1]")
	@CacheLookup
	WebElement VC_Yes_NewInvitee;
	
	@FindBy(xpath = "(//label[@for='ThroughVCN'])[1]")
	@CacheLookup
	WebElement VC_No_NewInvitee;
	
	@FindBy(xpath = "(//label[@for='InAttendanceY'])[1]")
	@CacheLookup
	WebElement InAttendance_NewInvitee;
	
	@FindBy(xpath = "(//label[@for='InAttendanceN'])[1]")
	@CacheLookup
	WebElement Permanent_NewInvitee;
	
	@FindBy(xpath = "(//button[@id='btnaddInviteeRow'])[1]")
	@CacheLookup
	WebElement SaveButton_NewInvitee;
	
	@FindBy(xpath = "(//button[@class='btn-sm btn btn-warning'])[1]")
	@CacheLookup
	WebElement EditIcon_NewInvitee;
	
	@FindBy(xpath = "(//button[@id='btnUpdateInviteeRow'])[1]")
	@CacheLookup
	WebElement UpdateButton_NewInvitee;
	
	
	
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
		Thread.sleep(1000);
		ldriver.findElement(By.xpath("//option[contains(text(),'" + month + "')]")).click();
		Thread.sleep(1000);
		// day
		ldriver.findElement(By.xpath("(//div[@class='btn-light'][contains(text(),'" + day + "')])[1]")).click();
	}
	
		

	public void clickLeftMenu()
	{
		leftMenu.click();
	}
	
	public void clickMasterMenu()
	{
		masterMenu.click();
	}
	
	public void clickCommiteeeMenu()
	{
		CommitteeMenu.click();
	}
	
	public void clickCardHeader()
	{
		cardHeader.click();
	}
	
	public void clickAddNewCommitteeButton()
	{
		addCommitteeButton.click();
	}
	
	public void clickSelectCommiteeType()
	{
		selectCommitteeType.click();
	}
	
	public void setOtherCommitteeName(String otherComName)
	{
		Other_Committee_Name.sendKeys(otherComName);
	}
	
	
	public void setCommitteeAlias(String comAlias)
	{
		Committee_Alias.sendKeys(comAlias);
	}
	
	public void setFrequencyNumberOfMeetings(String comFreq)
	{
		Frequency_Number.sendKeys(comFreq);
	}
	
	public void setGapBetweenMeeting(String comGap)
	{
		Gap_between_meeting.sendKeys(comGap);
	}
	
	public void setNoticePeriodForMeeting(String comNotice)
	{
		Notice_period.sendKeys(comNotice);
	}
	
	
	public void setDate_of_Activation_of_Committee() throws Throwable
	{
		
		System.out.println("jjjjjjjjjjjjjjjjj" + Date_of_Activation_of_Committee);
		
		if (Date_of_Activation_of_Committee != null && Date_of_Activation_of_Committee != "") {
   			Thread.sleep(5000);
   			ldriver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])")).click();
			date(Date_of_Activation_of_Committee);
		}
	}
	
	

	public void setQuorum(String comQuorum)
	{
		Quorum.sendKeys(comQuorum);
	}
	
	public void setCharterfile(String comCharter)
	{
		Charter_file.sendKeys(comCharter);
	}
	
	public void setPoliciesfile(String comPolicies)
	{
		Policies_file.sendKeys(comPolicies);
	}
	
	public void setSittingFees(String comSitting)
	{
		Sitting_Fees.sendKeys(comSitting);
	}
	
	
	public void clickStatutoryCommitteeYes()
	{
		Statutory_Committee_Yes.click();
	}
	
	public void clickStatutoryCommitteeNo()
	{
		Statutory_Committee_No.click();
	}
	
	public void clickSaveComButton()
	{
		Save_CommitteeButton.click();
	}
	
	public void clickCloseCommitteeButton()
	{
		Close_CommitteeButton.click();
	}
	
	public void clickEditIconCommttee()
	{
		EditIcon_Commttee.click();
	}
	
	public void setSearchTextBox_Committee(String comSearchBox)
	{
		SearchTextBox_Committee.sendKeys(comSearchBox);
	}
	
	public void clickUpdateButtonCommittee()
	{
		UpdateButton_Committee.click();
	}
	
	public void clickMembersCommitteeTab()
	{
		Members_Committee.click();
	}
	
	public void clickAddMember_Committee()
	{
		addMember_Committee.click();
	}
	
	public void clickDirectorRadioCommittee()
	{
		DirectorRadio_Committee.click();
	}
	
	public void clickMemberRadioCommittee()
	{
		MemberRadio_Committee.click();
	}
	
	public void clickChairmanYesCommittee()
	{
		ChairmanYes_Committee.click();
	}
	
	public void clickChairmanNoCommittee()
	{
		ChairmanNo_Committee.click();
	}
	
	public void clickSelectMemberCommittee()
	{
		SelectMember_Committee.click();
	}
	
	public void setAppointment_Date_of_Member_Director() throws Throwable
	{
		
		
		if (Appointment_Date_of_Member_Director != null && Appointment_Date_of_Member_Director != "") {
   			Thread.sleep(5000);
   			ldriver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])[4]")).click();
			date(Appointment_Date_of_Member_Director);
		}
	}
	
	public void setCessation_Date_of_Member_Director() throws Throwable
	{
		
		
		if (Cessation_Date_of_Member_Director != null && Cessation_Date_of_Member_Director != "") {
   			Thread.sleep(5000);
   			ldriver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])[5]")).click();
			date(Cessation_Date_of_Member_Director);
		}
	}
	
	public void setEnd_Term_Date_of_Member_Director() throws Throwable
	{
		
		
		if (End_Term_Date_of_Member_Director != null && End_Term_Date_of_Member_Director != "") {
   			Thread.sleep(5000);
   			ldriver.findElement(By.xpath("(//input[@placeholder='dd-mm-yyyy'])[6]")).click();
			date(End_Term_Date_of_Member_Director);
		}
	}
	
	
	
	public void clickSaveMemberCommttee()
	{
		SaveMember_Commttee.click();
	} 
	
	public void setSearchTextBox_MemberCommittee(String member_SearchBox)
	{
		SearchTextBox_MemberCommittee.sendKeys(member_SearchBox);
	}
	
	public void clickEditIcon_MemberCommittee()
	{
		EditIcon_MemberCommittee.click();
	} 
	
	public void clickUpdatButton_MemberCommittee()
	{
		UpdatButton_MemberCommittee.click();
	} 
	
	public void clickDeleteIcon_MemberCommitteee()
	{
		DeleteIcon_MemberCommittee.click();
	}
	
	public void clickDeleteConfirm_MemberCommittee()
	{
		DeleteConfirm_MemberCommittee.click();
	}
	
	public void clickInvitteeComitteeTab()
	{
		Invittee_Comittee.click();
	} 
	
	public void clickExistingInviteeButton()
	{
		ExistingInviteeButton.click();
	} 
	
	public void clickSelectInvitee()
	{
		Select_Invitee.click();
	} 
	
	public void setAddressOfInvitee(String exeInvAddrees)
	{
		Address_of_Invitee.sendKeys(exeInvAddrees);
	} 
	
	public void setCity_of_Invitee(String exeInvCity)
	{
		City_of_Invitee.sendKeys(exeInvCity);
	} 
	
	public void setStateOfInvitee(String exeInvCity)
	{
		State_of_Invitee.sendKeys(exeInvCity);
	} 
	
	public void setTel_O_of_Invitee(String exeInvTEL_O)
	{
		Tel_O_of_Invitee.sendKeys(exeInvTEL_O);
	} 
	
	
	public void setTel_R_of_Invitee(String exeInvTEL_R)
	{
		Tel_R_of_Invitee.sendKeys(exeInvTEL_R);
	} 
	
	public void setFax_No_Invitee(String exeInvFAX)
	{
		Fax_No_Invitee.sendKeys(exeInvFAX);
	} 
	
	public void setThrough_VC_Yes()
	{
		Through_VC_Yes.click();
	} 
	
	public void setThrough_VC_No()
	{
		Through_VC_No.click();
	} 
	
	public void setIn_Attendance()
	{
		In_Attendance.click();
	} 
	
	public void clickPermanent_Invitee()
	{
		Permanent_Invitee.click();
	}
	
	public void clickSave_ExistingInvittee()
	{
		Save_ExistingInvittee.click();
	}
	
	public void setSearch_Invittee(String invitee_SearchBox)
	{
		Search_Invittee.sendKeys(invitee_SearchBox);
	}
	
	public void clearSearch_Invitee()
	{
		Search_Invittee.clear();
	}
	
	
	public void clickDeleteIcon_Invitee()
	{
		DeleteIcon_Invitee.click();
	}
	
	public void clickDeleteConfirmYesButton_Invitee()
	{
		DeleteConfirmYes_Invitee.click();
	}
	
	public void clickDeleteOK_Invitee()
	{
		DeleteConfirmOK_Invitee.click();
	}
	
	
	
	
	
	public void clickAdd_NewInvitee_Button()
	{
		Add_NewInvitee_Button.click();
	}
	
	public void setInviteeName_NewInvitee(String invName_New)
	{
		InviteeName_NewInvitee.sendKeys(invName_New);
	}
	
	public void clearInviteeName_NewInvitee()
	{
		InviteeName_NewInvitee.clear();
	}
	
	public void setInviteeMobNo_NewInvitee(String invMob_New)
	{
		InviteeMobNo_NewInvitee.sendKeys(invMob_New);
	}
	
	public void clearInviteeMobNo_NewInvitee()
	{
		InviteeMobNo_NewInvitee.clear();
	}
	
	
	public void setInviteeEmail_NewInviteee(String invEmail_New)
	{
		InviteeEmail_NewInvitee.sendKeys(invEmail_New);
	}
	
	public void clearInviteeEmail_NewInviteee()
	{
		InviteeEmail_NewInvitee.clear();
	}
	
	public void setInviteeDesignation_NewInvitee(String invDesignation_New)
	{
		InviteeDesignation_NewInvitee.sendKeys(invDesignation_New);
	}
	
	
	public void clearInviteeDesignation_NewInvitee()
	{
		InviteeDesignation_NewInvitee.clear();
	}
	
	public void setInviteeAddress_NewInvitee(String invAddress_New)
	{
		InviteeAddress_NewInvitee.sendKeys(invAddress_New);
	}
	
	public void clearInviteeAddress_NewInvitee()
	{
		InviteeAddress_NewInvitee.clear();
	}
	
	public void setInviteeCity_NewInvitee(String invCity_New)
	{
		InviteeCity_NewInvitee.sendKeys(invCity_New);
	}
	
	public void clearInviteeCity_NewInvitee()
	{
		InviteeCity_NewInvitee.clear();
	}
	
	public void setInviteeState_NewInvitee(String invState_New)
	{
		InviteeState_NewInvitee.sendKeys(invState_New);
	}
	
	public void clearInviteeState_NewInvitee()
	{
		InviteeState_NewInvitee.clear();
	}
	
	
	public void setInviteeTelO_NewInvitee(String invTelO_New)
	{
		InviteeTelO_NewInvitee.sendKeys(invTelO_New);
	}
	
	public void clearInviteeTelO_NewInvitee()
	{
		InviteeTelO_NewInvitee.clear();
	}
	
	public void setInviteeTelR_NewInvitee(String invTelR_New)
	{
		InviteeTelR_NewInvitee.sendKeys(invTelR_New);
	}
	
	
	public void clearInviteeTelR_NewInvitee()
	{
		InviteeTelR_NewInvitee.clear();
	}
	
	public void setInviteeFax_NewInvitee(String invFax_New)
	{
		InviteeFax_NewInvitee.sendKeys(invFax_New);
	}
	
	public void clearInviteeFax_NewInvitee()
	{
		InviteeFax_NewInvitee.clear();
	}
	
	public void clickVC_Yes_NewInvitee()
	{
		VC_Yes_NewInvitee.click();
	}
	
	
	public void clickVC_No_NewInvitee()
	{
		VC_No_NewInvitee.click();
	}
	
	public void clickInAttendance_NewInvitee()
	{
		InAttendance_NewInvitee.click();
	}
	
	public void clickPermanent_NewInvitee()
	{
		Permanent_NewInvitee.click();
	}
	
	public void clickSaveButton_NewInvitee()
	{
		SaveButton_NewInvitee.click();
	}
	
	public void clickEditIcon_NewInvitee()
	{
		EditIcon_NewInvitee.click();
	}
	
	public void clickUpdateButton_NewInvitee()
	{
		UpdateButton_NewInvitee.click();
	}
	

	
}
