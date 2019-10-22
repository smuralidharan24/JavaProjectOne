package Beginers3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class PrintCube {

	public static void main(String[] args) {
		String str = "Murali is a good boy";
		LocalDateTime today = LocalDateTime.now();
		// today.g

		System.out.println(today);
		Scanner scanner = new Scanner(System.in);
		int inputNumber = -1;
		int cube = 0;
		do {
			if (inputNumber != -1) {
				System.out.printf("Cube of %d is %d", inputNumber, cube).println();
			}
			System.out.println("Enter a positive number to get cube or -ve number to exit:");
			inputNumber = scanner.nextInt();
			cube = inputNumber * inputNumber * inputNumber;
		} while (inputNumber > 0);
		System.out.println("THE END");
	}
}
