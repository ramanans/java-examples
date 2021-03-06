package com.dasanjos.java.math;

public class Fibonacci {

	private static int[] table = new int[100];

	/**
	 * Calculates Fibonacci number recursively - complexity: O(2^n)
	 */
	public static int recursive(int n) {
		if (n <= 1) {
			return n;
		} else {
			return recursive(n - 1) + recursive(n - 2);
		}
	}

	/**
	 * Calculates Fibonacci number dynamically - complexity: O(n)
	 */
	public static int dynamic(int n) {
		if (n <= 1) {
			return n;
		} else if (table[n] != 0) {
			return table[n];
		} else {
			return table[n] = dynamic(n - 1) + dynamic(n - 2);
		}
	}

	/**
	 * Calculates the average of n first Fibonacci numbers - complexity: O(n)
	 */
	public static double average(int n) {
		return sum(n) / n;
	}

	/**
	 * Calculates the sum of n first Fibonacci numbers - Complexity: O(n)
	 */
	public static long sum(int n) {
		long sum = 0;
		long fibNr = 1;
		long fibOne = 0;
		long fibTwo = 1;

		for (int i = 1; i <= n; i++) {
			sum += fibNr;
			fibNr = fibOne + fibTwo;
			fibOne = fibTwo;
			fibTwo = fibNr;
		}
		return sum;
	}
}
