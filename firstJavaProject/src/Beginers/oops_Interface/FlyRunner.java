package Beginers.oops_Interface;

public class FlyRunner {

	public static void main(String[] args) {

		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };

		// flyingObjects[0].fly();
		// flyingObjects[1].fly();

		for (Flyable object : flyingObjects) {
			object.fly();
		}
	}

}
