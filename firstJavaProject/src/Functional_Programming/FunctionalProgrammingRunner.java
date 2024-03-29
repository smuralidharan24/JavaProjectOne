package Functional_Programming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bannana", "Bat", "Cat", "Dog");

		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 50, 40, 30, 20, 18, 15, 10, 15, 20, 30, 40);

		// printBasic(list);
		// printBasicWithFilter(list);
		// printWithFunctionalProgrammingWithFilter(list);
		// printWithFunctionalProgramming(list);
		printOddNumber(numbers);
		printEvenNumber(numbers);
		printSumOfNumber(numbers);
		printSumOfOddNumber(numbers);
		printSumOfEvenNumber(numbers);
		// printSumOfNumber1(numbers);
		printSortNumber(numbers);
		printDistinctNumber(numbers);
		printMapNumber(numbers);
		IntStream.range(1, 11).map(e -> e * e)
				.forEach(element -> System.out.println("Square of first 10 number - " + element));
		// printSquareOfFirst10Number(numbers);
		printLowerCaseString(list);
		printLengthOfString(list);
		printMaxOfNumber(numbers);
		printMinOfNumber(numbers);
		IntStream.range(1, 11).map(e -> e * e).boxed().collect(Collectors.toList());
		// System.out.println("Square of first 10 number - " + square);

	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printBasicWithFilter(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}

	private static void printWithFunctionalProgramming(List<String> list) {
		list.stream().forEach(element -> System.out.println(element)); // Lambda expression
	}

	private static void printWithFunctionalProgrammingWithFilter(List<String> list) {
		list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
	}

	private static void printOddNumber(List<Integer> numbers) {
		numbers.stream().filter(element -> element % 2 == 1).forEach(element -> System.out.println("Odd - " + element));
	}

	private static void printEvenNumber(List<Integer> numbers) {
		numbers.stream().filter(element -> element % 2 == 0)
				.forEach(element -> System.out.println("Even - " + element));
	}

	private static void printSumOfNumber(List<Integer> numbers) {
		int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
		System.out.println("Sum - " + sum);
	}

	private static void printSumOfNumber1(List<Integer> numbers) {
		int sum = numbers.stream().reduce(0, (number1, number2) -> { // You can write multiple operations within
																		// parenthesis
			System.out.println(number1 + " " + number2);
			return number1 + number2;
		});
		System.out.println("Sum - " + sum);
	}

	private static void printSumOfOddNumber(List<Integer> numbers) {
		int sumOfOdd = numbers.stream().filter(element -> element % 2 == 1).reduce(0,
				(number1, number2) -> number1 + number2);
		System.out.println("Sum of Odd - " + sumOfOdd);
	}

	private static void printSumOfEvenNumber(List<Integer> numbers) {
		int sumOfEven = numbers.stream().filter(element -> element % 2 == 0).reduce(0,
				(number1, number2) -> number1 + number2);
		System.out.println("Sum of Even - " + sumOfEven);
	}

	private static void printSortNumber(List<Integer> numbers) {
		numbers.stream().sorted().forEach(element -> System.out.println("Sorted value - " + element));
	}

	private static void printDistinctNumber(List<Integer> numbers) {
		numbers.stream().distinct().sorted().forEach(element -> System.out.println("Distinct value - " + element));
	}

	private static void printMapNumber(List<Integer> numbers) {
		numbers.stream().distinct().sorted().map(element -> element * element)
				.forEach(element -> System.out.println("Square value - " + element));
	}

	private static void printLowerCaseString(List<String> list) {
		list.stream().map(element -> element.toLowerCase()).forEach(element -> System.out.println(element));
	}

	private static void printLengthOfString(List<String> list) {
		list.stream().map(element -> element.length())
				.forEach(element -> System.out.println("Length of String -" + element));
	}

	private static void printMaxOfNumber(List<Integer> numbers) {
		int max = numbers.stream().max((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println("Max - " + max);
	}

	private static void printMinOfNumber(List<Integer> numbers) {
		int min = numbers.stream().min((n1, n2) -> Integer.compare(n1, n2)).orElse(0);
		System.out.println("Min - " + min);
	}

	private static void collectorOfOddNumber(List<Integer> numbers) {
		numbers.stream().filter(element -> element % 2 == 1).collect(Collectors.toList());
	}

	private static void collectorOfEvenNumber(List<Integer> numbers) {
		numbers.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());
	}
}
