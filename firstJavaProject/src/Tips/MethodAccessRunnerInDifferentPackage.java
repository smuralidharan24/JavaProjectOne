package Tips;

public class MethodAccessRunnerInDifferentPackage {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.publicMethod();
		exampleClass.protectMethod();
		// exampleClass.privateMethod(); //Private will be accessible only in same class
		exampleClass.defaultMethod();

	}

}
