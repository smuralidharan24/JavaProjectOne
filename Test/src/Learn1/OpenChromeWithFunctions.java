package Learn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeWithFunctions {

	static String browser;
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		setBrowser();
		setBrowserConfig();
		runTest();

	}

	public static void setBrowser() {
		browser = "chrome";
	}

	public static void setBrowserConfig() {
		if (browser == "chrome") {
			System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("Not a valid browser");
		}
	}

	public static void runTest() throws InterruptedException {
		driver.get("http://www.google.co.uk");
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);
		if (title.equals("Google")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is inorrect");
		}
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000); // Let the user actually see something!
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ChromeDriver");
		searchBox.submit();
		Thread.sleep(5000); // Let the user actually see something!
		driver.quit();
	}

}
