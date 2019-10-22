package Beginers.oops_Level2;

public class Fan {

	// State
	private String make; // mandatory
	private double radius; // mandatory
	private String color; // mandatory

	private boolean isOn; // optional
	private byte speed; // 0 to 5 optional

	// creation of Object

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 5);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return String.format("Make - %s, Radius - %f, Color - %s, isOn - %b, Speed - %d", make, radius, color, isOn,
				speed);
	}
}
