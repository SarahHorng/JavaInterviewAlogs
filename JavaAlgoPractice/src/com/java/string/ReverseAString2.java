package com.java.string;

import java.util.Scanner;

public class ReverseAString2 {

	public static void main(String[] args) {
		System.out.println("Please enter in a String to reverse: ");
		
		Scanner scan = new Scanner(System.in);
		String orig = scan.nextLine();
				
		char[] string = orig.toCharArray();
		int n = string.length;
		int halfLength = n / 2;
		for (int i = 0; i < halfLength; i++) {
			char temp = string[i];
			string[i] = string[n - 1 - i];
			string[n - 1 - i] = temp;
			System.out.println(new String(string));
		}
		
	}

	
}