package Beginers.oops_AbstractClass;

public class Receipe2 extends AbstractRecipie {// Abstract extended to sub-class

	@Override
	protected void getRead() {// Method defined with implementation
		System.out.println("get Ready - Receipe2");

	}

	@Override
	protected void doTheDish() {// Method defined with implementation
		System.out.println("do the dish - Receipe2");

	}

	@Override
	protected void cleanup() {// Method defined with implementation
		System.out.println("Clean up - Receipe2");
	}

}
