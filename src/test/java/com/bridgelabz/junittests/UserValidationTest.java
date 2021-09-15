package com.bridgelabz.junittests;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

	UserValidation validation = new UserValidation();

	@Test
	public void GivenFirstName_When3CharacterWith1stUpperCaseLetter_shouldReturnTrue() {

		boolean actualResult = validation.firstName("Megha");
		Assert.assertEquals(true, actualResult);
	}
	
	@Test
	public void GivenFirstName_WhennAllLettersUpperCase_shouldReturnfalses() {

		boolean actualResult = validation.firstName("MEGHA");
		Assert.assertEquals(false, actualResult);
	}
	
	@Test
	public void GivenFirstName_When3CharacterWith2stUpperCaseLetter_shouldReturnfalse() {

		boolean actualResult = validation.firstName("MeghA");
		Assert.assertEquals(false, actualResult);
	}
	
	@Test
	public void GivenFirstName_When3CharacterWithnumericNumber_shouldReturnfalse() {

		boolean actualResult = validation.firstName("Megha13");
		Assert.assertEquals(false, actualResult);
	}
	
	@Test
	public void GivenFirstName_When3CharacterWithout1stUpperCaseLetter_shouldReturnfalse() {

		boolean actualResult = validation.firstName("megha");
		Assert.assertEquals(false, actualResult);
	}
	
	@Test
	public void GivenFirstName_When3CharacterWithnumericNumberSpecialCharacter_shouldReturnfalse() {

		boolean actualResult = validation.firstName("Megha#1303");
		Assert.assertEquals(false, actualResult);
	}
}
