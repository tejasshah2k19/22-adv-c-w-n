package com.elfunction;

import java.util.Date;

public class GreetFunction {

	public static String greet() {
		Date d = new Date();
		if (d.getHours() >= 0 && d.getHours() <= 11) {
			return "<h2>Good Morning</h2>";
		} else if (d.getHours() >= 12 && d.getHours() <= 15) {
			return "<h2>Good Noon</h2>";
		} else {
			return "<h2>Good Evening</h2>";
		}
	}

}
