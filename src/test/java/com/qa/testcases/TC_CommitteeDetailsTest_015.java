package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.qa.pageobjects.CommitteePage;
import com.qa.pageobjects.LoginPage;
import com.qa.utilities.Xls_Reader;

public class TC_CommitteeDetailsTest_015 extends BaseClass {

	@Test(priority = 22)
	public void addCommitteeDetails() throws Throwable {

		LoginPage lp = new LoginPage(driver);

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Committee";
     
		Thread.sleep(5000);
		lp.setUserName(uname);
		logger.info("Entered username");

		Thread.sleep(5000);
		lp.clickcompnayname();

		Thread.sleep(5000);
		lp.selcompnayname(selcname);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys(Keys.ENTER);

		Thread.sleep(5000);
		lp.setpassword(pwd);
		logger.info("Entered password");

		Thread.sleep(5000);
		lp.clickLogin();

		CommitteePage cp = new CommitteePage(driver);

		Thread.sleep(30000);
		cp.clickLeftMenu();
		logger.info("Clicked on Left Menu");

		Thread.sleep(3000);
		cp.clickMasterMenu();
		logger.info("Clicked On Master Menu...");

		Thread.sleep(3000);
		cp.clickCommiteeeMenu();
		logger.info("Clicked On Committee Sub menu...");

		Thread.sleep(3000);
		cp.clickCardHeader();

		Thread.sleep(3000);
		cp.clickAddNewCommitteeButton();
		logger.info("Clicked On Add New Committee Button...");

		String committee_type = reader.getCellData(sheetName, "Committee Type", 2);
		
		
		switch (committee_type) {

		case "Other":

			Thread.sleep(3000);
			cp.clickSelectCommiteeType();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//option[@value='Other']")).click();
			Thread.sleep(3000);
			cp.setOtherCommitteeName(reader.getCellData(sheetName, "Other Committee Name", 2));

			break;

		case "Audit Committee":

			Thread.sleep(3000);
			cp.clickSelectCommiteeType();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//option[@value='Audit Committee']")).click();

			break;

		case "CSR Committee":

			Thread.sleep(3000);
			cp.clickSelectCommiteeType();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//option[@value='CSR Committe']")).click();

			break;

		case "Nomination & Remuneration Committee":

			Thread.sleep(3000);
			cp.clickSelectCommiteeType();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//option[@value='Nomination & Remuneration Committee']")).click();

			break;

		case "Risk Management Committee":

			Thread.sleep(3000);
			cp.clickSelectCommiteeType();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//option[@value='Risk Management Committee']")).click();

			break;

		case "Stakeholders Relationship Committee":

			Thread.sleep(3000);
			cp.clickSelectCommiteeType();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//option[@value='Stakeholders Relationship Committee']")).click();

			break;

		}

		
		Thread.sleep(3000);
		cp.setCommitteeAlias(reader.getCellData(sheetName, "Committee-Alias", 2));
		logger.info("Entered Committee Alias...");
		
		Thread.sleep(3000);
		cp.setFrequencyNumberOfMeetings(reader.getCellData(sheetName, "Frequency - Number of meetings", 2));
		logger.info("Entered Frequency Number Of Meeting...");
		
		Thread.sleep(3000);
		cp.setGapBetweenMeeting(reader.getCellData(sheetName, "Gap - between meeting", 2));
		logger.info("Entered Gap Between Meeting...");
		
		
		Thread.sleep(3000);
		cp.setDate_of_Activation_of_Committee();
		logger.info("Entered Date Of Activation of Committee...");
		
		Thread.sleep(3000);
		cp.setNoticePeriodForMeeting(reader.getCellData(sheetName, "Notice period for meeting", 2));
		logger.info("Entered Notice Period For Meeting...");
		
		Thread.sleep(3000);
		cp.setQuorum(reader.getCellData(sheetName, "Quorum", 2));
		logger.info("Entered Quorum...");
		
		Thread.sleep(3000);
		cp.setCharterfile(reader.getCellData(sheetName, "Charter", 2));
		logger.info("Entered Charter File...");
		
		Thread.sleep(3000);
		cp.setPoliciesfile(reader.getCellData(sheetName, "Policies", 2));
		logger.info("Entered Policies File...");
		 
		Thread.sleep(3000);
		cp.setSittingFees(reader.getCellData(sheetName, "Sitting Fees per Meeting", 2));
		logger.info("Entered Sitting Fees...");
		
		String Statutory_Committee  = reader.getCellData(sheetName, "Statutory Committee", 2);
		
		if(Statutory_Committee == "Yes")
		{
			Thread.sleep(3000);
			cp.clickStatutoryCommitteeYes();
			logger.info("Statutory Yes Selected...");
		}
		
		else
		{
			Thread.sleep(3000);
			cp.clickStatutoryCommitteeNo();
			logger.info("Statutory NO Selected...");
		}
	
//		Thread.sleep(3000);
//		cp.clickSaveComButton();
//		logger.info("Clicked on Save Committee Button...");
		
		
	}
	
	@Test(priority = 23)
	public void addMembersInCommittee() throws Throwable {

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Committee";
		String Member_Type = reader.getCellData(sheetName, "Member Type", 2);
		String Chaireman = reader.getCellData(sheetName, "Is Chairman", 2);
		String Select_Member = reader.getCellData(sheetName, "Select Member", 2);
	
		CommitteePage cp = new CommitteePage(driver);
		
		Thread.sleep(30000);
		cp.setSearchTextBox_Committee(reader.getCellData(sheetName, "Committee-Alias", 2));
		
		Thread.sleep(3000);
		cp.clickEditIconCommttee();
		logger.info("Clicked On Edit Icon of Committee...");
		
		Thread.sleep(3000);
		cp.clickMembersCommitteeTab();
		logger.info("Clicked on Member Tab of Committee...");
		
		Thread.sleep(3000);
		cp.clickAddMember_Committee();
		logger.info("Clicked Add Member Button...");
		
		if(Member_Type == "Director")
		{
			
			Thread.sleep(3000);
			cp.clickDirectorRadioCommittee();
			logger.info("Selected Board Member...");
			
		}
		else
		{
			Thread.sleep(3000);
			cp.clickMemberRadioCommittee();
			logger.info("Selected Member...");
			
		}
		
		if(Chaireman == "Yes")
		{
			
			Thread.sleep(3000);
			cp.clickChairmanYesCommittee();
			logger.info("Selected Chairemam Yes...");
		}
		else
		{
			Thread.sleep(3000);
			cp.clickChairmanNoCommittee();
			logger.info("Selected Chairemam No...");
		}	
		
		
		Thread.sleep(3000);
		cp.clickSelectMemberCommittee();
		driver.findElement(By.xpath("//option[contains(text(), ' " + Select_Member + " ')]")).click();
		logger.info("Selected Director/Member...");
		
		
		Thread.sleep(3000);
		cp.setAppointment_Date_of_Member_Director();
		logger.info("Selected Date Of Appointment...");
		
		Thread.sleep(3000);
		cp.setCessation_Date_of_Member_Director();
		logger.info("Selected Date Of Cessation...");
		
		Thread.sleep(3000);
		cp.setEnd_Term_Date_of_Member_Director();
		logger.info("Selected End Term Date...");
			
	
	}
	
	@Test(priority = 24)
	public void addExistingInviteeInCommittee() throws Throwable {


		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Committee";
		
		String Through_VC = reader.getCellData(sheetName, "Through VC", 2);
		String Invitees_Attendance = reader.getCellData(sheetName, "Invitees attendance ", 2);
		String Select_Invitee = reader.getCellData(sheetName, "Select Invitee", 2);
		
		
		CommitteePage cp = new CommitteePage(driver);
	
		Thread.sleep(3000);
		cp.clickInvitteeComitteeTab();
		logger.info("Clicked on Committee Tab...");
		
		Thread.sleep(3000);
		cp.clickExistingInviteeButton();
		logger.info("Clicked on Add Existing Invitee Button...");
		
		
		Thread.sleep(3000);
		cp.clickSelectInvitee();
		driver.findElement(By.xpath("//option[contains(text(), ' " + Select_Invitee + " ')]")).click();
		logger.info("Invitee Selected...");
	
		Thread.sleep(3000);
		cp.setAddressOfInvitee(reader.getCellData(sheetName, "Address", 2));
		logger.info("Entered Address...");
		
		Thread.sleep(3000);
		cp.setCity_of_Invitee(reader.getCellData(sheetName, "City", 2));
		logger.info("Entered City...");
		
		Thread.sleep(3000);
		cp.setStateOfInvitee(reader.getCellData(sheetName, "State", 2));
		logger.info("Entered State...");
		
		Thread.sleep(3000);
		cp.setTel_O_of_Invitee(reader.getCellData(sheetName, "Tel(O)", 2));
		logger.info("Entered Tel(0)...");
		
		Thread.sleep(3000);
		cp.setTel_R_of_Invitee(reader.getCellData(sheetName, "Tel(R)", 2));
		logger.info("Entered Test(R)...");
		
		Thread.sleep(3000);
		cp.setFax_No_Invitee(reader.getCellData(sheetName, "Fax No", 2));
		logger.info("Entered Fax...");
		
		
		if(Through_VC == "Yes")
		{
			Thread.sleep(3000);
			cp.setThrough_VC_Yes();
			logger.info("Through_VC Yes Selected...");
		}
		
		else
		{
			Thread.sleep(3000);
			cp.setThrough_VC_No();
			logger.info("Through_VC NO Selected...");
		}
	
		if(Invitees_Attendance == "Yes")
		{
			Thread.sleep(3000);
			cp.setIn_Attendance();
			logger.info("Invitees_Attendance Yes Selected...");
		}
		
		else
		{
			Thread.sleep(3000);
			cp.clickPermanent_Invitee();
			logger.info("Invitees_Attendance NO Selected...");
		}
	
	
	}
	
	
	@Test(priority = 24)
	public void deleteExistingInviteeInCommittee() throws Throwable {
		

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Committee";
		
		
		CommitteePage cp = new CommitteePage(driver);
		
		Thread.sleep(30000);
		cp.setSearch_Invittee(reader.getCellData(sheetName, "Select Invitee", 2));
		logger.info("Searching...");
		
		
		Thread.sleep(3000);
		cp.clickDeleteIcon_Invitee();
		logger.info("Clicked on Delete Icon...");
		
		
		Thread.sleep(3000);
		cp.clickDeleteConfirmYesButton_Invitee();
		logger.info("Clicked on Confirm Delete Button...");
		
		
		Thread.sleep(3000);
		cp.clickDeleteOK_Invitee();
		logger.info("Clicked on Delete OK Button...");
		
	}
	
	
	
	@Test(priority = 24)
	public void addNewInviteeInCommittee() throws Throwable {
		
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Committee";
		
		String Through_VC_New = reader.getCellData(sheetName, "Through VC (New Invitee)", 2);
		String Invitees_Attendance_New = reader.getCellData(sheetName, "Invitees attendance (New Invitee)", 2);
		
		
		
		CommitteePage cp = new CommitteePage(driver);
		
		Thread.sleep(30000);
		cp.clickAdd_NewInvitee_Button();
		logger.info("Clicked on Add New Invitee Button...");
	
		Thread.sleep(3000);
		cp.setInviteeName_NewInvitee(reader.getCellData(sheetName, "Invitee Name (New Invitee)", 2));
		logger.info("Entered Invitee Name...");
		
		Thread.sleep(3000);
		cp.setInviteeDesignation_NewInvitee(reader.getCellData(sheetName, "Designation (New Invitee)", 2));
		logger.info("Entered Invitee Designation...");
		
		Thread.sleep(3000);
		cp.setInviteeAddress_NewInvitee(reader.getCellData(sheetName, "Address (New Invitee)", 2));
		logger.info("Entered Invitee Address...");
		
		Thread.sleep(3000);
		cp.setInviteeCity_NewInvitee(reader.getCellData(sheetName, "City (New Invitee)", 2));
		logger.info("Entered Invitee City...");
		
		Thread.sleep(3000);
		cp.setInviteeState_NewInvitee(reader.getCellData(sheetName, "State (New Invitee)", 2));
		logger.info("Entered Invitee State...");
		
		Thread.sleep(3000);
		cp.setInviteeTelO_NewInvitee(reader.getCellData(sheetName, "Tel(O) (New Invitee)", 2));
		logger.info("Entered Invitee Tel(O)...");
		
		
		Thread.sleep(3000);
		cp.setInviteeTelR_NewInvitee(reader.getCellData(sheetName, "Tel(R) (New Invitee)", 2));
		logger.info("Entered Invitee Tel(R)...");
		
		Thread.sleep(3000);
		cp.setInviteeFax_NewInvitee(reader.getCellData(sheetName, "Fax No (New Invitee)", 2));
		logger.info("Entered Invitee Fax...");
		
		
		Thread.sleep(3000);
		cp.setInviteeMobNo_NewInvitee(reader.getCellData(sheetName, "Mobile No (New Invitee)", 2));
		logger.info("Entered Invitee Mobile Number...");
	
		
		Thread.sleep(3000);
		cp.setInviteeEmail_NewInviteee(reader.getCellData(sheetName, "Email Id (New Invitee)", 2));
		logger.info("Entered Invitee Email...");
		
		if(Through_VC_New == "Yes")
		{
			Thread.sleep(3000);
			cp.setThrough_VC_Yes();
			logger.info("Through_VC Yes Selected...");
		}
		
		else
		{
			Thread.sleep(3000);
			cp.setThrough_VC_No();
			logger.info("Through_VC NO Selected...");
		}
	
		if(Invitees_Attendance_New == "Yes")
		{
			Thread.sleep(3000);
			cp.setIn_Attendance();
			logger.info("Invitees_Attendance Yes Selected...");
		}
		
		else
		{
			Thread.sleep(3000);
			cp.clickPermanent_Invitee();
			logger.info("Invitees_Attendance NO Selected...");
		}
	
		
		
	}
	
	
	@Test(priority = 24)
	public void updateNewInviteeInCommittee() throws Throwable {
		

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Committee";
		
		
		CommitteePage cp = new CommitteePage(driver);
		
		String Through_VC_NewUpdate = reader.getCellData(sheetName, "Through VC (New Invitee)", 3);
		String Invitees_Attendance_NewUpdate = reader.getCellData(sheetName, "Invitees attendance (New Invitee)", 3);
		
		Thread.sleep(30000);
		cp.clearSearch_Invitee();
		
		Thread.sleep(3000);
		cp.setSearch_Invittee(reader.getCellData(sheetName, "Invitee Name (New Invitee) ", 2));
		logger.info("Searching...");
	
		Thread.sleep(3000);
		cp.clickEditIcon_NewInvitee();
		logger.info("Clicked on Edit Icon...");
		
		
		Thread.sleep(3000);
		cp.clearInviteeName_NewInvitee();
		
		Thread.sleep(3000);
		cp.setInviteeName_NewInvitee(reader.getCellData(sheetName, "Invitee Name (New Invitee)", 3));
		logger.info("Updated Invitee Name...");
		
		Thread.sleep(3000);
		cp.clearInviteeDesignation_NewInvitee();
		Thread.sleep(3000);
		cp.setInviteeDesignation_NewInvitee(reader.getCellData(sheetName, "Designation (New Invitee)", 3));
		logger.info("Updated Invitee Designation...");
		
		Thread.sleep(3000);
		cp.clearInviteeAddress_NewInvitee();
		
		Thread.sleep(3000);
		cp.setInviteeAddress_NewInvitee(reader.getCellData(sheetName, "Address (New Invitee)", 3));
		logger.info("Updated Invitee Address...");
		
		Thread.sleep(3000);
		cp.clearInviteeCity_NewInvitee();
		
		Thread.sleep(3000);
		cp.setInviteeCity_NewInvitee(reader.getCellData(sheetName, "City (New Invitee)", 3));
		logger.info("Updated Invitee City...");
		
		Thread.sleep(3000);
		cp.clearInviteeState_NewInvitee();
		
		Thread.sleep(3000);
		cp.setInviteeState_NewInvitee(reader.getCellData(sheetName, "State (New Invitee)", 3));
		logger.info("Updated Invitee State...");
		
		Thread.sleep(3000);
		cp.clearInviteeTelO_NewInvitee();
		
		Thread.sleep(3000);
		cp.setInviteeTelO_NewInvitee(reader.getCellData(sheetName, "Tel(O) (New Invitee)", 3));
		logger.info("Updated Invitee Tel(O)...");
		
		
		Thread.sleep(3000);
		cp.clearInviteeTelR_NewInvitee();
		
		Thread.sleep(3000);
		cp.setInviteeTelR_NewInvitee(reader.getCellData(sheetName, "Tel(R) (New Invitee)", 3));
		logger.info("Updated Invitee Tel(R)...");
		
		Thread.sleep(3000);
		cp.clearInviteeFax_NewInvitee();
		
		Thread.sleep(3000);
		cp.setInviteeFax_NewInvitee(reader.getCellData(sheetName, "Fax No (New Invitee)", 3));
		logger.info("Updated Invitee Fax...");
		
		
		Thread.sleep(3000);
		cp.clearInviteeMobNo_NewInvitee();
		
		Thread.sleep(3000);
		cp.setInviteeMobNo_NewInvitee(reader.getCellData(sheetName, "Mobile No (New Invitee)", 3));
		logger.info("Updated Invitee Mob...");
	
		Thread.sleep(3000);
		cp.clearInviteeEmail_NewInviteee();
		
		Thread.sleep(3000);
		cp.setInviteeEmail_NewInviteee(reader.getCellData(sheetName, "Email Id (New Invitee)", 3));
		logger.info("Updated Invitee Email...");
		
		if(Through_VC_NewUpdate == "Yes")
		{
			Thread.sleep(3000);
			cp.setThrough_VC_Yes();
			logger.info("Through_VC Yes Selected...");
		}
		
		else
		{
			Thread.sleep(3000);
			cp.setThrough_VC_No();
			logger.info("Through_VC NO Selected...");
		}
	
		if(Invitees_Attendance_NewUpdate == "Yes")
		{
			Thread.sleep(3000);
			cp.setIn_Attendance();
			logger.info("Invitees_Attendance Yes Selected...");
		}
		
		else
		{
			Thread.sleep(3000);
			cp.clickPermanent_Invitee();
			logger.info("Invitees_Attendance NO Selected...");
		}
	
		
		
		Thread.sleep(3000);
		cp.clickUpdateButton_NewInvitee();
		logger.info("Updated Invitee ...");
	
	
	
	
	
	
	
	
	}
	
	
	
	@Test(priority = 24)
	public void deleteNewInviteeInCommittee() throws Throwable {
		

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\dinesh\\workspace\\pss_upsi_v1\\src\\test\\java\\com\\qa\\testdata\\Test Data.xlsx");

		String sheetName = "Committee";
		
		
		CommitteePage cp = new CommitteePage(driver);
		
		
		Thread.sleep(30000);
		cp.clearSearch_Invitee();
		
		Thread.sleep(3000);
		cp.setSearch_Invittee(reader.getCellData(sheetName, "Invitee Name (New Invitee) ", 2));
	
	
		Thread.sleep(3000);
		cp.clickDeleteIcon_Invitee();
		
		
		Thread.sleep(3000);
		cp.clickDeleteConfirmYesButton_Invitee();
		
		
		Thread.sleep(3000);
		cp.clickDeleteOK_Invitee();
	
	
	}
	
	
	
}
