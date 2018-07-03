package com.topica.edu.vn.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(10, "apple");
		map.put(20, "orange");
		map.put(30, "banana");
		map.put(40, "watermelon");
		map.put(50, "dragonfruit");

		List<Integer> resultSortedKey = new ArrayList<>();
		List<String> resultValues = map.entrySet().stream()
				.sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
				.peek(e -> resultSortedKey.add(e.getKey())).map(x -> x.getValue())
				.filter(x -> !"banana".equalsIgnoreCase(x)).collect(Collectors.toList());

		resultSortedKey.forEach(System.out::println);
		resultValues.forEach(System.out::println);
	}
}