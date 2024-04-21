package com.blazedemo.hcode.tests;

import java.lang.reflect.Method;

import org.json.JSONObject;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.blazedemo.hcode.json.JsonParser;
import com.blazedemo.hcode.pages.HomeLandingPage;
import com.blazedemo.hcode.pages.LoginPage;
import com.blazedemo.hcode.ui.selenium.DriverActions;


public class BaseTestSuite{

	protected static DriverActions driverAction ;

	public JSONObject placeOrderdata;
	public JSONObject contactPagedata;

	@BeforeSuite(alwaysRun = true)
	public void createObject() {
		driverAction=new DriverActions();

//		driverAction.createReport();


	}
	@BeforeTest
	public void initilizeReport() {

		driverAction.createReport();


	}


	@BeforeClass(alwaysRun = true)
	@Parameters({"browserName"})
	public void setUp(String browserName) throws Exception{

		driverAction.getLocalInstance(browserName);
		driverAction.openUrl();
	}

	@AfterClass(alwaysRun = true)
	public void afterTestThreadContextCleanup() {
		driverAction.closeBrowser();
		driverAction.generateReport();
	}

	@BeforeMethod(alwaysRun = true)
	public void verifyloginPage(Method tsName) {

		placeOrderdata = JsonParser.parse("placeOrderTestData.json");
		contactPagedata = JsonParser.parse("contactPageData.json");

		String testCaseName=tsName.getName();
		driverAction.createTest(testCaseName);

		HomeLandingPage homePageLanding=new HomeLandingPage(driverAction);
		LoginPage loginPage=homePageLanding.clickOnLoginTab();
		String userName=driverAction.getProperties().getProperty("userName");
		String password=driverAction.getProperties().getProperty("Password");
		loginPage.inputUserName(userName);
		loginPage.inputPassword(password);
		loginPage.loginButton();


	}

	@AfterMethod(alwaysRun = true)
	public void logout(ITestResult result,Method m) {
		int status=result.getStatus();
		if(status==ITestResult.FAILURE) {
			String imgPath=driverAction.takeScreenShot(m.getName());
			driverAction.attachsnapshotToextentReport(imgPath);

		}

		HomeLandingPage homePageLanding=new HomeLandingPage(driverAction);
		homePageLanding.clickOnLogOut();
		driverAction.generateReport();
	}

	@AfterSuite
	public void generateReport() {
		driverAction.generateReport();
	}
}
