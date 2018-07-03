package com.topica.edu.vn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
	public static void main(String[] args) {
		List<Integer> listInt = new ArrayList<>();
		listInt.add(1);
		listInt.add(5);
		listInt.add(2);
		listInt.add(6);
		listInt.add(8);
		listInt.add(3);

		for (Integer integer : listInt) {
			System.out.println(integer);
		}

		Collections.sort(listInt);

		for (Integer integer : listInt) {
			System.out.println(integer);
		}

		listInt.sort(Comparator.naturalOrder());

		for (Integer integer : listInt) {
			System.out.println(integer);
		}

		Integer[] array = { 9, 3, 6, 2, 4, 2, 32, 5, 7, 4, 2, 4, 6, 7, 5, 3, 2, 3, 5, 6, 12 };

		// sx tang dan 10 phan tu dau tien
		Arrays.parallelSort(array, 1, 10);
		// sx 10 phan tu cuoi cung theo thu tu giam dan
		Arrays.parallelSort(array, array.length - 10, array.length, Collections.reverseOrder());

	}

}
