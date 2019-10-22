package Concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();

		list.add("Apple");
		list.add("Bat");
		list.add("Cat");
		list.add("Dog");

		for (String str : list) {
			System.out.println(str);
		}

	}

}
