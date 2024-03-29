package Learn1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome driver
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all cookies

		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);

		// dynamic wait time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.switchTo().frame("iframe1");
		Thread.sleep(2000);
		WebElement element = driver
				.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[4]/ul/li[4]/a/span/span"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		// driver.quit();
	}

}
