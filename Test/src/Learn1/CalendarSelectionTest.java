package Learn1;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarSelectionTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome driver
		Actions action = new Actions(driver);

		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all cookies

		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);

		// dynamic wait time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]")).click();

		String dateTime = "12/07/2014 2:00 PM";

		WebElement calanderIcon = driver.findElement(By.xpath("//span[@class='k-link k-link-date']"));
		calanderIcon.click();

		// left
		WebElement moveLeft = driver.findElement(By.xpath("//span[@class='k-icon k-i-arrow-60-right']"));

		// right
		WebElement moveRight = driver.findElement(By.xpath("//span[@class='k-icon k-i-arrow-60-left']"));

		// month
		WebElement selectMonth = driver.findElement(By.xpath(
				"//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-fast')]"));

		// Split date and time to get only date part
		String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");

		System.out.println("Actual Date time split - " + date_dd_MM_yyyy[0]);
		System.out.println(date_dd_MM_yyyy[1]);
		System.out.println(date_dd_MM_yyyy[2]);

		action.moveToElement(selectMonth).build().perform();

		// Get the year difference between current year and the year to set in calendar
		int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);

		selectMonth.click();

		if (yearDiff != 0) {

			if (yearDiff > 0) {
				for (int i = 0; i < yearDiff; i++) {
					System.out.println("Year Diff = " + i);
					moveLeft.click();
				}
			} else if (yearDiff < 0) {
				for (int i = 0; i < yearDiff * -1; i++) {
					System.out.println("Year Diff = " + i);
					moveRight.click();
				}
			}
		}

		Thread.sleep(2000);

		List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath(
				"//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));

		for (int i = 0; i < list_AllMonthToBook.size(); i++) {
			System.out.println(list_AllMonthToBook.get(i).getText());
		}

		System.out.println(
				"Actual Month #######" + list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1]) - 1).getText());

		list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1]) - 1).click();

		Thread.sleep(1000);

		// get all dates from calendar to select correct one

		List<WebElement> list_AllDateToBook = driver.findElements(By.xpath(
				"//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));

		for (int i = 0; i < list_AllDateToBook.size(); i++) {
			System.out.println(list_AllDateToBook.get(i).getText());
		}

		System.out.println(
				"Actual date #####" + list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0]) - 1).getText());

		list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0]) - 1).click();

		/// FOR TIME

		WebElement selectTime = driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_timeview']"));

		// click time picker button

		selectTime.click();

		// get list of times

		List<WebElement> allTime = driver.findElements(
				By.xpath("//div[@data-role='popup'][contains(@style,'display: block')]//ul//li[@role='option']"));

		dateTime = dateTime.split(" ")[1] + " " + dateTime.split(" ")[2];

		for (int i = 0; i < allTime.size(); i++) {
			System.out.println(allTime.get(i).getText());
		}

		System.out.println("***************************");
		System.out.println("DateTime  - " + dateTime);
		System.out.println(dateTime.split(" ")[0]);
		System.out.println(dateTime.split(" ")[1]);

		// select correct time

		for (WebElement webElement : allTime) {

			if (webElement.getText().equalsIgnoreCase(dateTime))

			{

				webElement.click();

			}

		}

	}

}
