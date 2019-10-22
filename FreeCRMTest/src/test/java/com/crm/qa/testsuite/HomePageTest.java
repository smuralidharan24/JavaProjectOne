package com.crm.qa.testsuite;

import java.time.format.DateTimeFormatter;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;

import junit.framework.Assert;

public class HomePageTest extends TestBase {
	LoginPage loginPage; // LoginPage class constructor
	HomePage homePage;
	ContactsPage contactPage;
	DealsPage dealsPage;
	TasksPage tasksPage;

	// Constructor is created so that we won't get null pointer exception
	public HomePageTest() {
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
		contactPage = new ContactsPage();
		dealsPage = new DealsPage();
		tasksPage = new TasksPage();
		homePage = loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
	}

	@Test()
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		System.out.println(homePageTitle);
		Assert.assertEquals("Homepage Title is incorrect", "Cogmento CRM", homePageTitle);
	}

	@Test()
	public void verifyUserDisplayNameTest() {
		String userDisplayName = homePage.verifyUserDisplayName();
		System.out.println(userDisplayName);
		Assert.assertEquals("Usename is incorrect", properties.getProperty("userDisplayName"), userDisplayName);
	}

	@Test()
	public void verifyClickOnContactsLinkTest() {
		contactPage = homePage.clickOnContactsLink();
	}

	@Test()
	public void verifyClickOnDealsLinkTest() {
		dealsPage = homePage.clickOnDealsLink();
	}

	@Test()
	public void verifyClickOnTasksLinkTest() {
		tasksPage = homePage.clickOnTasksLink();
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
