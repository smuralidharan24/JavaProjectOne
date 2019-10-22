package Tips;

import java.util.Arrays;

enum Season {
	WINTER, SPRING, SUMMER, FALL;// Ordinal -0,1,2,3
}

enum Week { // by explicitly assigning a value, you can use it to store in database
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
	private int value;

	private Week(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}

public class EnumRunner {

	public static void main(String[] args) {
		Season fall = Season.FALL;
		System.out.println(fall);

		Season winter = Season.valueOf("WINTER");
		System.out.println(winter);
		System.out.println(winter.name());

		Season summer = Season.valueOf("SUMMER");
		System.out.println(summer.ordinal());

		System.out.println(Season.FALL.ordinal());
		System.out.println(Season.values());
		System.out.println(Arrays.toString(Season.values()));

		System.out.println(Week.SUNDAY);
		System.out.println(Week.SUNDAY.ordinal());
		System.out.println(Week.SUNDAY.getValue());
	}

}
