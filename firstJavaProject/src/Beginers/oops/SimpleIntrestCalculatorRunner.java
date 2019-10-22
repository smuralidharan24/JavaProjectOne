package Beginers.oops;

import java.math.BigDecimal;

public class SimpleIntrestCalculatorRunner {

	public static void main(String[] args) {

		SimpleIntrestCalculator calculator = new SimpleIntrestCalculator("4500.00", "7.5");

		BigDecimal totalValue = calculator.calculateTotalValue(5);

		System.out.printf("The principal amount = %s", calculator.getPrincipal()).println();
		System.out.printf("The interest percentage = %s", calculator.getInterest()).println();
		// System.out.printf("The number of years = %s", duration);
		System.out.printf("The Total amount payable = %s", totalValue);
	}

}
