package com.bridgelabz.junittests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public boolean email(String email){

		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

