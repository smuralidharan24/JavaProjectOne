package Exceptionhandling;

import java.util.Scanner;

public class TrywithResourcesRunner {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) { // this option does not require a close in the finally as this
															// has AutoClose() by default

			int[] numbers = { 1, 2, 3, 4 };

			int number = numbers[5];

			System.out.println("Before Scanner Close");

			// if not called there might be resource or memory leakage

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("End");
	}

}
