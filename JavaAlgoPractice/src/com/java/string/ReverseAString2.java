package com.java.string;

import java.util.Scanner;

public class ReverseAString2 {

	public static void main(String[] args) {

		System.out.println("Please enter a String: ");
		Scanner scan = new Scanner(System.in);
		String orig = scan.nextLine();

		char[] string = orig.toCharArray();
		int length= string.length;
		int halflength = length / 2;

		for (int i = 0; i <= halflength; i++) {
			char temp = string[i];
			string[i] = string[length - 1 - i ];
			string[length - i - 1] = temp;
			
		}
		System.out.println(string);
	}

}
