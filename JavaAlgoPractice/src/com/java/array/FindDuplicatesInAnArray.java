package com.java.array;

import java.util.Arrays;

public class FindDuplicatesInAnArray {

	static int[] numbers = { 1, 2, 3, 4, 5, 6, 8, 9, 9, 10, 10 };

	void findDuplicate(int numbers[]) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == (numbers[j])) {
					int duplicate = numbers[i];

					System.out.println("The duplicate interger is: " + duplicate);

				}

			}
		}

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(numbers));
		FindDuplicatesInAnArray fd = new FindDuplicatesInAnArray();
		fd.findDuplicate(numbers);

	}
}