package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.print("\nTask " + number + " Started\n");
		for (int i = number * 100; i <= number * 100 + 100; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n Task " + number + " Done\n");
	}

}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));

		// executorService.execute(new Thread(new Task2()));

		/*
		 * Task3 System.out.println("\n Task3 Started\n"); for (int i = 301; i <= 400;
		 * i++) { System.out.print(i + " "); } System.out.println("\n Task3 Done\n");
		 * executorService.shutdown(); }
		 */

		executorService.shutdown();
	}
}
