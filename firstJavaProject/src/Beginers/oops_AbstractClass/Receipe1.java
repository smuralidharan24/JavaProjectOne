package Beginers.oops_AbstractClass;

public class Receipe1 extends AbstractRecipie { // Abstract extended to sub-class

	@Override
	protected void getRead() { // Method defined with implementation
		System.out.println("get Ready");

	}

	@Override
	protected void doTheDish() {// Method defined with implementation
		System.out.println("do the dish");

	}

	@Override
	protected void cleanup() {// Method defined with implementation
		System.out.println("Clean up");
	}

}
