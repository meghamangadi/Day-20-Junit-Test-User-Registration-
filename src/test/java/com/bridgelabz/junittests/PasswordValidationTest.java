package com.bridgelabz.junittests;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidationTest {
	PasswordValidation password = new PasswordValidation();

	@Test
	public void GivenPasWithPassword_WhenMinimum8CharactersAndOneUpperCaseLetterAndOneNumericValueAndCharacter_shouldReturnTrue() {

		boolean validationStatus = password.validatePassword("Meghaangadi@1203");
		Assert.assertEquals(true, validationStatus);
	}

	@Test
	public void GivenPasWithPassword_When8CharactersWithNoUpperCaseLetterNoNumberNocharacter_shouldReturnFalse() {

		boolean validationStatus = password.validatePassword("meghaangadi");
		Assert.assertEquals(false, validationStatus);
	}

	@Test
	public void GivenPasWithPassword_WhenLessThen8Characters_shouldReturnFalse() {

		boolean validationStatus = password.validatePassword("Megha@1");
		Assert.assertEquals(false, validationStatus);
	}

	@Test
	public void GivenPasWithPassword_whenMinimum8CharactersWithNoSpecialCharacter_shouldReturnFalse() {

		boolean validationStatus = password.validatePassword("Megha1203");
		Assert.assertEquals(false, validationStatus);
	}

	@Test
	public void GivenPasWithPassword_when8CharactersWithNoUpperCaseLetteNoNumberWithSpecialCharacter_shouldReturnFalse() {

		boolean validationStatus = password.validatePassword("meghaangadi@#");
		Assert.assertEquals(false, validationStatus);
	}
}