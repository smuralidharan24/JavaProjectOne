package Beginers.oops_Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("A", 5, "B", 8, "Z", 10);
		System.out.println("Map" + map);
		Map<String, Integer> hashMap = new HashMap<>(map);
		hashMap.put("X", 12);
		System.out.println("HashMap" + hashMap);
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>(map);
		linkedHashMap.put("F", 20);
		System.out.println("LinkedHashMap" + linkedHashMap);
		Map<String, Integer> treeMap = new TreeMap<>(map);
		treeMap.put("M", 40);
		treeMap.put("N", 30);
		treeMap.put("P", 50);
		// treeMap).higherKey("B");
		System.out.println("TreeMap" + treeMap);
		System.out.println("TreeMap Functions - " + ((TreeMap<String, Integer>) treeMap).higherKey("B"));
		System.out.println("TreeMap Functions - " + ((TreeMap<String, Integer>) treeMap).ceilingKey("B"));
		System.out.println("TreeMap Functions - " + ((TreeMap<String, Integer>) treeMap).floorKey("B"));
		System.out.println("TreeMap Functions - " + ((TreeMap<String, Integer>) treeMap).firstEntry());
		System.out.println("TreeMap Functions - " + ((TreeMap<String, Integer>) treeMap).lastEntry());
		String str = "This is an awesome occasion. This has never happened before";
		Map<String, Integer> stringOccurance = new HashMap<>();
		String[] words = str.split(" ");

		for (String word : words) {
			Integer integer = stringOccurance.get(word);
			if (integer == null) {
				stringOccurance.put(word, 1);
			} else {
				stringOccurance.put(word, integer + 1);
			}

		}
		System.out.println(stringOccurance);

	}

}
