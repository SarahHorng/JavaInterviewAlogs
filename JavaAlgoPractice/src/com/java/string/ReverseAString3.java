package com.java.string;

import java.util.Scanner;

public class ReverseAString3 {

	public static void main(String[] args) {
		System.out.println("Please enter in a String to reverse: ");
		
		Scanner scan = new Scanner(System.in);
		String orig = scan.nextLine();
				
		char[] array = new char[orig.length()];
	    for(int i=array.length - 1, j = 0; i >= 0; i--, j++) {
	        array[i] = orig.charAt(j);
	    }
		
		System.out.println(new String(array));
	}
}