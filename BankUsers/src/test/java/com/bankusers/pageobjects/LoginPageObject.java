package com.bankusers.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

	WebDriver ldriver; 
	public LoginPageObject (WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(name="uid")WebElement txtUserName;
	
	@FindBy(name="password") WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='btnLogin']") 
	WebElement btnLogin;
	
	@FindBy(xpath="//input[@name='btnReset']")
	WebElement btnReset;
	
	@FindBy(xpath="//a[normalize-space()='Log out']")
	@CacheLookup
	WebElement lnkLogout;
	
	public void setUserName(String uname) 
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd) 
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	public void clickReset()
	{
		btnReset.clear();
	}
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	}
	