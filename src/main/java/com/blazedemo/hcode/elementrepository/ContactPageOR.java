package com.blazedemo.hcode.elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPageOR {

	@FindBy(xpath = "//input[@id='recipient-email']")
	protected WebElement contactEmail;
	@FindBy(xpath = "//input[@id='recipient-name']")
	protected WebElement contactName;
	@FindBy(xpath = "//textarea[@id='message-text']")
	protected WebElement message;
	@FindBy(xpath = "//button[text()='Send message']")
	protected WebElement sendMessage;
	
}
