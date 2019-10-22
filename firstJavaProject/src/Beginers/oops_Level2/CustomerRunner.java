package Beginers.oops_Level2;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("10 Littlemoss close", "Audenshaw", "Manchester", "M34 5US");
		Customer customer = new Customer("Murali", homeAddress);
		System.out.println(customer);

		Address corresAddress = new Address("7 Scott court", "Central way", "Warrington", "WA2 7TB");
		customer.setCorresAddress(corresAddress);

		System.out.println(customer);
	}

}
