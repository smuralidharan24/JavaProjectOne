package Beginers.oops_Level2;

import java.util.ArrayList;

public class Book {

	private String bookID;
	private String bookName;
	private String author;
	private ArrayList<Review> review = new ArrayList<>();

	public Book(String bookID, String bookName, String author) {
		this.bookID = bookID;
		this.bookName = bookName;
		this.author = author;
	}

	public void addReview(Review review) {
		this.review.add(review);
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return String.format("Book ID - [%S], Book Name - [%s], Author - [%s] Review - ", bookID, bookName, author)
				+ review;
	}

}
