package com.bankusers.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bankusers.pageobjects.AddCustomerPage;
import com.bankusers.pageobjects.LoginPageObject;

public class TC003_AddCustomerTest extends BaseClass

{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		LoginPageObject lp = new LoginPageObject(driver);
		lp.setUserName(username);
		logger.info("addNewCustomer: UserName is provided");
		lp.setPassword(password);
		logger.info("addNewCustomer: Passsword is provided");
		lp.clickLogin();

		Thread.sleep(3000);

		AddCustomerPage addcust = new AddCustomerPage(driver);

		addcust.clickAddNewCustomer();

		logger.info("addNewCustomer: providing customer details....");

		addcust.custName("Capatina");
		addcust.custgender("male");
		addcust.custdob("12", "11", "1990");
		Thread.sleep(5000);
		addcust.custaddress("India");
		addcust.custcity("BLR");
		addcust.custstate("KA");
		addcust.custpinno("2594341");
		addcust.custtelephoneno("2456876786");

		String email = randomestring() + "@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("1a2b3c");
		addcust.custsubmit();

		Thread.sleep(3000);

		logger.info("addNewCustomer: validation started!!");

		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");

		if (res == true) {
			Assert.assertTrue(true);
			logger.info("addNewCustomer: Test case Passed!!");

		} else {
			logger.info("addNewCustomer: Test case Failed");
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
		}

	}

}
