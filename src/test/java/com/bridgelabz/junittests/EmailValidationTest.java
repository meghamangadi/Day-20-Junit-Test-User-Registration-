package com.bridgelabz.junittests;

import org.junit.Assert;
import org.junit.Test;

public class EmailValidationTest {
	EmailValidation validation = new EmailValidation();

	@Test
	public void GivenEmail_WhengivenwithproperlettersSpecialcharacter_AtProperPlaces_shouldReturnTrue() {

		boolean validationStatus = validation.email("meghamangadi@gmail.com");
		Assert.assertEquals(true, validationStatus);
	}

	@Test
	public void GivenEmail_WhengivenwithUpperletters_AtProperPlaces_shouldReturnfalse() {

		boolean validationStatus = validation.email("Meghamangadi@gmail.com");
		Assert.assertEquals(false, validationStatus);
	}

	@Test
	public void GivenEmail_WhengivenwithUpperletters_nospecialcharacter_AtProperPlaces_shouldReturnfalse() {

		boolean validationStatus = validation.email("Meghamangadi1203gmail.com");
		Assert.assertEquals(false, validationStatus);
	}
	
	@Test
	public void GivenEmail_WhengivenwithMoreThanOnespecialcharacter___shouldReturnfalse() {

		boolean validationStatus = validation.email("meghamangadi@#$!1203gmail.com");
		Assert.assertEquals(false, validationStatus);
	}
	
	@Test
	public void GivenEmail_WhengivenwithTwoDots__shouldReturnfalse() {

		boolean validationStatus = validation.email("megha.mangadi1203gmail.com");
		Assert.assertEquals(false, validationStatus);
	}
}
