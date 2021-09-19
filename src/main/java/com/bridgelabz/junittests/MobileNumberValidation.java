package com.bridgelabz.junittests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {
	public boolean validateMobileNumber(String MobileNumber) {

		String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(MobileNumber);
		return matcher.matches();
	}
}
