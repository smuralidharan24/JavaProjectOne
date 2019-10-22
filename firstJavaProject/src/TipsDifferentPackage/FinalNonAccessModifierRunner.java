package TipsDifferentPackage;

final class FinalClass {

}

//class SomeClass extends FinalClass { //final class cannot be extended
//}

class SomeClass {
	final public void doSomething() {
	}
}

class ExtendingClass extends SomeClass {
	@Override
	public void doSomething() {// final method cannot be extended
	}
}

public class FinalNonAccessModifierRunner {

	public static void main(String[] args) {
		final int i = 5;// this way of variable assignment will lead to immutable programming
		i = 10; // final variable cannot be changed

	}

}
