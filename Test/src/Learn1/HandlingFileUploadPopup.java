package Learn1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://html.com/input-type-file/");
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);
		Thread.sleep(3000); // Let the user actually see something!

		// Search by By.linkText
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("F:/Murali/Test.html");
		driver.findElement(By.xpath("//*[@id=\"post-206\"]/div/div[3]/form/input[2]")).click();

		driver.quit();
	}

}
