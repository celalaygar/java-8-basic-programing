package com.example.UsageSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UsingSet {

	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

		// To find union
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		// [0, 1, 2, 3, 4, 5, 7, 8, 9]
		System.out.println(union);

		// To find intersection
		Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		// [0, 1, 3, 4]
		System.out.println(intersection);

		// To find the symmetric difference
		Set<Integer> difference = new HashSet<Integer>(a);
		difference.removeAll(b);
		// [2, 8, 9]
		System.out.println(difference);
	}

}
