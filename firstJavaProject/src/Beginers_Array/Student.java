package Beginers_Array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	// private int[] markList;
	private ArrayList<Integer> markList = new ArrayList<Integer>();

	public Student(String name, int... markList) {
		this.name = name;
		// this.markList = markList;

		for (int mark : markList) {
			this.markList.add(mark);
		}
		// System.out.println("Student Name is " + name);
		// System.out.println(Arrays.toString(markList));
	}

	public int getNumberOfMarks() {

		// return markList.length;
		return markList.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : markList) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(markList);
	}

	/*
	 * public int getMaximumMark() { int maximumMark = 0; // for (int i = 0; i <
	 * markList.length; i++) for (int mark : markList) { if (maximumMark < mark) {
	 * maximumMark = mark; } } return maximumMark; }
	 */

	public int getMinimumMark() {
		return Collections.min(markList);
	}
	/*
	 * public int getMinimumMark() { int minimumMark = Integer.MAX_VALUE; // for
	 * (int i = 0; i < markList.length; i++) { for (int mark : markList) { if
	 * (minimumMark > mark) { minimumMark = mark; } } return minimumMark; }
	 */

	public BigDecimal getAveragemark() {
		int number = getNumberOfMarks();
		int sum = getTotalSumOfMarks();
		BigDecimal average;
		average = new BigDecimal(sum).divide(new BigDecimal(number), 2, RoundingMode.UP);
		return average;
	}

	@Override
	public String toString() {
		return name + markList;
	}

	public void addNewmark(int addMark) {
		markList.add(addMark);

	}

	public void removeMarkAtIndex(int removeMarkIndex) {
		markList.remove(removeMarkIndex);

	}
}
