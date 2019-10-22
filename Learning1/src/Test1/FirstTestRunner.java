package Test1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;

public class GettingStarted {
  @Test
  public void testGoogleSearch() throws InterruptedException {
    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
    System.setProperty("webdriver.chrome.driver", "C:/Users/Murali/eclipse-workspace/Learning1/SeleniumWebDriverLib/ChromeDriver");

    WebDriver driver = new ChromeDriver();
    driver.get("http://www.google.com/");
    Thread.sleep(5000);  // Let the user actually see something!
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("ChromeDriver");
    searchBox.submit();
    Thread.sleep(5000);  // Let the user actually see something!
    driver.quit();
  }
}

public class FirstTestRunner {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Murali/eclipse-workspace/Learning1/SeleniumWebDriverLib/ChromeDriver");
		WebDriver driver = new ChromeDriver();
				 

	}

}
