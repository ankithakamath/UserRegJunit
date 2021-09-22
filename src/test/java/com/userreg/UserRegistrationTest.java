package com.userreg;

import org.junit.Assert;
import org.junit.Test;

import com.userreg.UserRegistration;

public class UserRegistrationTest {
	/*
	 * Checking for first name that is valid
	 */
	@Test
	public void firstname_valid() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateFirstName("Ankitha");
		Assert.assertTrue(result);
	}

	/**
	 * Checking for less than three letters
	 */
	@Test
	public void firstname_incomplete() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateFirstName("ak");
		Assert.assertFalse(result);
	}

	/**
	 * Checking for first name with a lower case starting alphabet
	 */
	@Test
	public void firstname_withoutLowerCase() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateFirstName("ankitha");
		Assert.assertFalse(result);
	}

	/**
	 * Checking for valid Last name
	 */
	@Test
	public void lastname_valid() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateLastName("Kamath");
		Assert.assertTrue(result);
	}

	/**
	 * checking for minimum three characters
	 */
	@Test
	public void lastname_Incomplete() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateLastName("Ak");
		Assert.assertFalse(result);
	}

	/**
	 * Checking for last name with lower case starting letter
	 */
	@Test
	public void lastname_withoutUpperzCase() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateLastName("kamath");
		Assert.assertFalse(result);
	}

	/**
	 * checking if valid phone number is given
	 */
	@Test
	public void phone_valid() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("91 9741788898");
		Assert.assertTrue(result);
	}

	/**
	 * Checking for incomplete phone numbers
	 */
	@Test
	public void phone_Incomplete() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("91 97417");
		Assert.assertFalse(result);
	}

	/**
	 * Checking for phone numbers beginning with 0
	 */
	@Test
	public void phone_Invalid() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhoneNumber("91 0974178889");
		Assert.assertFalse(result);
	}

	/**
	 * Checking for valid mail id
	 */
	@Test
	public void email_valid() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateEmail("Kamathankitha76@gmail.com");
		Assert.assertTrue(result);
	}

	/**
	 * Invalid email id check
	 */
	@Test
	public void email_invalid() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateEmail("Ankitha@.com");
		Assert.assertFalse(result);
	}

	/**
	 * Valid password check
	 */
	@Test
	public void password_valid() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("Abcdeg/6");
		Assert.assertTrue(result);
	}

	/**
	 * Checking for minimum one upper case letter
	 */
	@Test
	public void password_withoutUpperCase() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("abcde/g6");
		Assert.assertFalse(result);
	}

	/**
	 * Checking for minimum one numeric
	 */
	@Test
	public void password_withoutNumeric() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("abcde/Gf");
		Assert.assertFalse(result);
	}

	/**
	 * Checking for minimum one special character
	 */
	@Test
	public void password_withoutspecialcharacter() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("abcdedG6");
		Assert.assertFalse(result);
	}

}