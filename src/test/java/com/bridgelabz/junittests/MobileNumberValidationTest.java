package com.bridgelabz.junittests;

import org.junit.Assert;
import org.junit.Test;

public class MobileNumberValidationTest {
	MobileNumberValidation mobileNumber = new MobileNumberValidation();

	@Test
	public void GivenMobileNo_WhenWithCountryCodeAnd10Digits_shouldReturnTrue() {

		boolean validationStatus = mobileNumber.validateMobileNumber("91 9901203381");
		Assert.assertEquals(true, validationStatus);
	}

	@Test
	public void GivenMobileNo_WhenWithoutCountryCodeAnd10Digits_shouldReturnFalse() {

		boolean validationStatus = mobileNumber.validateMobileNumber("9901203381");
		Assert.assertEquals(false, validationStatus);
	}

	@Test
	public void GivenMobileNo_WhenWithoutCountryCodeAndLessThen10Digits_shouldReturnFalse() {

		boolean validationStatus = mobileNumber.validateMobileNumber("99012033");
		Assert.assertEquals(false, validationStatus);
	}

	@Test
	public void GivenMobileNo_WhenWithCountryCodeAnd10DigitsWithoutSpace_shouldReturnFalse() {

		boolean validationStatus = mobileNumber.validateMobileNumber("919901203381");
		Assert.assertEquals(false, validationStatus);
	}

	@Test
	public void GivenMobileNo_WhenWithCountryCodeAnd10DigitsWithCharacters_shouldReturnFalse() {

		boolean validationStatus = mobileNumber.validateMobileNumber("91 990120M338A1");
		Assert.assertEquals(false, validationStatus);
	}

}
