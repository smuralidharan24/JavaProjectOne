package LearningTestNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	public LocalDateTime dateTime = LocalDateTime.now();

	@BeforeSuite // Step 1
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");
		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("**********START*************" + dateTime.format(formatter) + "****************");
	}

	@BeforeMethod
	public void launchBrowser() {

		driver = new ChromeDriver(); // Launch Chrome driver

		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all cookies
		// dynamic wait time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://google.co.uk");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@Test(priority = 1, groups = "Group1")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);
	}

	@Test(priority = 1, groups = "Group1")
	public void googleLogoTest() {
		boolean isLogoDisplayed = driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println("Logo is Displayed::" + isLogoDisplayed);
	}

	@Test(priority = 2, groups = "Group2")
	public void gmailLinkTest() {
		boolean isgmailLinkDisplayed = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println("Gmail link is Displayed::" + isgmailLinkDisplayed);
	}

	@Test(priority = 2, groups = "Group2")
	public void storeLinkTest() {
		boolean isStoreLinkDisplayed = driver.findElement(By.linkText("Store")).isDisplayed();
		System.out.println("Store link is Displayed::" + isStoreLinkDisplayed);
	}

	@Test(priority = 3, groups = "Group3")
	public void imagesLinkTest() {
		boolean isImagesLinkDisplayed = driver.findElement(By.linkText("Images")).isDisplayed();
		System.out.println("Images link is Displayed::" + isImagesLinkDisplayed);
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
