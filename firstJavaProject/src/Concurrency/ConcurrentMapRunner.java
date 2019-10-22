package Concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		// Map<Character, LongAdder> occurances = new Hashtable<>();
		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();

		String str = "This is very complex";

		for (char character : str.toCharArray()) {// Atomic operation
			occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
		}

		/*
		 * for (char character : str.toCharArray()) { LongAdder longAdder =
		 * occurances.get(character); if (longAdder == null) { longAdder = new
		 * LongAdder(); } longAdder.increment(); occurances.put(character, longAdder); }
		 */

		System.out.println(occurances);
	}

}
