package com.crm.qa.testsuite;

import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;
import com.crm.qa.utilities.TestUtility;

public class ContactsPageTest extends TestBase {

	private static final String sheetName = "Contacts";
	LoginPage loginPage; // LoginPage class constructor
	HomePage homePage;
	ContactsPage contactPage;
	DealsPage dealsPage;
	TasksPage tasksPage;

	// Constructor is created so that we won't get null pointer exception
	public ContactsPageTest() {
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
		// dealsPage = new DealsPage();
		// tasksPage = new TasksPage();
		homePage = loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
		contactPage = homePage.clickOnContactsLink();
		driver.manage().timeouts().pageLoadTimeout(TestUtility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtility.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

	/*
	 * @Test() public void verifyContactPageLabelTest() {
	 * Assert.assertTrue("Contacts Label is missing",
	 * contactPage.verifyContactPageLabel()); }
	 * 
	 * @Test() public void printAllContactsListTest() throws InterruptedException {
	 * Thread.sleep(4000); contactPage.allContactsList(); }
	 */

	@DataProvider
	public Object[][] getTestData() {
		Object data[][] = TestUtility.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider = "getTestData")
	public void createNewContactTest(String firstname, String lastname, String companyName, String emailAddress)
			throws Exception {

		contactPage.clickOnNewContact();
		/*
		 * contactPage.enterContactName(); contactPage.selectCompanyName();
		 * contactPage.enterEmailAddress(); contactPage.enterAddress();
		 * contactPage.enterPhoneNumber();
		 */
		contactPage.enterContactName(firstname, lastname);
		contactPage.selectCompanyName(companyName);
		contactPage.enterEmailAddress(emailAddress);
		contactPage.enterAddress();
		contactPage.enterPhoneNumber();
		contactPage.saveContact();
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("***********************************************************");
		driver.quit();
	}

	@AfterTest // Step 8
	public void deleteAllCookies() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("*********THE END*************" + dateTime.format(formatter) + "****************");

	}

}
