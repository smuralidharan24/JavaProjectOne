package Learn1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarWithJavaScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome driver

		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all cookies

		driver.get("https://spicejet.com");
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);

		// dynamic wait time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement dateField = driver.findElement(By.name("ctl00$mainContent$view_date1"));
		String dateValue = "19/10";

		selectDateByJS(driver, dateField, dateValue);

	}

	private static void selectDateByJS(WebDriver driver, WebElement element, String dateValue) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAtrribute('value','" + dateValue + "');", element);

	}

}
