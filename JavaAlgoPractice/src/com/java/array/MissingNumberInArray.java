package com.java.array;

import java.util.Arrays;

public class MissingNumberInArray {
	static int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 9, 8, 11};

	void findMissing(int numbers[]) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		int length = numbers.length;
		int expectedSum = (length + 1) * (length + 2) / 2;

		int missing = Math.abs(expectedSum - sum);

		System.out.println("the missing numbers is: " + missing);

	}

	public static void main(String[] args) {
		MissingNumberInArray mn = new MissingNumberInArray();
		System.out.println(Arrays.toString(numbers));
		
		mn.findMissing(numbers);

	}

}
