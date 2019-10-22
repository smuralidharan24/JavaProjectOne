package Learn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahooRegRunner {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://uk.mail.yahoo.com");
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);
		Thread.sleep(3000); // Let the user actually see something!

		// Search by By.linkText
		driver.findElement(By.linkText("Sign up")).click();

		// Search by By.xpath contains text
		// WebElement findCreateAccount =
		// driver.findElement(By.xpath("//*[contains(text(),'Sign up')]"));
		// WebElement findCreateAccount = driver.findElement(By.id("createacc"));
		// findCreateAccount.click();
		// "//*[@id="usernamereg-firstName"]" - xpath
		// "#usernamereg-firstName" - CSS Selector
		// "/html/body/div[2]/div[2]/div/div/form/fieldset/div/div[1]/input" - full
		// xpath

		Thread.sleep(2000); // Let the user actually see something!

		// Search by By.ID
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Murali");
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Sub");
		driver.findElement(By.id("usernamereg-yid")).sendKeys("Murali.sub");
		// driver.findElement(By.className("yid-domain")).sendKeys("@yahoo.com");
		driver.findElement(By.id("usernamereg-password")).sendKeys("Murali8802347@yahoo.com");
		driver.findElement(By.id("usernamereg-phone")).sendKeys("07972934024");

		// Selecting dropdown values
		Select select = new Select(driver.findElement(By.id("usernamereg-month")));
		select.selectByVisibleText("March");

		driver.findElement(By.id("usernamereg-day")).sendKeys("24");
		driver.findElement(By.id("usernamereg-year")).sendKeys("1981");

		// WebElement findContinueButton =
		// driver.findElement(By.id("reg-submit-button"));
		// findContinueButton.click();
		driver.quit();
	}

}
