package com.util;

//Java program for the above approach

import java.util.regex.*;

class GFG {

	// Function that checks if a string
	// contains uppercase, lowercase
	// special character & numeric value
	public static void isAllPresent(String str) {
		// ReGex to check if a string
		// contains uppercase, lowercase
		// special character & numeric value
//		String regex = "^(?=.*[a-z])(?=." + "*[A-Z])(?=.*\\d)" + "(?=.*[-+_!@#$%^&*., ?]).+$";

//		String regex = "^(?=.*[a-z]).+$";

		String regex = "^(?=.*[a-z]).+$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the string is empty
		// then print No
		if (str == null) {
			System.out.println("No");
			return;
		}

		// Find match between given string
		// & regular expression
		Matcher m = p.matcher(str);

		// Print Yes if string
		// matches ReGex
		if (m.matches())
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	// Driver Code
	public static void main(String args[]) {
		// Given string
		String str1 = "edu@123Ro";

		String str2 = "edu@Ro";
		String str3 = "edu@123Ro";

		// Function Call
		isAllPresent(str1);
		isAllPresent(str2);
		isAllPresent(str3);
		isAllPresent("royal");
		isAllPresent("12131");
		isAllPresent("ROYAL");
		isAllPresent("ax");

		isAllPresent("Zx");

	}
}
