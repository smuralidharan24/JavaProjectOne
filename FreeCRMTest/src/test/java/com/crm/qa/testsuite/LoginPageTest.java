package com.crm.qa.testsuite;

import java.time.format.DateTimeFormatter;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {

	LoginPage loginPage; // LoginPage class constructor
	HomePage homePage;

	// Constructor is created so that we won't get null pointer exception
	public LoginPageTest() {
		super(); // This will take the control to TestBase()
	}

	@BeforeSuite // Step 1
	public void preConditions() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("**********START*************" + dateTime.format(formatter) + "****************");
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage(); // LoginPage class method
	}

	@Test(dependsOnMethods = "forgottenPasswordLinkTest")
	public void loginPageTitleTest() {
		String title = loginPage.validatePageTile();
		Assert.assertEquals(title, "Cogmento CRM");
	}

	@Test(priority = 1)
	public void forgottenPasswordLinkTest() {
		boolean forgottenPasswordLinkFlag = loginPage.validateForgotYourPasswordLink();
		Assert.assertTrue(forgottenPasswordLinkFlag);
	}

	@Test()
	public void submitLoginTest() {
		homePage = loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("***********************************************************");
		driver.quit();
		// driver.manage().deleteAllCookies();
	}

	@AfterTest // Step 8
	public void deleteAllCookies() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("*********THE END*************" + dateTime.format(formatter) + "****************");

	}

}
