package TipsDifferentPackage;

import Tips.ExampleClass;

public class MethodAccessRunnerInDifferentPackage {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.publicMethod();
		// exampleClass.protectMethod();
		// exampleClass.defaultMethod();

	}

}
