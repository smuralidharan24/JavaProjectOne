package Learn1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome driver

		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all cookies

		driver.get("https://ui.freecrm.com");
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);

		// dynamic wait time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("smuralidharan24@gmail.com");
		driver.findElement(By.name("password")).sendKeys("FreeCrm@1234");

		// WebElement loginBtn =
		// driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		// driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		// Is Displayed
		boolean isBtnDispalyed = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).isDisplayed();
		System.out.println(isBtnDispalyed);

		// Is Enabled or Disable
		boolean isBtnEnabled = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).isEnabled();
		System.out.println(isBtnEnabled);

		// Is Selected applicable for checkbox, dropbox, radio button

	}

}
