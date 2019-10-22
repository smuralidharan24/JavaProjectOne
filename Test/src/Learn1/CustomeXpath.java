package Learn1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomeXpath {

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

		driver.findElement(By.xpath("//*[@id=\"gdpr-banner-accept\"]")).sendKeys("Java Books");

		Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@class='gh-tb
		// ui-autocomplete-input']")).sendKeys("Java Books");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java Books");
		// driver.findElement(By.xpath("//a[contains(text(),'Search for
		// anything')]")).sendKeys("Java Book");
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("Total links - " + linkList.size());
		for (int i = 0; i < linkList.size(); i++) {
			if (linkList.get(i).getText().length() > 0) {
				System.out.println(linkList.get(i).getText());
			}
		}

		driver.quit();

	}

}
