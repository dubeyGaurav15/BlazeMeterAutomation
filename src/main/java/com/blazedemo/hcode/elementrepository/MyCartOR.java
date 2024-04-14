package com.blazedemo.hcode.elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyCartOR {

	@FindBy(xpath = "//button[text()='Place Order']")
	protected WebElement placeOrderBtn;
	@FindBy(xpath = "//input[@id='name']")
	protected WebElement inputName;
	@FindBy(xpath = "//input[@id='country']")
	protected WebElement inputCountry;
	@FindBy(xpath = "//input[@id='city']")
	protected WebElement inputCity;
	@FindBy(xpath = "//input[@id='card']")
	protected WebElement inputCreditCard;
	@FindBy(xpath = "//input[@id='month']")
	protected WebElement inputMonth;
	@FindBy(xpath = "//input[@id='year']")
	protected WebElement inputYear;
	@FindBy(xpath = "//button[text()='Purchase']")
	protected WebElement purchase;
	@FindBy(xpath = "//h2[text()='Thank you for your purchase!']")
	protected WebElement Confirmation;
	
}
