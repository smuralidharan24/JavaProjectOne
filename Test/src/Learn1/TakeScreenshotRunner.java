package Learn1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotRunner {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome driver

		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all cookies

		driver.get("https://www.ebay.co.uk/");
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);
		// dynamic wait time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Take Screenshot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:/Murali/Selenium/Screenshot/ebay.jpeg"));

		driver.navigate().to("https://www.amazon.co.uk/");
		title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);
		Thread.sleep(2000);

		// Take screenshot using Method
		takeSnapShot(driver, "F:/Murali/Selenium/Screenshot/amazon.jpeg");

		driver.navigate().back();
		title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);
		Thread.sleep(2000);

		driver.navigate().forward();
		title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);
		Thread.sleep(2000);

		driver.navigate().refresh();

		System.out.println(driver.manage().getCookies());
		driver.quit();

	}

	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

		// Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		File DestFile = new File(fileWithPath);

		// Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

	}
}
