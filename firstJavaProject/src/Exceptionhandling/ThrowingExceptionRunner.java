package Exceptionhandling;

import Exceptionhandling.Amount.CurrenciesDoNotMatchException;

class Amount {
	private String Currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		Currency = currency;
		this.amount = amount;
	}

	public void add(Amount other) throws CurrenciesDoNotMatchException { // Checked exception
		if (!this.Currency.equals(other.Currency)) {
			// throw new Exception("Currencies Do Not Match " + this.Currency + " & " +
			// other.Currency);
			throw new CurrenciesDoNotMatchException(
					"Currencies Do Not Match " + this.Currency + " & " + other.Currency);
		}
		this.amount = this.amount + other.amount;
	}

	class CurrenciesDoNotMatchException extends Exception {
		public CurrenciesDoNotMatchException(String message) {
			super(message);
		}
	}

	@Override
	public String toString() {
		return amount + " " + Currency;
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws CurrenciesDoNotMatchException {// Checked exception
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);

	}

}
