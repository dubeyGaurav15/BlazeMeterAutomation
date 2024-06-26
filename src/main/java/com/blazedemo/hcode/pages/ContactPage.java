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
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void clickOnSendMessageButton() {
		driverAction.clickElement(sendMessage, true, "Send Message");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
