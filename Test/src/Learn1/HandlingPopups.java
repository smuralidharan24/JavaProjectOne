package Learn1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);
		Thread.sleep(3000); // Let the user actually see something!

		// Search by By.linkText
		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept(); // This alert class can be used to click on "OK" button

		// alert.dismiss(); // This alert class can be used to click on "Dismiss" button

		// Please enter valid user name
		driver.quit();

	}

}
