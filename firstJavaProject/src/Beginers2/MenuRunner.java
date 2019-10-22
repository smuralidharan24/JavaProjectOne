package Beginers2;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number 1:");
		int number1 = scanner.nextInt();
		System.out.print("Enter Number 2:");
		int number2 = scanner.nextInt();

		System.out.println("The 1st number you entered is - " + number1);
		System.out.println("The 2nd number you entered is - " + number2);

		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		System.out.println("Choose Operation : ");
		int operationChoosen = scanner.nextInt();

		// performOperationUsingNestedIfElse(number1, number2, operationChoosen);
		switchCase(number1, number2, operationChoosen);
	}

	private static void performOperationUsingNestedIfElse(int number1, int number2, int operationChoosen) {
		if (operationChoosen == 1) {
			int addResult = number1 + number2;
			System.out.printf("The addition of %d + %d = %d", number1, number2, addResult);
		} else if (operationChoosen == 2) {
			int substractionResult = number1 - number2;
			System.out.printf("The addition of %d - %d = %d", number1, number2, substractionResult);
		} else if (operationChoosen == 3) {
			int divsionResult = number1 / number2;
			System.out.printf("The addition of %d / %d = %d", number1, number2, divsionResult);
		} else if (operationChoosen == 4) {
			int multiplyResult = number1 * number2;
			System.out.printf("The addition of %d * %d = %d", number1, number2, multiplyResult);
		} else {
			System.out.println("invalid operation");
		}
	}

	private static void switchCase(int number1, int number2, int operationChoosen) {
		switch (operationChoosen) {
		case 1:
			int addResult = number1 + number2;
			System.out.printf("The addition of %d + %d = %d", number1, number2, addResult);
			break;
		case 2:
			int substractionResult = number1 - number2;
			System.out.printf("The addition of %d - %d = %d", number1, number2, substractionResult);
			break;
		case 3:
			int divsionResult = number1 / number2;
			System.out.printf("The addition of %d / %d = %d", number1, number2, divsionResult);
			break;
		case 4:
			int multiplyResult = number1 * number2;
			System.out.printf("The addition of %d * %d = %d", number1, number2, multiplyResult);
			break;
		default:
			System.out.println("invalid operation");
			break;
		}
	}
}
