package Beginers_Array;

import java.math.BigDecimal;

public class StudentClassRunner {

	public static void main(String[] args) {
		// int[] markList = { 75, 80, 85, 90, 95, 100 };

		Student student = new Student("Murali", 75, 80, 85, 90, 95, 100);
		// Student student1 = new Student("Shantha", 95, 98, 99, 91, 95);

		// System.out.println("Student Name is Murali");
		int number = student.getNumberOfMarks();
		System.out.println("Number of sub = " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of marks = " + sum);
		int maximumMark = student.getMaximumMark();
		System.out.println("Maximun marks = " + maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum marks = " + minimumMark);
		BigDecimal average = student.getAveragemark();
		System.out.println("Average mark = " + average);

		System.out.println("Original input mark " + student);

		student.addNewmark(78);

		System.out.println("Mark after adding into array" + student);

		student.removeMarkAtIndex(1);

		System.out.println("Mark after removing at specific index" + student);

		/*
		 * System.out.println("Student Name is Shantha"); int number1 =
		 * student1.getNumberOfMarks(); System.out.println("Number of sub = " +
		 * number1); int sum1 = student1.getTotalSumOfMarks();
		 * System.out.println("Sum of marks = " + sum1); int maximumMark1 =
		 * student1.getMaximumMark(); System.out.println("Maximun marks = " +
		 * maximumMark1); int minimumMark1 = student1.getMinimumMark();
		 * System.out.println("Minimum marks = " + minimumMark1); BigDecimal average1 =
		 * student1.getAveragemark(); System.out.println("Average mark = " + average1);
		 */
	}

}
