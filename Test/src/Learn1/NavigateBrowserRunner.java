package Learn1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBrowserRunner {

	public static void main(String[] args) throws InterruptedException {
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

		driver.navigate().to("https://www.amazon.co.uk/");
		title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);
		Thread.sleep(2000);

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

}
