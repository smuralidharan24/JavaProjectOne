package Concurrency;

public class Counter {

	int i = 0;

	synchronized public void increment() { // this operation is not thread safe as it can be different at different
											// point when the thread
		i++; // so we need to add synchronized
	}

	public int getI() {
		return i;
	}

}
