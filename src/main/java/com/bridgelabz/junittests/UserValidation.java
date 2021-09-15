package com.bridgelabz.junittests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

	public boolean lastName(String lastName) {

		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}
	
	
}