package Learn1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxAndRadioButtonRunner {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome driver

		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all cookies

		driver.get("http://toolsqa.com/automation-practice-form/");
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);

		// dynamic wait time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("cookie_action_close_header")).click();
		scrollByPixel(driver);

		// Selecting radio button
		List<WebElement> radioButton = driver.findElements(By.name("sex"));

		System.out.println(radioButton);
		boolean isRadioButtonSelected = false;

		int radioButtonSize = radioButton.size();
		for (int i = 0; i < radioButtonSize; i++) {
			String radioButtonValue = radioButton.get(i).getAttribute("value");
			System.out.println(radioButtonValue);
			isRadioButtonSelected = radioButton.get(i).isSelected();
			System.out.println(isRadioButtonSelected);

			if (isRadioButtonSelected == true && radioButtonValue.equalsIgnoreCase("female")) {

				// Scroll till the element is in view
				// WebElement elementToView = radioButton.get(i);
				// scrollIntoView(elementToView, driver);
				radioButton.get(i).click();
			} else {
				// WebElement elementToView = radioButton.get(i);
				// scrollIntoView(elementToView, driver);
				radioButton.get(i).click();
			}
		}

		driver.findElement(By.id("exp-2")).click();

		Thread.sleep(2000);
		List<WebElement> checkBox = driver.findElements(By.name("profession"));
		Thread.sleep(2000);
		int checkBoxSize = checkBox.size();
		for (int j = 0; j < checkBoxSize; j++) {
			String checkBoxValue = checkBox.get(j).getAttribute("value");
			if (checkBoxValue.equalsIgnoreCase("Automation Tester")) {
				System.out.println(checkBoxValue);
				checkBox.get(j).click();
			}
		}

		driver.findElement(By.cssSelector("#tool-1")).click();

		// select from drop down

		Select selectContinents = new Select(driver.findElement(By.id("continents")));

		System.out.println("Is Continent list multiple select :" + selectContinents.isMultiple());

		selectContinents.selectByVisibleText("North America");
		Thread.sleep(2000);
		selectContinents.selectByIndex(1);

		List<WebElement> continentsList = selectContinents.getOptions();

		for (int i = 0; i < continentsList.size(); i++) {
			System.out.println(continentsList.get(i).getText());
		}

		// select from Multiple drop down

		Select selectContinentsMultiple = new Select(driver.findElement(By.id("continentsmultiple")));
		System.out.println("Is Continent list multiple select :" + selectContinents.isMultiple());

		selectContinentsMultiple.selectByVisibleText("North America");
		Thread.sleep(2000);
		selectContinentsMultiple.deselectAll();
		selectContinentsMultiple.selectByValue("EU");
		selectContinentsMultiple.selectByIndex(2);
		selectContinentsMultiple.deselectAll();
		Thread.sleep(2000);

		List<WebElement> continentsMultipleList = selectContinentsMultiple.getOptions();
		for (int i = 0; i < continentsMultipleList.size(); i++) {
			System.out.println(continentsMultipleList.get(i).getText());
			selectContinentsMultiple.selectByIndex(i);
		}
		// driver.quit();

	}

	/*
	 * private static void scrollIntoView(WebElement elementToView, WebDriver
	 * driver) { JavascriptExecutor js = ((JavascriptExecutor) driver);
	 * js.executeScript("arguments[0].scrollIntoView(true)", elementToView);
	 * 
	 * }
	 */

	public static void scrollByPixel(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,500)");
	}
}
