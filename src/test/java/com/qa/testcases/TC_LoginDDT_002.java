package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pageobjects.LoginPage;
import com.qa.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass{

	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pass)
	{
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(user);
		lp.setpassword(pass);
		
	}
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
		
		
	}
	
	
	
}
