package Beginers.oops;

public class MotorBike {
	// State
	private int speed; // member variable. This is the state of the object

	MotorBike() {// No argument constructor
		this(9);// this is calling other constructor
	}

	// Constructors
	MotorBike(int speed) { // This is a constructor using the Class name as the name
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

//These methods are created to either provide information or change the state
//There methods are called the behaviour of the object
	public void setSpeed(int speed) {
		// this.speed = speed;
		// System.out.println(speed);
		// System.out.println(this.speed);
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	void startBike(String bikeName) {
		System.out.printf("%s Bike Started", bikeName).println();
	}
}
