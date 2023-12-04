package com.BusBookingProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusBookingElements {

	//WebDriver driver;

	// Create PageFactory

	@FindBy(xpath = "//span[text()='Log in']")
	WebElement login;

	@FindBy(xpath = "//span[text()='Continue with email']")
	WebElement continueWithEmail;
	
	@FindBy(xpath = "//span[text()='Continue with email']")
	WebElement continueWithEmail1;
	
	@FindBy(xpath = "//input[@autocomplete='email']")
	WebElement email;

	@FindBy(xpath = "//input[@autocomplete='current-password']")
	WebElement password;
	
	@FindBy(xpath = "//span[text()='Log in']")
	WebElement loginbutton;

	public BusBookingElements(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// Actions

	public void clickonLogin() {

		login.click();
	}
	public void continueWithEmail() {
		continueWithEmail.click();
	}
	public void clickOnEmail() {
		
		email.clear();
		email.click();
		email.sendKeys("user@gmail.com");

	}

	public void clickOnpassword() {
		password.clear();
		password.click();
		password.sendKeys("1234567");
	}

	public void clickOnLoginButton() {

		loginbutton.click();
	}

}
