package Tips;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassRunner {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>(List.of("Ant", "Battt", "Cat", "Dogg", "Elephant"));
		Collections.sort(animals, new Comparator<String>() { // this way of having a function without a name and using
																// it directly in the main is called Anonymous class
			@Override
			public int compare(String str1, String str2) {
				return Integer.compare(str1.length(), str2.length());
			}

		});
		System.out.println(animals);
	}

}
