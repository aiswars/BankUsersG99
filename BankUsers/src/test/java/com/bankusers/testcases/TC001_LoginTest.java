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
	logger.info("URL is opened");

	LoginPageObject lp = new LoginPageObject(driver);
	
	lp.setUserName(username); 
	logger.info("Entered username");
	
	lp.setPassword(password);
	logger.info("Entered password");
	
	lp.clickLogin();
	
	//if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage - checking screenshots"))
	{
		Assert.assertTrue(true);
		logger.info("Login test passed");
	
	}
	else
	{
		captureScreen(driver,"LoginTest");
		Assert.assertTrue(false);
		logger.info("Login test failed");
		
	}
}
}
