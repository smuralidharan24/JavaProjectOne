package Beginers.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(200);
		cleanCode.setNoOfCopies(300);

		artOfComputerProgramming.author();
		effectiveJava.author();
		cleanCode.author();
	}

}
