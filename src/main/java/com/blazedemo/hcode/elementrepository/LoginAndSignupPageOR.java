package com.blazedemo.hcode.elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAndSignupPageOR {
	

	@FindBy(xpath="//input[@id='loginusername']")
	protected WebElement userName;

	@FindBy(xpath="//input[@id='loginpassword']")
	protected WebElement password;

	@FindBy(xpath="//button[text()='Log in']")
	public WebElement loginButton;

	
	
}
