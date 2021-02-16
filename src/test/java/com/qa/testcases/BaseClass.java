package com.qa.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.qa.utilities.ReadConfig;
import com.qa.utilities.SendEmailWithReport;

public class BaseClass {

	
	ReadConfig readConfig = new ReadConfig();
	
	public static WebDriver driver ;
	public String url = readConfig.getApplicationURL();
    public String uname =readConfig.getUsername();
    public String selcname = readConfig.getcomName();
    public String pwd = readConfig.getPassword();
    public static Logger logger;
    //int counter,num=1,prioirty;
    
    @BeforeClass
	public void setup()
	{
    	logger = Logger.getLogger("UPSI");
		PropertyConfigurator.configure("Log4j.properties");
    	
    	System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
	}
    
//    public void demopriority(){
//    	prioirty = num;
//    	for(i=0;i<num;i++){
//    		counter++;
//    	}
//    }
	
    @AfterClass
	public void tearDown()
	{
		
		//driver.quit();
      ///  SendEmailWithReport email = new SendEmailWithReport();
    	//email.SendEmail();
    	
    	
    	
//    	
//    	Runtime r=Runtime.getRuntime();  	  
//    	r.addShutdownHook(new Thread(){  
//    	public void run(){  
//    		SendEmailWithReport sm = new SendEmailWithReport();
//    		
//    			sm.SendEmail();
//    			System.out.println("Report has been sent"); 
//    		 
//    	    }  
//    	}  
//    	);  
//    	try{Thread.sleep(5000);}catch (Exception e) 
//    	{
//    		System.out.println(e);
//    	}  
//    	
//    	
//    	
//    	
//    	
//    	
//    	
//    	
//    	
//    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
	
    
//    @AfterSuite
//    public void last()
//    {
//    	SendEmailWithReport email = new SendEmailWithReport();
//    	email.SendEmail();
//    	
//    }
    
    
    
    public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
    
    
    public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
	
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}
    
	
}
