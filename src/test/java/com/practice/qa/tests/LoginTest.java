package com.practice.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.practice.qa.base.BaseClass;
import com.practice.qa.pages.LoginPage;

public class LoginTest extends BaseClass {
	
	
	@BeforeMethod
	public void setup() {
		driver = launchBrowserAndOpenApplication();
	}
	
	
	@AfterMethod
	public void turnDown() {
		driver.quit();
	}
	
	
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
