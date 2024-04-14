package com.blazedemo.hcode.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.blazedemo.hcode.pages.HomeLandingPage;
import com.blazedemo.hcode.pages.MyCartPage;

public class TestScript extends BaseTestSuite{

	@Test
	public void verifyUserisAbleToOrderProduct() {

		HomeLandingPage homePage = new HomeLandingPage(driverAction);
		homePage.clickOnLaptops();
		homePage.clickOnFirstProduct();
		MyCartPage mycartpage=homePage.clickOnAddToCart();
		driverAction.acceptAlert();
		homePage.clickOnCartTab();
		mycartpage.clickOnPlaceOrderButton();
		mycartpage.inputCustomerName(placeOrderdata.getJSONObject("placeOrderData1").getString("Name"));
		mycartpage.inputCustomerCountry(placeOrderdata.getJSONObject("placeOrderData1").getString("Country"));
		mycartpage.inputCustomerCity(placeOrderdata.getJSONObject("placeOrderData1").getString("City"));
		mycartpage.inputCustomerCreditCardDetails(placeOrderdata.getJSONObject("placeOrderData1").getString("CreditCard"));
		mycartpage.inputMonth(placeOrderdata.getJSONObject("placeOrderData1").getString("Month"));
		mycartpage.inputYear(placeOrderdata.getJSONObject("placeOrderData1").getString("Year"));
		mycartpage.clickOnPurchaseButton();
		driverAction.uiText_validation(mycartpage.getConfirmationMessage(), "Thank you for your purchase!");
		Assert.assertEquals(mycartpage.getConfirmationMessage(), "Thank you for your purchase!");

	}


}
