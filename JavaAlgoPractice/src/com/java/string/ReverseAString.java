package com.java.string;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		System.out.println("Enter in String to Reverse: ");
		Scanner scan = new Scanner(System.in);

		String original = scan.nextLine();
		String rev = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			rev = rev + original.charAt(i);
		}
		System.out.println("Reversed String: " + rev);
	}

}
