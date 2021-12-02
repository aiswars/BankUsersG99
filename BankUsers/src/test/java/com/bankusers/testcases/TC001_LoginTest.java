package com.bankusers.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bankusers.pageobjects.LoginPageObject;

public class TC001_LoginTest extends BaseClass {

	
@Test
public void LoginTest() throws IOException
{
	//driver.get(baseURL);
	logger.info("LoginTest: URL is opened");

	LoginPageObject lp = new LoginPageObject(driver);
	
	lp.setUserName(username); 
	logger.info("LoginTest: Entered username");
	
	lp.setPassword(password);
	logger.info("LoginTest: Entered password");
	
	lp.clickLogin();
	
	//check getTitle()
	if(driver.getTitle().equals(" Welcome To Manager's Page of Guru99 Bank"))
	//if(driver.getTitle().equals(" failing title to check screenshots"))
	{
		Assert.assertTrue(true);
		logger.info("LoginTest: LoginTest Title passed"); 
	
	} 
	else
	{
		captureScreen(driver,"LoginTest");
		Assert.assertTrue(false);
		logger.info("LoginTest: LoginTest Title failed");
		System.out.println("LoginTest: LoginTest Title failed");
		
	}
}
}
