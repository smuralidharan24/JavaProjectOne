package Tips;

class Client {
	private int id;

	public Client(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		Client other = (Client) that;
		if (id != other.id) {
			return false;
		}
		return true;
	}

}

public class EqualsRunner {

	public static void main(String[] args) {
		Client c1 = new Client(1); // even though the value is same does not means both the objects are equal. the
									// default object compares if the object are same but if you need to check the
									// value then generate the equals methods explicitly as a object
		Client c2 = new Client(1);
		Client c3 = new Client(3);

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));

	}

}
