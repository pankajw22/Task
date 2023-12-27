package com.practice.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.practice.qa.base.BaseClass;
import com.practice.qa.pages.LoginPage;

public class LoginTest extends BaseClass {
	
	// this method run before every method
	@BeforeMethod
	public void setup() {
		driver = launchBrowserAndOpenApplication();
	}
	
	// this method run after every method
	@AfterMethod
	public void turnDown() {
		driver.quit();
	}
	
	// this is the test case where we can verify login
	@Test ( priority = 1)
	public void verifyLoginWithValidCredentials() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.clickOnAccountListIcon();
		loginpage.enterEmailid("pankaj@gmail.com");
		loginpage.ClickOnContinue();
		loginpage.enterPassword("pankaj232");
		loginpage.clickONSingnINbtn();
	}
}
