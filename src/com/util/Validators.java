package com.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validators {

	public static void allMixUsingPatternMatcher() {
		String str = "roya1l e2du 143s363s5";

		Pattern p = Pattern.compile("\\d+"); // metacharacters

		// (\\d)+("-")(\\d\\d\\d)(\\w)(\\W)

		Matcher m = p.matcher(str);
		System.out.println(str);
		while (m.find()) {
			System.out.println(m.start() + " => " + m.group());
		}

	}

	public static boolean isAlpha(String str) {

		return str.matches("[a-zA-Z]+");

		// [qeiou]
		// [abc] [a-c]
	}

	public static boolean isDigit(String str) {

		return str.matches("[0-9]+");

		// [qeiou]
		// [abc] [a-c]
	}

	// XXXXX@XXXX.XXX
	// ^([a-zA-Z0-9])+@([a-zA-Z])+\.([a-zA-Z])+{2,3}$

	// A a 9 @ [8length]

	public static int strength(String str) {
		int count = 0;

		if (str.matches("[a-z]")) {
			count++;
		}

		if (str.matches("[A-Z]")) {
			count++;
		}

		if (str.matches("[0-9]")) {
			count++;
		}

		if (str.matches("[#$%^*@]")) {
			count++;
		}

		return count;

	}

	public static boolean isValidPassword(String pwd) {

		Pattern p = Pattern.compile("^(?=.*[a-z])(?=.\"*[A-Z])+$");
		Matcher m = p.matcher(pwd);

		return m.matches();

//		return pwd.matches("(?=.*[a-z])");

	}

	public static void main(String[] args) {
//		System.out.println(Validators.isAlpha("royal"));// + ? * .
//		System.out.println(Validators.isAlpha("royal1"));// +* 0 N
//		System.out.println(Validators.isAlpha("1royal"));
//		System.out.println(Validators.isAlpha("Royal"));
//		System.out.println(Validators.isAlpha("roy al"));
//		System.out.println(Validators.isAlpha("r"));
//		allMixUsingPatternMatcher();
//		main(null);
		System.out.println(isValidPassword("aAasdsd"));
	}
}
