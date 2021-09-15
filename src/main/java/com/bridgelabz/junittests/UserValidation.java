package com.bridgelabz.junittests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

	public boolean firstName(String firstName) {

		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}
}