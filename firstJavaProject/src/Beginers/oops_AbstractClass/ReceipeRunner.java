package Beginers.oops_AbstractClass;

public class ReceipeRunner {

	public static void main(String[] args) {

		Receipe1 receipe1 = new Receipe1();// Instance1 created for Abstract class
		receipe1.execute();
		// boolean result = receipe1 instanceof AbstractRecipie;
		// System.out.println(result);
		Receipe2 receipe2 = new Receipe2();// Instance2 created for Abstract class
		receipe2.execute();

		// boolean result = receipe2 instanceof AbstractRecipie;
		// System.out.println(result);

	}

}
