package Learn1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowsPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome driver

		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all cookies
		// dynamic wait time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.popuptest.com/goodpopups.html");
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);
		Thread.sleep(3000);

		// Window handler API
		driver.findElement(By.xpath("//a[@class='black']")).click();
		Thread.sleep(3000);

		// Set and getWindowHandles are used to get the window handler ID
		Set<String> windowhandler = driver.getWindowHandles();

		// Use iterator to loop around and collect the parent and all child pop-up
		// windows
		Iterator<String> setIterator = windowhandler.iterator();
		String parentWindowId = setIterator.next();
		System.out.println("parentWindowId = " + parentWindowId);
		String popUpWindowId = setIterator.next();
		System.out.println("popUpWindowId = " + popUpWindowId);
		// Switch to Pop-up window
		driver.switchTo().window(popUpWindowId);

		System.out.println("Title of the Popup browser is :" + driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		// Switch back the control to Parent window
		driver.switchTo().window(parentWindowId);
		System.out.println("Title of the Parent window browser is :" + driver.getTitle());
		Thread.sleep(3000);

		driver.quit();
	}

}
