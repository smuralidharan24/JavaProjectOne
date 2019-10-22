package Beginers.oops_Level2;

public class Address {

	// Object Composition
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String postcode;

	// Constructor
	public Address(String addressLine1, String addressLine2, String city, String postcode) {
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return addressLine1 + "|" + addressLine2 + "|" + city + "|" + postcode;
	}

}
