package Beginers.oops_Interface;

abstract class Animal { // Abstract class

	public void execute() {
		bark();
	}

	protected abstract void bark(); // Abstract Method without any implementation

}

class Dog extends Animal {

	@Override
	protected void bark() {
		System.out.println("Bow Bow");

	}

}

class Cat extends Animal {

	@Override
	protected void bark() {
		System.out.println("Meow Meow");

	}

}

public class AnnimalRunner {

	public static void main(String[] args) {

		Animal[] animals = { new Dog(), new Cat() };

		for (Animal animal : animals) {
			animal.bark();
		}
	}

}
