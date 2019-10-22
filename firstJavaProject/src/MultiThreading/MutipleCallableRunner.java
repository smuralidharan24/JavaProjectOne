package MultiThreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MutipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(4);

		List<CallableTask> tasks = List.of(new CallableTask("Murali"), new CallableTask("Shantha"),
				new CallableTask("Pranav"), new CallableTask("Shakthi"));

		/*
		 * //Waits for all the thread to complete List<Future<String>> results =
		 * executorService.invokeAll(tasks); for (Future<String> result : results) {
		 * System.out.println(result.get()); }
		 */

		// the execution completes when one of the thread is competed
		String result = executorService.invokeAny(tasks);
		System.out.println(result);

		System.out.println("\nMain completed");

		executorService.shutdown();

	}

}
