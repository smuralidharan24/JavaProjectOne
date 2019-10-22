package Beginers.oops_Level2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Polar", 3.5, "white");

		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);

	}

}
