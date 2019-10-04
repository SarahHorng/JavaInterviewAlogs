package com.java.array;

import java.util.Arrays;

public class LargestAndSmallerstinUnsortedArray {

	static int[] numbers = new int[10];

	void randomArray(int[] list) {
		for (int i = 0; i < list.length; i++) {
			numbers[i] = (int) (Math.random() * 100 + 1);
		}
		System.out.println("Random Array: " + Arrays.toString(numbers));
	}

	void findMaxMin(int[] list) {
		int max = numbers[0];
		int min = numbers[0];
		for (int i = 0; i < list.length; i++) {
			if (numbers[i]>max){
				max= numbers[i];				
			}
			if (numbers[i]<min){
				min= numbers[i];				
			}
		}
		
		System.out.println("The max: " + max);
		System.out.println("The min: " + min);
	}

	public static void main(String[] args) {
		LargestAndSmallerstinUnsortedArray ls = new LargestAndSmallerstinUnsortedArray();
		ls.randomArray(numbers);
		ls.findMaxMin(numbers);

	}

}