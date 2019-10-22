package Beginers2;

public class WhileNumber {

	private int numberLimit;

	public WhileNumber(int numberLimit) {
		this.numberLimit = numberLimit;
	}

	public void printSquareUptoLimit() {
		int i = 1;
		int square = 0;
		System.out.println("The square number sequence:");
		while (square < numberLimit) {
			square = i * i;
			System.out.print(square + " ");
			i++;
		}

		System.out.println();
	}

	public void printCubesUptoLimt() {
		int i = 1;
		System.out.println("The cube number sequence:");
		while (i * i * i < numberLimit) {
			System.out.print(i * i * i + " ");
			i++;
		}

		System.out.println();

	}

}
