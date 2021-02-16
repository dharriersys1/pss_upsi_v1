package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.UserPage;

public class TC_UserTest_004 extends BaseClass {

	public String email=randomestring()+"@gmail.com";
	
	@Test(priority=6)
	public void addNewUser() throws InterruptedException
	{
		
        LoginPage lp = new LoginPage(driver);
		
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
		logger.info("Login Successfully");
		
		UserPage up = new UserPage(driver);
		
		
		Thread.sleep(5000);
		up.clickleftMenu();
		logger.info("Click On Left Menu");
		
		Thread.sleep(3000);
		up.clickmasterMenu();
		logger.info("Click On Master Menu");
		
		Thread.sleep(3000);
		up.clickusersMenu();
		logger.info("Click On User Menu");
		

		Thread.sleep(3000);
		up.clickcardHeader();
		
		Thread.sleep(3000);
		up.clickcreateUserButton();
		logger.info("Click On Create User");
		
		Thread.sleep(3000);
		up.clickempRadio();
		logger.info("Click On EMP");
		
		Thread.sleep(3000);
		up.setfirstName("Dinesh");
		logger.info("First Name Entered");
		
		Thread.sleep(3000);
		up.setlastName("Kumbhare");
		logger.info("Last Name Entered");
		
		
		Thread.sleep(3000);
		up.setdesignation("Software Test Engineer");
		logger.info("Designation Entered");
		
		Thread.sleep(3000);
		up.setareaOfExperties("Testing");
		logger.info("Area of Experties Entered");
		
		//String email=randomestring()+"@gmail.com";
		Thread.sleep(3000);
		up.setemailID(email);
		logger.info("Email Id Entered");
		
		Thread.sleep(3000);
		up.setmobNo("7517691781");
		logger.info("Mobile no. Entered");
		
	
		Thread.sleep(3000);
		up.clickgenderM();
		logger.info("Click on Gender as Male");
		
		Thread.sleep(3000);
		up.setexperience("8");
		logger.info("Experience entered");
		
		Thread.sleep(3000);
		up.clickuserRole();
		up.clickselectUserRole();
		logger.info("User Role Entered");
		
		String pan=randomestring()+randomeNum()+"A";
		Thread.sleep(3000);
		up.setpan(pan);
		logger.info("PAN Number entered");
		
		String din=randomeNum()+"1234";
		Thread.sleep(3000);
		up.setdin(din);
		logger.info("DIN Number entered");
		
		Thread.sleep(3000);
		up.clicksendForApproval();
		logger.info("Send For Approval ");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@id='messagePopUp'])[1]")).click();
		
		
		
	}
		
		
		@Test(priority=7)
		public void userAuthorization() throws InterruptedException
		{
			
			UserPage up = new UserPage(driver);
			
			Thread.sleep(30000);
			up.clickunauthorizedUserTab();
			logger.info("Click on Unauthorized Tab");
			
			Thread.sleep(5000);
			up.setsearchOnUnathorized(email);
			logger.info("Search");
			
			Thread.sleep(5000);
			up.clickeditIconOfUnauthorized();
			logger.info("Click on edit icon Unauthorized Tab");
			
			Thread.sleep(5000);	
			up.clickauthorizeButton();
			logger.info("Authorized User");
			
			
			LoginPage lp = new LoginPage(driver);
		    Thread.sleep(5000);	
		    lp.clickOnProfile();
		    Thread.sleep(5000);
		    lp.clickOnLogout();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
}
