package Learn1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindowsPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome driver

		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all cookies
		// dynamic wait time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.popuptest.com");
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);
		Thread.sleep(3000);

		// Window handler API
		driver.findElement(By.xpath("//a[contains(text(),'Multi-PopUp Test #2')]")).click();
		Thread.sleep(3000);

		// Set and getWindowHandles are used to get the window handler ID
		Set<String> windowhandler = driver.getWindowHandles();

		// Use iterator to loop around and collect the parent and all child pop-up
		// windows
		Iterator<String> setIterator = windowhandler.iterator();
		String parentWindowId = setIterator.next();

		System.out.println("parent Window Id = " + parentWindowId);
		String popUpWindowId1 = setIterator.next();
		System.out.println("1st popUp WindowId = " + popUpWindowId1);
		// Switch to Pop-up window

		driver.switchTo().window(popUpWindowId1);
		System.out.println("Title of the 1st Popup browser is :" + driver.getTitle());
		Thread.sleep(3000);
		driver.close();

		String popUpWindowId2 = setIterator.next();
		System.out.println("2nd popUp WindowId = " + popUpWindowId2);
		// Switch to Pop-up window
		driver.switchTo().window(popUpWindowId2);

		System.out.println("Title of the 2nd Popup browser is :" + driver.getTitle());
		Thread.sleep(3000);
		driver.close();

		String popUpWindowId3 = setIterator.next();
		System.out.println("3rd popUp WindowId = " + popUpWindowId3);
		// Switch to Pop-up window
		driver.switchTo().window(popUpWindowId3);

		System.out.println("Title of the 3rd Popup browser is :" + driver.getTitle());
		Thread.sleep(3000);
		driver.close();

		// Switch back the control to Parent window
		driver.switchTo().window(parentWindowId);
		System.out.println("Title of the Parent window browser is :" + driver.getTitle());
		Thread.sleep(3000);

		driver.quit();
	}

}
