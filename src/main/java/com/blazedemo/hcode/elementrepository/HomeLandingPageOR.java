package com.blazedemo.hcode.elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeLandingPageOR {

	
	@FindBy(xpath = "//a[@id='itemc' and text()='Laptops']")
	protected WebElement laptops;
	@FindBy(xpath = "//a[@id='itemc' and text()='Monitors']")
	protected WebElement monitors;
	@FindBy(xpath = "//div[@class='card-block']//a")
	protected WebElement firstProduct;
	@FindBy(xpath = "//a[text()='Add to cart']")
	protected WebElement addToCart;
	@FindBy(xpath = "//a[text()='Cart']")
	protected WebElement cartTab;
	@FindBy(xpath = "//a[text()='About us']")
	protected WebElement aboutUsTab;
	@FindBy(xpath = "//a[text()='Contact']")
	protected WebElement contactTab;
	@FindBy(xpath = "//a[text()='Log out']")
	protected WebElement logOut;
	@FindBy(xpath = "//a[text()='Log in']")
	protected WebElement logIn;
	
	
}
