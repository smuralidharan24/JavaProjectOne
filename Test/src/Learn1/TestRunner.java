package Learn1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Random;

public class TestRunner {

	public static void main(String[] args) throws Exception {
		LocalDate today = LocalDate.now();
		LocalDateTime now = LocalDateTime.now();

		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("java.specification.version"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(Calendar.getInstance().DAY_OF_MONTH);

		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		System.out.println(System.getenv());

		System.out.println(now);
		Thread.sleep(2000);
		System.out.println(today.now());
		Thread.sleep(2000);
		System.out.println(now.toLocalTime());
		Thread.sleep(2000);
		System.out.println(now.toLocalTime());

		today.getYear();
		System.out.println(today.getYear());
		System.out.println(Calendar.getInstance());

		Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(Calendar.getInstance().get(Calendar.YEAR));

		generateRandomInt();
		int intValue = 10;
		randomString(intValue);
		generateRandomMobileNumber();

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
		System.out.println("Random Integers: " + rand_int);
		return rand_int;
	}

	private static String generateRandomMobileNumber() {
		// create instance of Random class
		Random rand = new Random();

		// Generate random integers in range 0 to 999999999
		int rand_int = rand.nextInt(999999999);

		String randomMobileNumber = "07";
		randomMobileNumber = randomMobileNumber + rand_int;
		// Print random integers
		System.out.println("Random Integers: " + randomMobileNumber);
		return randomMobileNumber;
	}

}
