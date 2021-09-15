package com.bridgelabz.junittests;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

	UserValidation validation = new UserValidation();

	@Test
	public void GivenLastName_When3CharacterWith1stUpperCaseLetter_shouldReturnTrue() {

		boolean actualResult = validation.lastName("Megha");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void GivenLastName_WhennAllLettersUpperCase_shouldReturnfalses() {

		boolean actualResult = validation.lastName("MEGHA");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void GivenLastName_When3CharacterWith2stUpperCaseLetter_shouldReturnfalse() {

		boolean actualResult = validation.lastName("MeghA");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void GivenLastName_When3CharacterWithnumericNumber_shouldReturnfalse() {

		boolean actualResult = validation.lastName("Megha13");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void GivenLastName_When3CharacterWithout1stUpperCaseLetter_shouldReturnfalse() {

		boolean actualResult = validation.lastName("megha");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void GivenLastName_When3CharacterWithnumericNumberSpecialCharacter_shouldReturnfalse() {

		boolean actualResult = validation.lastName("Megha#1303");
		Assert.assertEquals(false, actualResult);
	}
}
