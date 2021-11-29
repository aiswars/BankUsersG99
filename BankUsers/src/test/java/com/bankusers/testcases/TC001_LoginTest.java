package com.bankusers.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bankusers.pageobjects.LoginPageObject;

public class TC001_LoginTest extends BaseClass {

	
@Test
public void LoginTest()
{
	driver.get(baseURL);
	
	LoginPageObject lp = new LoginPageObject(driver);
	lp.setUserName(username);
	lp.setPassword(password);
	lp.clickLogin();
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
		
	}
	else
	{
	
		Assert.assertTrue(false);
		
	}
}
}
