package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	// Upper Bound wild cards
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	// Lower Bound wild cards
	static void addCoupleOfNumbers(List<? super Number> numbers) {
		numbers.add(5);
		numbers.add(5l);
		numbers.add(5.5);
		numbers.add(5.5f);
	}

	public static void main(String[] args) {

		List empltyList = new ArrayList<Number>();
		addCoupleOfNumbers(empltyList);
		System.out.print("addCoupleOfNumbers" + empltyList);
		System.out.println("");

		System.out.println("sumOfNumberList-" + sumOfNumberList(List.of(2, 4, 6, 8, 10)));
		System.out.println("sumOfNumberList-" + sumOfNumberList(List.of(2.2, 4.2, 6.2, 8.2, 10.2)));
		System.out.println("sumOfNumberList-" + sumOfNumberList(List.of(2l, 4l, 6l, 8l, 10l)));

		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		duplicate(numbers);

		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		String value = list.get(0);

		System.out.println(list);
		System.out.println("Value - " + value);

		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(10));
		Integer number = list2.get(1);

		System.out.println(list2);
		System.out.println("Number - " + number);
		System.out.println("Duplicate Number - " + numbers);

	}

}
