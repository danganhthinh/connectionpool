package com.topica.edu.vn.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortListJava {
	public static void main(String[] args) {
		// List<Movie> movies = Arrays.asList(new Movie(8.8, "Lord of the rings"), new
		// Movie(8.5, "Back to the future"),
		// new Movie(7.9, "Carlito's way"), new Movie(8.9, "Pulp fiction"));

		List<Movie> movies = Arrays.asList(new Movie(8.8, "Lord of the rings", true),
				new Movie(8.5, "Back to the future", false), new Movie(7.9, "Carlito's way", true),
				new Movie(8.9, "Pulp fiction", false));

		movies.sort(Comparator.comparingDouble(Movie::getRating).reversed());

		movies.forEach(System.out::println);

		movies.sort(new Comparator<Movie>() {
			@Override
			public int compare(Movie m1, Movie m2) {
				if (m1.isStarred() == m2.isStarred()) {
					return 0;
				}
				return m1.isStarred() ? -1 : 1;
			}
		});

		movies.forEach(System.out::println);

		movies.sort(Comparator.comparing(Movie::isStarred).reversed()
				.thenComparing(Comparator.comparing(Movie::getRating).reversed()));

		movies.forEach(System.out::println);
		
		List<Movie> filteed = 
				movies
				.stream()
				.filter(p -> p.getName().startsWith("L"))
				.collect(Collectors.toList());
		
		System.out.println(filteed);

	}
}
