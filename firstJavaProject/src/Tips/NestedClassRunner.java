package Tips;

class Person {

}

public class NestedClassRunner { // Example of nested class

	class InnerClass { // if without static then its called as InnerClass

	}

	static class StaticNestedClass { // if the class has a static then its called StaticNestedClass

	}

	public static void main(String[] args) {
		// InnerClass innerClass = new InnerClass();

		NestedClassRunner nestedClassRunner = new NestedClassRunner(); // Need to explicitly create this main class
																		// instance to access InccerClass that does not
																		// have static
		InnerClass innerClass = nestedClassRunner.new InnerClass();

		StaticNestedClass staticNestedClass = new StaticNestedClass();

	}

}
