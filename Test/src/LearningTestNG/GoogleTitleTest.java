package LearningTestNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleTitleTest {

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

	@Test()
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);

		Assert.assertEquals(title, "Google", "Title not matched");
	}

	@Test()
	public void googleLogoTest() {
		boolean isLogoDisplayed = driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println("Logo is Displayed::" + isLogoDisplayed);
		Assert.assertTrue(isLogoDisplayed);
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
