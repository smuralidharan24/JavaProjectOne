package Beginers.oops_Level2;

public class Review {

	private String reviewId;
	private String reviewDescription;
	private int rating;

	public Review(String reviewId, String reviewDescription, int rating) {
		super();
		this.reviewId = reviewId;
		this.reviewDescription = reviewDescription;
		this.rating = rating;
	}

	public String getReviewId() {
		return reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewDescription() {
		return reviewDescription;
	}

	public void setReviewDescription(String reviewDescription) {
		this.reviewDescription = reviewDescription;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return String.format("#######Review ID - [%s], Review Description - [%s], Rating - [%d]########", reviewId,
				reviewDescription, rating);
	}

}
