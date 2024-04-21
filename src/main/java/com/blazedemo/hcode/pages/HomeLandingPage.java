package com.blazedemo.hcode.pages;

import org.openqa.selenium.support.PageFactory;

import com.blazedemo.hcode.elementrepository.HomeLandingPageOR;
import com.blazedemo.hcode.ui.selenium.DriverActions;

public class HomeLandingPage extends HomeLandingPageOR{

	private DriverActions driverAction;

	public void clickOnLaptops() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driverAction.waitForElement(laptops);
		driverAction.clickElement(laptops,true,"Laptops");

	}


	public void clickOnCartTab() {
		driverAction.clickElement(cartTab,true,"Cart tab");
	}
	public void clickOnContactTab() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driverAction.waitForElement(contactTab);
		driverAction.clickElement(contactTab,true,"Contact tab");
	}
	public void clickOnMonitors() {

		driverAction.clickElement(monitors,true,"Monitors");

	}

	public void clickOnFirstProduct() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driverAction.waitForElement(firstProduct);
		driverAction.clickElement(firstProduct,true,"First Product");

	}
	public LoginPage clickOnLoginTab() {

		driverAction.clickElement(logIn,true,"Login");

		return new LoginPage(driverAction);
	}
	public void clickOnLogOut() {

		driverAction.clickElement(logOut,true,"Logout");

	}
	public MyCartPage clickOnAddToCart() {

		driverAction.clickElement(addToCart,true,"Add To Cart");

		return new MyCartPage(driverAction);

	}

	public HomeLandingPage(DriverActions das) {
		this.driverAction=das;
		PageFactory.initElements(driverAction.getWebDriver(), this);
	}
}
