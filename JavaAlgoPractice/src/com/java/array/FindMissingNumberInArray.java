package com.java.array;

import java.util.Arrays;

public class FindMissingNumberInArray {

	static int[] numbers = { 1, 2, 3, 4, 6, 5, 7, 8, 9, 10, 11, 12, 13, 15 };

	void findMissing(int list[]) {
		int length = list.length;
		int expectedsum = (length + 1) * (length + 2) / 2;

		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum += list[i];
		}
		int missing = (expectedsum - sum);
		System.out.println(Math.abs(missing));

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(numbers));
		FindMissingNumberInArray mn = new FindMissingNumberInArray();
		mn.findMissing(numbers);

	}

}
