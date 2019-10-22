package Beginers.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100); // MotorBike is a class and Ducati is instance and is called an object
		MotorBike honda = new MotorBike(200); // MotorBike is a class and Honda is instance and is called an object

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		ducati.startBike("Ducati");

		honda.startBike("Honda");

		ducati.setSpeed(100);
		System.out.println(ducati.getSpeed()); // state change happens through methods that are exposed

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		ducati.decreaseSpeed(250);
		honda.decreaseSpeed(150);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		// honda.setSpeed(80);
		// System.out.println(honda.getSpeed());
	}

}
