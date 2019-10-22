package MultiThreading;

//extends Thread
class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("\n Task1 Started\n");
		for (int i = 101; i <= 200; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n Task1 Done\n");
	}
}
// implements Runnable

class Task2 implements Runnable {
	@Override
	public void run() {
		System.out.println("\n Task2 Started\n");
		for (int i = 201; i <= 300; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n Task2 Done\n");
	}
}

public class TheadBasicRunner {

	public static void main(String[] args) throws InterruptedException {

		// Task1
		Task1 task1 = new Task1(); // Task1 is NEW at this point
		task1.setPriority(1);
		task1.start(); // Task1 is at this RUNNABLE then it moves to RUNNABLE and then it can get into
						// BLOCKED/WAITING
		// Task1 is NEW at this TERMINATED/DEAD

		// Task2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		// Wait for Task1 is complete
		task2Thread.join();

		// Wait for Task1 is complete
		task1.join();

		// Task3
		System.out.println("\n Task3 Started\n");
		for (int i = 301; i <= 400; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n Task3 Done\n");
	}

}
