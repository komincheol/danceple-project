package kr.co.dbinv.eddy;

public class Movie {

	private String title;
	private String genre;
	private int rating;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	void playIt() {
		
		System.out.println("Playing the movie");
		
	}
}


