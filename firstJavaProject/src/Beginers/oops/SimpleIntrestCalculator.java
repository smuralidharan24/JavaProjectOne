package Beginers.oops;

import java.math.BigDecimal;

public class SimpleIntrestCalculator {

	private BigDecimal principal;
	private BigDecimal interest;

	public SimpleIntrestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int duration) {
		BigDecimal totalValue;
		BigDecimal durationAsBigDecimal = new BigDecimal(duration);
		// totalValue =
		// this.principal.add((this.principal).multiply(this.interest).multiply(durationAsBigDecimal));
		totalValue = this.principal.add((this.principal).multiply(this.interest).multiply(new BigDecimal(duration)));
		return totalValue;
	}

	public BigDecimal getPrincipal() {
		return principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public BigDecimal getInterest() {
		return interest;
	}

}
