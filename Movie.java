package com.topica.edu.vn.java8;

public class Movie {
	public double rating;
	public String name;
	private boolean starred;

	public Movie(double rating, String name, boolean starred) {
		super();
		this.rating = rating;
		this.name = name;
		this.starred = starred;
	}

	public boolean isStarred() {
		return starred;
	}

	public void setStarred(boolean starred) {
		this.starred = starred;
	}

	public Movie(double rating, String name) {
		this.rating = rating;
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
