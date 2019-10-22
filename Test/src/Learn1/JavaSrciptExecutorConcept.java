package Learn1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSrciptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
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

		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		// driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();

		// To flash a highlighted colour on a element
		// flash(loginBtn, driver);
		Thread.sleep(3000); // Let the user actually see something!

		// To draw an border around an element
		drawBorder(loginBtn, driver);
		Thread.sleep(3000);
		// To produce an alert during runtime
		// generateAlert(driver, "There is a defect on the page");

		// To click an element via java script
		clickElementbyJS(loginBtn, driver);
		Thread.sleep(3000);
		System.out.println("Title of the browser after login is :" + driver.getTitle());

		// driver.navigate().refresh();
		// Thread.sleep(3000);

		// To refresh via JS
		// refreshBrowserByJS(driver);
		// Thread.sleep(3000);
		// To get Title via Java script
		System.out.println("Title retreived via Java Script - " + getTitleByJS(driver));

		Thread.sleep(3000);
		System.out.println(getPageInnerTest(driver));

		// Scroll using java Script
		// scrollPageDown(driver);

		// Scroll till the element is in view
		WebElement elementToView = driver.findElement(By.xpath("//div[contains(text(),'Twitter')]"));
		scrollIntoView(elementToView, driver);

		Thread.sleep(3000);

		// driver.quit();
	}

	private static void scrollIntoView(WebElement elementToView, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true)", elementToView);

	}

	private static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

	private static String getPageInnerTest(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}

	private static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String titleByJS = js.executeScript("return document.title;").toString();
		return titleByJS;
	}

	private static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	private static void clickElementbyJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}

	private static void generateAlert(WebDriver driver, String message) throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
		Thread.sleep(5000);
	}

	private static void drawBorder(WebElement element, WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
		Thread.sleep(1000);

	}

	public static void flash(WebElement element, WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgColor = element.getCssValue("backgroundColor");
		System.out.println(bgColor);
		for (int i = 0; i < 10; i++) {
			changeColor("rbg(0,200,0)", element, driver);
			Thread.sleep(1000);
			changeColor(bgColor, element, driver);
		}
	}

	private static void changeColor(String color, WebElement element, WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		// js.executeScript("arguments[0].style.backgroundColor = '" + color + "'",
		// element);
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid red;');", element);
		// Thread.sleep(2000);
		// js.executeScript("arguments[0].style.border = '3px solid red'", element);
		// Thread.sleep(2000);
		// js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
		// element,"color: yellow; border: 2px solid yellow;");
		Thread.sleep(1000);
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
		// Thread.sleep(2000);
	}

}
