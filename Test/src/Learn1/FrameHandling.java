package Learn1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:/Murali/Selenium/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launch Chrome driver
		LocalDateTime now = LocalDateTime.now();
		LocalDate today = LocalDate.now();

		now.toLocalTime();

		Actions action = new Actions(driver);

		driver.manage().window().maximize(); // maximize windows
		driver.manage().deleteAllCookies(); // delete all cookies

		driver.get("https://ui.freecrm.com");
		String title = driver.getTitle();
		System.out.println("Title of the browser is :" + title);

		// dynamic wait time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Enter Username
		driver.findElement(By.name("email")).sendKeys("smuralidharan24@gmail.com");
		// Enter password
		driver.findElement(By.name("password")).sendKeys("FreeCrm@1234");
		// Click on Login Button
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

		// Click on contact
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		Thread.sleep(3000); // Let the user actually see something!

		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();

		// driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]/span")).click();

		int nameLength = 12;
		// randomString(nameLength);
		// generateRandomMobileNumber();

		// Enter firstname
		String firstName = randomString(nameLength);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName);
		// Enter lastname
		String lastName = randomString(nameLength);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastName);

		// Select Company
		driver.findElement(By.xpath("//div[@name='company']//input[@class='search']")).sendKeys("UK Company");
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'UK Company')]"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'UK Company')]")).click();
		driver.findElement(By.xpath("//button[@class='ui small fluid positive toggle button']")).click();

		// Enter email Address
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ui right corner labeled input']//input[@name='value']"))
				.sendKeys(firstName + "@Testmail.com");
		driver.findElement(By.xpath("//div[@class='three fields']//input[@name='name']")).sendKeys("@Business Email");
		driver.findElement(
				By.xpath("//div[@class='field']//div[@class='field']//div[@class='field']//div//i[@class='add icon']"))
				.click();

		// Select timezone from dropdown
		driver.findElement(By.xpath("//div[@name='timezone']//input[@class='search']")).sendKeys("GMT");
		action.moveToElement(driver.findElement(By.xpath("//div[@name='timezone']//input[@class='search']"))).build()
				.perform();
		driver.findElement(By.xpath("//span[contains(text(),'GMT')]")).click();

		// Enter Address
		driver.findElement(By.xpath("//input[@placeholder='Street Address']"))
				.sendKeys(generateRandomInt() + " " + firstName + " Street");
		driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys(randomCity());
		driver.findElement(By.xpath("//input[@placeholder='State / County']")).sendKeys(randomCity());
		driver.findElement(By.xpath("//input[@placeholder='Zip Code']")).sendKeys(randomPostcode());
		// Select Country
		driver.findElement(By.xpath("//div[@name='country']")).click();
		// List<WebElement> countryList =
		// driver.findElements(By.xpath("//div[@role='listbox' and @class='visible menu
		// transition']//div//span"));
		// div[@role='listbox' and @class='visible menu
		// transition']//div//span[contains(text(),'United Kingdom')]

		// System.out.println(countryList.size());

		driver.findElement(By.xpath(
				"//div[@role='listbox' and @class='visible menu transition']//div//span[contains(text(),'United Kingdom')]"))
				.click();

		// for (int i = 0; i < countryList.size(); i++) {
		// System.out.println(countryList.get(i).getText());
		// if (countryList.get(i).getText().contains("United Kingdom")) {
		// countryList.get(i).click();
		// break;
		// }
		// }

		// Select Phone Country
		driver.findElement(By.xpath("//div[contains(text(),'United States')]")).click();
		List<WebElement> phoneCountryList = driver
				.findElements(By.xpath("//div[@class='visible menu transition']//div//span"));

		// System.out.println(phoneCountryList.size());

		for (int i = 0; i < phoneCountryList.size(); i++) {
			// System.out.println(phoneCountryList.get(i).getText());
			if (phoneCountryList.get(i).getText().contains("United Kingdom")) {
				phoneCountryList.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@placeholder='Number']")).sendKeys(generateRandomMobileNumber());
		driver.findElement(By.xpath("//div[@class='four fields']//i[@class='add icon']")).click();

		/*
		 * // Select Do No Text Radio button WebElement isDoNotTextSelected =
		 * driver.findElement(By.xpath("//input[@name='do_not_text']"));
		 * scrollIntoView(isDoNotTextSelected, driver); Thread.sleep(2000);
		 * System.out.println("Before drawing border"); drawBorder(isDoNotTextSelected,
		 * driver); Thread.sleep(2000); // div[@class='ui checked toggle checkbox']
		 * 
		 * 
		 * System.out.println(isDoNotTextSelected.isEnabled());
		 * System.out.println(isDoNotTextSelected.isSelected()); //
		 * isDoNotTextSelected.click();
		 * System.out.println(isDoNotTextSelected.isSelected());
		 */
		// Select Status
		driver.findElement(By.xpath("//div[@name='status']")).click();
		List<WebElement> statusList = driver
				.findElements(By.xpath("//div[@class='visible menu transition']//div//span"));

		System.out.println(statusList.size());

		for (int i = 0; i < statusList.size(); i++) {
			System.out.println(statusList.get(i).getText());
			if (statusList.get(i).getText().contains("New")) {
				statusList.get(i).click();
				break;
			}
		}

		// Select Source
		driver.findElement(By.xpath("//div[@name='source']")).click();
		List<WebElement> sourceList = driver
				.findElements(By.xpath("//div[@class='visible menu transition']//div//span"));

		System.out.println(sourceList.size());

		for (int i = 0; i < sourceList.size(); i++) {
			System.out.println(sourceList.get(i).getText());
			if (sourceList.get(i).getText().contains("Google")) {
				sourceList.get(i).click();
				break;
			}
		}

		// Enter Birthday
		driver.findElement(By.xpath("//input[@placeholder='Day']")).sendKeys("24");

		driver.findElement(By.xpath("//div[@name='month']")).click();
		List<WebElement> monthList = driver
				.findElements(By.xpath("//div[@class='visible menu transition']//div//span"));

		System.out.println(monthList.size());

		for (int i = 0; i < monthList.size(); i++) {
			System.out.println(monthList.get(i).getText());
			if (monthList.get(i).getText().contains("March")) {
				monthList.get(i).click();
				break;
			}
		}

		driver.findElement(By.xpath("//input[@placeholder='Year']")).sendKeys("1981");

		// Save the Contact
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		System.out.println("Contact created and saved sucessfully");
		Thread.sleep(2000);

		// Click on contact
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		// *[@id="main-nav"]/a[3]
		Thread.sleep(3000); // Let the user actually see something!
		System.out.println("Clicked on Contact");

		// No. of Columns
		List col = driver.findElements(By.xpath(".//div[@class='ui fluid container main-content']/table/thead/tr/th"));
		System.out.println("Total No of columns are : " + col.size());
		// No.of rows
		List rows = driver
				.findElements(By.xpath(".//div[@class='ui fluid container main-content']/table/tbody/tr/td[1]"));
		System.out.println("Total No of rows are : " + rows.size());

		System.out.println(
				driver.findElement(By.xpath(".//div[@class='ui fluid container main-content']/table/thead")).getText());

		for (int i = 1; i <= rows.size(); i++) {
			String dynamicTableValue = driver
					.findElement(
							By.xpath("//.//div[@class='ui fluid container main-content']/table/tbody/tr[" + i + "]"))
					.getText();
			System.out.println(dynamicTableValue);
		}

		// *[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
		// *[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]
		// *[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]

		// *[@id="dashboard-toolbar"]/div[2]/div/button[2]

		// action.moveToElement(driver.findElement(By.xpath("//div[@class='ui basic
		// button floating item dropdown']"))).build().perform();
		// driver.findElement(By.cssSelector("//i[@class='save icon']")).click();

		// driver.quit();

	}

	public static String randomCity() throws Exception {
		String cityString[] = { "Bath", "Birmingham", "Bradford", "Brighton", "and", "Hove", "Bristol", "Cambridge",
				"Canterbury", "Carlisle", "Chester", "Chichester", "Coventry", "Derby", "Durham", "Exeter",
				"Gloucester", "Hereford", "Kingston", "Lancaster", "Leeds", "Leicester", "Lichfield", "Lincoln",
				"Liverpool", "City of London", "Manchester", "Newcastle upon Tyne", "Norwich", "Nottingham", "Oxford",
				"Peterborough", "Plymouth", "Portsmouth", "Preston", "Ripon", "Salford", "Salisbury", "Sheffield",
				"Southampton", "St Albans", "Stoke-on-Trent", "Sunderland", "Truro", "Wakefield", "Wells",
				"Westminster", "Winchester", "Wolverhampton", "Worcester", "York", "Hounslow", "Reading", "Chennai",
				"India" };
		int randomPosition;
		String randomCity = "";
		randomPosition = generateRandomInt();
		randomCity = randomCity + cityString[randomPosition];
		System.out.println(randomCity);
		return randomCity;
	}

	public static String randomPostcode() throws Exception {
		String cityString[] = { "DL150UT", "SW153AJ", "PE318DD", "BL69GY", "BH214BT", "DA37DA", "RM14XS", "CT48HH",
				"EX152DL", "CA27QN", "B146PG", "AB544HN", "DE61LR", "DN401NP", "TR115NW", "PO123BX", "BH235BB",
				"TR152NE", "HP189HG", "DG12PB", "SN160EZ", "DE119EE", "OL70EL", "FK159BT", "TN237XH", "IM61HH",
				"DN84JN", "KT130QE", "DT12NQ", "TR147EB", "MK58HB", "TS101RQ", "PR84BZ", "NG166JF", "PE218TT",
				"SW170GW", "DA175AZ", "CV93SX", "S817AH", "L239TJ", "PL207DD", "ME43PN", "CB109TE", "UB77EP", "AB217ED",
				"BD50AB", "PH74ET", "BT196LG", "PO91RW", "LS118QE", "SO413QE", "FK159BT", "PO123BX", "RM14XS" };
		int randomPosition;
		String randomPostcode = "";
		randomPosition = generateRandomInt();
		randomPostcode = randomPostcode + cityString[randomPosition];
		System.out.println(randomPostcode);
		return randomPostcode;
	}

	public static String randomString(int intValue) throws Exception {
		char c[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
				'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int randomPosition;
		String randomString = "";
		for (int i = 0; i < intValue; i++) {
			randomPosition = generateRandomInt();
			randomString = randomString + c[randomPosition];
		}
		System.out.println(randomString);
		return randomString;
	}

	private static int generateRandomInt() {
		// create instance of Random class
		Random rand = new Random();

		// Generate random integers in range 0 to 51
		int rand_int = rand.nextInt(51);

		// Print random integers
		// System.out.println("Random Integers: " + rand_int);
		return rand_int;
	}

	private static String generateRandomMobileNumber() {
		// create instance of Random class
		Random rand = new Random();

		// 9 digits
		// Generate random integers in range 0 to 999999999
		int rand_int = rand.nextInt(999999999);
		String randomMobileNumber = "7";
		if (rand_int > 100000000) {
			randomMobileNumber = randomMobileNumber + rand_int;
		} else {
			rand_int = rand_int + 100000000;
			randomMobileNumber = randomMobileNumber + rand_int;
			System.out.println("Mobile number was short");
		}
		// Print random integers
		System.out.println("Random Mobile Number: " + randomMobileNumber);
		return randomMobileNumber;
	}

	private static void drawBorder(WebElement element, WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
		Thread.sleep(1000);

	}

	private static void scrollIntoView(WebElement elementToView, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true)", elementToView);

	}
}
