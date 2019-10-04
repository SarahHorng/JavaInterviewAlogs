package com.java.array;

public class PairSumEqualToNumber {

	static void pairSums(int array[], int sum) {
		System.out.println("Pairs of Numbers and their Sums");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == sum) {
					System.out.println(array[i] + "+" + array[j] + "=" + sum);
				}

			}
		}

	}

	public static void main(String[] args) {
		pairSums(new int[] { 1, 2, 3, 5, 6, 7, 19, 12, -2 }, 10);
		pairSums(new int[] { 5, 2, 7, 10, 6, 7, 19, 21, -6 }, 13);
	}

}
