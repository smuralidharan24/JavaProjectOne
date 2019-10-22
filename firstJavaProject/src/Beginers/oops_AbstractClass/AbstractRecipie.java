package Beginers.oops_AbstractClass;

public abstract class AbstractRecipie { // Abstract class

	public void execute() {
		getRead();
		doTheDish();
		cleanup();
	}

	protected abstract void cleanup(); // Abstract Method without any implementation

	protected abstract void doTheDish();

	protected abstract void getRead();

}
