package com.bridgelabz.junittests;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidationTest {
	PasswordValidation password = new PasswordValidation();

	@Test
	public void GivenPasWithPassword_WhenMinimum8CharactersAndOneUpperCaseLetterAndOneNumericValue_shouldReturnTrue() {

		boolean validationStatus = password.validatePassword("MeghaAngadi1203");
		Assert.assertEquals(true, validationStatus);
	}

	@Test
	public void GivenPasWithPassword_WhenLessThen8CharactersWithNoUpperCaseLetterNoNumber_shouldReturnFalse() {

		boolean validationStatus = password.validatePassword("megha");
		Assert.assertEquals(false, validationStatus);
	}

	@Test
	public void GivenPasWithPassword_WhenLessThen8Characters_shouldReturnFalse() {

		boolean validationStatus = password.validatePassword("Megha12");
		Assert.assertEquals(false, validationStatus);
	}

	@Test
	public void GivenPasWithPassword_whenMinimum8CharactersWithSpecialCharacter_shouldReturnFalse() {

		boolean validationStatus = password.validatePassword("1megha@#");
		Assert.assertEquals(false, validationStatus);
	}

	@Test
	public void GivenPasWithPassword_whenLessThen8CharactersWithNoUpperCaseLetterWithSpecialCharacter_shouldReturnFalse() {

		boolean validationStatus = password.validatePassword("megh@#");
		Assert.assertEquals(false, validationStatus);
	}
}