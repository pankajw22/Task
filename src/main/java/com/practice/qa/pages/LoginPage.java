package com.practice.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
// initialise the webelemnts
	
	@FindBy(xpath = "//span[normalize-space() = 'Account & Lists']")
	WebElement AccountandList;

	@FindBy(id = "ap_email")
	WebElement emailidField;
	
	@FindBy(id = "continue")
	WebElement contiune;
	
	@FindBy(id = "ap_password")
	WebElement passwordField;
	
	@FindBy(id = "signInSubmit")
	WebElement SingINbtn;

	// use constructor 
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// several methods
	public void clickOnAccountListIcon() {
		AccountandList.click();
	}
	
	public void enterEmailid(String emailText) {
		emailidField.sendKeys(emailText);
	}
	public void ClickOnContinue() {
		contiune.click();
	}
	
	public void enterPassword(String password){
		passwordField.sendKeys(password);
	}
	
	public void clickONSingnINbtn() {
		SingINbtn.click();
	}
	
	
}