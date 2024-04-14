package com.blazedemo.hcode.pages;

import org.json.JSONObject;
import org.openqa.selenium.support.PageFactory;

import com.blazedemo.hcode.elementrepository.LoginAndSignupPageOR;
import com.blazedemo.hcode.elementrepository.MyCartOR;
import com.blazedemo.hcode.ui.selenium.DriverActions;

public class MyCartPage  extends MyCartOR{

	private DriverActions driverAction;



	public void inputCustomerName(String customerName) {
		driverAction.inputData(inputName, customerName, "Customer Name");
	}
	public void inputCustomerCountry(String customerCountry) {
		driverAction.inputData(inputCountry, customerCountry, "Customer Country");
	}

	public void inputCustomerCity(String customerCity) {
		driverAction.inputData(inputCity, customerCity, "Customer City");
	}
	public void inputCustomerCreditCardDetails(String customerCreditCardDetails) {
		driverAction.inputData(inputCreditCard, customerCreditCardDetails, "CreditCard Number");
	}
	public void inputMonth(String inputmonth) {
		driverAction.inputData(inputMonth, inputmonth, "Month");
	}
	public void inputYear(String year) {
		driverAction.inputData(inputYear, year, "Year");
	}
	public void clickOnPurchaseButton() {

		driverAction.clickElement(purchase,true,"Purchase");

	}
	public void clickOnPlaceOrderButton() {

		driverAction.clickElement(placeOrderBtn,true,"Place Order");

	}

	public String getConfirmationMessage() {
		return driverAction.getText(Confirmation);
	}

	public MyCartPage(DriverActions das) {
		this.driverAction=das;
		PageFactory.initElements(driverAction.getWebDriver(), this);
	}



}
