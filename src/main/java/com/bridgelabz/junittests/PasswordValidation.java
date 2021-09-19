package com.bridgelabz.junittests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
	public boolean validatePassword(String Password) {

		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(Password);
		return matcher.matches();
	}
}
