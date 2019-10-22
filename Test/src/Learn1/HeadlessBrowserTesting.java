package Learn1;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HeadlessBrowserTesting {

	public static void main(String[] args) {
		// HtmlUnitDriver driver = new HtmlUnitDriver();
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER);
		driver.get("http://seleniumhq.org/");
		System.out.println("Title - " + driver.getTitle());
		System.out.println("BrowserVersion - " + driver.getBrowserVersion());
		System.out.println("BrowserVersion - " + driver.getBrowserVersion().isChrome());
		driver.quit();

	}

}
