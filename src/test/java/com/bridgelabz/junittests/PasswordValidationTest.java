package com.bridgelabz.junittests;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidationTest {
	PasswordValidation password = new PasswordValidation();

	@Test
	public void GivenPasWithPassword_WhenMinimum8CharactersAndOneUpperCaseLetter_shouldReturnTrue() {

		boolean validationStatus = password.validatePassword("MeghaAngadi");
		Assert.assertEquals(true, validationStatus);
	}

	@Test
	public void GivenPasWithPassword_WhenLessThen8CharactersWithNoUpperCaseLetter_shouldReturnFalse() {

		boolean validationStatus = password.validatePassword("meghaangadi");
		Assert.assertEquals(false, validationStatus);
	}

	@Test
	public void GivenPasWithPassword_WhenLessThen8Characters_shouldReturnFalse() {

		boolean validationStatus = password.validatePassword("Megha");
		Assert.assertEquals(false, validationStatus);
	}

	@Test
	public void GivenPasWithPassword_whenMinimum8CharactersWithSpecialCharacter_shouldReturnFalse() {

		boolean validationStatus = password.validatePassword("Megha@#");
		Assert.assertEquals(false, validationStatus);
	}

	@Test
	public void GivenPasWithPassword_whenLessThen8CharactersWithNoUpperCaseLetter_shouldReturnFalse() {

		boolean validationStatus = password.validatePassword("megha@#");
		Assert.assertEquals(false, validationStatus);
	}
}