package Functional_Programming;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferenceRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		// 1. Storing functions in variables
		// 2. Passing functions to methods
		// 3. Returning functions from methods

		List.of("Apple", "Bannana", "Bat", "Cat", "Dog").stream().map(s -> s.length())
				.forEach(s -> System.out.println(s));

		List.of("Apple", "Bannana", "Bat", "Cat", "Dog").stream().map(s -> s.length()).forEach(System.out::println);

		List.of("Apple", "Bannana", "Bat", "Cat", "Dog").stream().map(String::length)
				.forEach(MethodReferenceRunner::print);

		Predicate<? super Integer> evenPredicate = createEvenPredicate(); // 1. Storing functions in variables

		Integer max = List.of(2, 4, 8, 12, 24, 48).stream().filter(evenPredicate) // 2. Passing functions to methods
				.max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);

		// Integer max = List.of(2, 4, 8, 12, 24,
		// 48).stream().filter(MethodReferenceRunner::isEven).max(Integer::compare)
		// .orElse(0);
		System.out.println("Max value - " + max);
	}

	private static Predicate<? super Integer> createEvenPredicate() { // 3. Returning functions from methods
		return e -> e % 2 == 0;
	}

}
