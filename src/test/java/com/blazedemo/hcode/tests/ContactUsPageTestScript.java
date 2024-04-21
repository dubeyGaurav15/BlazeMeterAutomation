package com.blazedemo.hcode.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.blazedemo.hcode.pages.ContactPage;
import com.blazedemo.hcode.pages.HomeLandingPage;
import com.blazedemo.hcode.pages.MyCartPage;

public class ContactUsPageTestScript extends BaseTestSuite{

	@Test
	public synchronized void verifyContactUsPage() {

		HomeLandingPage homePage = new HomeLandingPage(driverAction);
		homePage.clickOnContactTab();
		ContactPage contact= new ContactPage(driverAction);
		contact.inputContactEmail(contactPagedata.getJSONObject("ContactData1").getString("email"));
		contact.inputContactName(contactPagedata.getJSONObject("ContactData1").getString("name"));
		contact.inputMessage(contactPagedata.getJSONObject("ContactData1").getString("message"));
		contact.clickOnSendMessageButton();
		String message =contact.getContactAlertText();
		driverAction.uiText_validation(message , "Thanks for the message!!");

	}



}
