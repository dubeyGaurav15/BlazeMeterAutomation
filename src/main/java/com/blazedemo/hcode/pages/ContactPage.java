package com.blazedemo.hcode.pages;

import org.openqa.selenium.support.PageFactory;

import com.blazedemo.hcode.elementrepository.ContactPageOR;
import com.blazedemo.hcode.ui.selenium.DriverActions;

public class ContactPage extends ContactPageOR{

	private DriverActions driverAction;

	public void inputContactEmail(String contactsEmail) {

		driverAction.inputData(contactEmail, contactsEmail, "Contact Email");
	}
	public void inputContactName(String contactsName) {
		driverAction.inputData(contactName, contactsName, "Contact Name");
	}
	public void inputMessage(String messages) {
		driverAction.inputData(message, messages, "Contact Name");
	}
	public void clickOnSendMessageButton() {
		driverAction.clickElement(sendMessage, true, "Send Message");
	}

	public ContactPage(DriverActions das) {
		this.driverAction=das;
		PageFactory.initElements(driverAction.getWebDriver(), this);
	}
	public String getContactAlertText() {
		String alertMessage=driverAction.getAlertMessage();
		driverAction.acceptAlert();
		return alertMessage;

	}
}
