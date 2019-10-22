package Beginers.oops_Level2;

public class BookReviewRunner {

	public static void main(String[] args) {

		Book book = new Book("IB1001", "Object oriented programmimg language", "Murali");

		book.addReview(new Review("R101", "Great Book", 5));
		book.addReview(new Review("R102", "Too good", 4));

		System.out.println(book);
		System.out.println();

	}

}
