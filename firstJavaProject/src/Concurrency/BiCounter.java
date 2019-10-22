package Concurrency;

public class BiCounter {

	private int i = 0;
	private int j = 0;

	synchronized public void incrementI() {// Only one thread can execute as its a synchorized operation. to solve this
											// we can use lock
		i++;
	}

	public int getI() {
		return i;
	}

	synchronized public void incrementJ() {
		j++;
	}

	public int getJ() {
		return j;
	}

}
