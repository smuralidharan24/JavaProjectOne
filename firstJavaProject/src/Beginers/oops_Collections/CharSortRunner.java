package Beginers.oops_Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class CharSortRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F', 'Z', 'X');

		System.out.println("Original input" + characters);

		Set<Character> sortedOrder = new LinkedHashSet<>(characters);
		System.out.println("Input Order" + sortedOrder);

		Set<Character> enteredOrder = new TreeSet<>(characters);
		System.out.println("Sorted Order" + enteredOrder);

		Set<Character> hasSetOrder = new HashSet<>(characters);
		System.out.println("HashSet order" + hasSetOrder);

		TreeSet<Integer> numbers = new TreeSet<>(Set.of(10, 20, 30, 35, 40, 41, 45, 50, 60, 70, 80, 90));
		System.out.println(numbers.floor(40));
		System.out.println(numbers.lower(40));
		System.out.println(numbers.ceiling(40));
		System.out.println(numbers.higher(40));
		System.out.println(numbers.subSet(20, 40));
		System.out.println(numbers.subSet(20, true, 40, true));
		System.out.println(numbers.subSet(20, false, 40, false));
		System.out.println(numbers.headSet(40));
		System.out.println(numbers.tailSet(40));

		Queue<String> q = new PriorityQueue<>();
		q.addAll(List.of("Apple", "Ball", "Dog", "Cat", "Zebra", "Monkey"));
		System.out.println(q.poll());

	}

}
