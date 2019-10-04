package com.java.array;

import java.util.Arrays;

public class SortArrayOfRandomNumbers {

	static int[] numbers = new int[10];

	void randomArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			numbers[i] = (int) (Math.random() * 20 + 1);
		}

	}

	void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 6, 5, 7, 8, 9, 10, 11, 12, 13, 15};
		SortArrayOfRandomNumbers sa = new SortArrayOfRandomNumbers();
		sa.randomArray(numbers);
		System.out.println("Random Array");
		System.out.println(Arrays.toString(numbers));
		sa.bubbleSort(numbers);
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(numbers));

	}

}
