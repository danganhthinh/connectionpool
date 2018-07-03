package com.topica.edu.vn.java8;

import java.util.ArrayList;
import java.util.List;

public class ParallraleStream {
	public static void main(String[] args) {
		List<Integer> listInt = new ArrayList<Integer>();
		int total1 = 0;

		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			listInt.add(i);
			total1 += i;
		}
		long end1 = System.currentTimeMillis();
		System.out.println(total1);

		long t1 = end1 - start1;
		System.out.println(t1);

		long start2 = System.currentTimeMillis();
		Integer total2 = listInt.parallelStream().reduce(0, Integer::sum);
		long end2 = System.currentTimeMillis();

		long t2 = end2 - start2;
		System.out.println(t2);
		System.out.println(total2);
	}
}
