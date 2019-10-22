package Beginers_Array;

public class WeekdayArray {

	public static void main(String[] args) {

		String[] weekdayList = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int length = weekdayList.length;
		String maxStringName = "";
		for (int i = 0; i < length; i++) {

			if (maxStringName.length() < weekdayList[i].length()) {
				maxStringName = weekdayList[i];
			}
		}
		System.out.println("Day with most number of character is " + maxStringName);
		System.out.println();

		System.out.println("Days of the week in reverse");

		for (int i = length - 1; i >= 0; i--) {
			System.out.println(weekdayList[i]);
		}
	}

}
