package com.practice.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
// initialise the webelemnts
	
	@FindBy(xpath = "//span[text() = 'Account & Lists']")
	WebElement clickOnSingn;

	@FindBy(id = "ap_email")
	WebElement emailidfield;
	
	@FindBy(id = "continue")
	WebElement contiune;
	
	@FindBy(id = "ap_password")
	WebElement passwordField;
	
	@FindBy(id = "signInSubmit")
	WebElement clickOnSingINbtn;

	// use constructor 
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// several methods
	public void clickOntheSignInBtn() {
		clickOnSingn.click();
	}
	
	public void enterEmailid(String emailtext) {
		emailidfield.sendKeys(emailtext);
	}
	public void ClickOnContinue() {
		contiune.click();
	}
	
	public void enterPassword(String password){
		passwordField.sendKeys(password);
	}
	
	public void clickONSingnbtn() {
		clickOnSingINbtn.click();
	}
	
	
}