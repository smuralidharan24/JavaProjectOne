package Exceptionhandling;

public class Puzzel1 {

	public static void main(String[] args) {
		try {
			someOtherMethod();
			Thread.sleep(2000);
		} catch (InterruptedException inExp) { // if not the use try and catch to catch the exception
			inExp.printStackTrace();
		}

		someOtherMethod2();
	}

	private static void someOtherMethod() throws InterruptedException { // Either handle the exception as thorws in a
																		// method (Checked Exception)
		Thread.sleep(2000);

	}

	private static void someOtherMethod2() throws RuntimeException { // unchecked exception

	}
}
