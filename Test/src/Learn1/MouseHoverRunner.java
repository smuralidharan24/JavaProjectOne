package Learn1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverRunner {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome driver

		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all cookies

		driver.get("https://www.spicejet.com/");
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);

		// dynamic wait time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]"))).build()
				.perform();
		Thread.sleep(2000);
		action.moveToElement(
				driver.findElement(By.xpath("//li[@class='hide-mobile']//ul//li//a[contains(text(),'Member Login')]")))
				.build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@class='hide-mobile']//ul//li//a[contains(text(),'Member Login')]")).click();
		Thread.sleep(4000);

		// action.moveToElement(driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"))).build().perform();

		// driver.findElement(By.linkText("Preferred Bag Out")).click();
		// driver.quit();

	}

}
