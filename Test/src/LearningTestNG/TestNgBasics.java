package LearningTestNG;

import java.time.LocalDateTime;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	public static LocalDateTime now = LocalDateTime.now();

	// Pre-Condition annotations - Starting with @Before
	@BeforeSuite // Step 1
	public void setUp() {
		System.out.println("**********START*************" + now + "****************");
		System.out.println("Setup system property (@BeforeSuite //Step 1)");
	}

	@BeforeTest // Step 2
	public void launchBrowser() {
		System.out.println("Launch Chrome Bowser (@BeforeTest //Step 2)");
	}

	@BeforeClass // Step 3
	public void login() {
		System.out.println("Login to App (@BeforeClass //Step 3)");
	}

	@BeforeMethod // Step 4
	public void enterURL() {
		System.out.println("Enter URL(@BeforeMethod //Step 4)");
	}

	// Test Cases - Starting with @Test
	@Test // Step5 - Test case1
	public void googleTitleMethod() {
		System.out.println("Check and print title of browser (@Test // Step5 - Test case1)");
	}

	@Test // Step5 - Test case2
	public void searchTest() {
		System.out.println("Search Test (@Test //Step5 - Test case2)");
	}

	@Test // Step5 - Test case3
	public void googleLogoTest() {
		System.out.println("google Logo Test (@Test //Step5 - Test case3)");
	}

	// Post Condition annotations - Starting with @After
	@AfterMethod // Step 6
	public void logOut() {
		System.out.println("Logout Method (@AfterMethod //Step 6)");
	}

	@AfterClass // Step 7
	public void closeBrowser() {
		System.out.println("close Browser (@AfterClass //Step 7)");
	}

	@AfterTest // Step 8
	public void deleteAllCookies() {
		System.out.println("deleteAllCookies (@AfterTest //Step 8)");
		System.out.println("*********THE END*************" + now + "****************");
	}

	@AfterSuite // Step 9
	public void generateTestReport() {
		System.out.println("Produce Test Report (@AfterSuite //Step 9)");
	}

}
