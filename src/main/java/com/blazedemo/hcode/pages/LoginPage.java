package com.blazedemo.hcode.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.blazedemo.hcode.elementrepository.LoginAndSignupPageOR;
import com.blazedemo.hcode.ui.selenium.DriverActions;

public class LoginPage extends LoginAndSignupPageOR{

	private DriverActions driverAction;

	public void inputUserName(String inputuserName) {
		driverAction.waitForElement(userName);
		driverAction.inputData(userName, inputuserName,"UserName");;
	}
	
	public void inputPassword(String inputPassword) {
		driverAction.waitForElement(password);
		driverAction.inputData(password, inputPassword,"Pasword");;
	}
	public void loginButton() {
		
		driverAction.clickElement(loginButton,true,"Login");;
	}


	public LoginPage(DriverActions das) {
		this.driverAction=das;
		PageFactory.initElements(driverAction.getWebDriver(), this);
	}

}
