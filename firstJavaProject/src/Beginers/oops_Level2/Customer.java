package Beginers.oops_Level2;

public class Customer {

	// State
	private String name;
	private Address homeAddress;// Address class
	private Address corresAddress;

	// Creating a Customer object
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	// Operations
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getCorresAddress() {
		return corresAddress;
	}

	public void setCorresAddress(Address corresAddress) {
		this.corresAddress = corresAddress;
	}

	@Override
	public String toString() {
		return String.format("Name of the Customer - [%s] Home Address - [%s] Correspondance Adress - [%s]", name,
				homeAddress, corresAddress);
	}
}
