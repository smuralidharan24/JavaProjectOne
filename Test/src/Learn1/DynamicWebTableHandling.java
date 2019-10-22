package Learn1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Chrome driver

		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all cookies

		driver.get("http://demo.guru99.com/test/web-table-element.php");
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);

		// dynamic wait time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// No. of Columns
		List col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("Total No of columns are : " + col.size());
		// No.of rows
		List rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("Total No of rows are : " + rows.size());

		// *[@id="leftcontainer"]/table/tbody/tr[1]/td[1]
		// *[@id="leftcontainer"]/table/tbody/tr[5]/td[1]/a
		// *[@id="leftcontainer"]/table/tbody/tr[4]/td[1]/a
		// *[@id="leftcontainer"]/table/tbody/tr[4]/td[1]/a
		// *[@id="leftcontainer"]/table/tbody/tr[8]/td[1]/a
		// *[@id="leftcontainer"]/table/tbody/tr[26]/td[1]/a

		String before_xpath = "//*[@id=\"leftcontainer\"]/table/tbody/tr[";
		String after_xpath1 = "]/td[";
		String after_xpath2 = "]";

		// *[@id="leftcontainer"]/table/thead/tr/th[1]
		// *[@id="leftcontainer"]/table/thead/tr/th[2]
		// *[@id="leftcontainer"]/table/thead/tr/th[5]

		// *[@id="leftcontainer"]/table/thead

		System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead")).getText());

		for (int i = 1; i <= rows.size(); i++) {
			// String dynamicTableValue = driver.findElement(By.xpath(before_xpath + i +
			// after_xpath2)).getText();
			String dynamicTableValue = driver
					.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + i + "]")).getText();
			System.out.println(dynamicTableValue);
		}

		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 26; i++) {
				String dynamicTableValue = driver
						.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.println(dynamicTableValue);
			}
		}

		// *[@id="leftcontainer"]/table/tbody/tr[1]/td[4]
		// *[@id="leftcontainer"]/table/tbody/tr[2]/td[4]
		// *[@id="leftcontainer"]/table/tbody/tr[9]/td[4]

		// driver.quit();

	}

}
