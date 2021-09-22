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
		boolean result;
		try {
			result = user.validateFirstName("Ankitha");
			Assert.assertTrue(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Checking for less than three letters
	 */
	@Test
	public void firstname_incomplete() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateFirstName("ak");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	/**
	 * Checking for first name with a lower case starting alphabet
	 */
	@Test
	public void firstname_withoutLowerCase() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateFirstName("ankitha");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Checking for valid Last name
	 */
	@Test
	public void lastname_valid() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateLastName("kamath");
			Assert.assertTrue(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	/**
	 * checking for minimum three characters
	 */
	@Test
	public void lastname_Incomplete() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateLastName("ak");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		}
	/**
	 * Checking for last name with lower case starting letter
	 */
	@Test
	public void lastname_withoutUpperzCase() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateLastName("kamath");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	/**
	 * checking if valid phone number is given
	 */
	@Test
	public void phone_valid() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validatePhoneNumber("91 9741788898");
			Assert.assertTrue(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Checking for incomplete phone numbers
	 */
	@Test
	public void phone_Incomplete() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validatePhoneNumber("91 97417");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Checking for phone numbers beginning with 0
	 */
	@Test
	public void phone_Invalid() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validatePhoneNumber("91 0974178889");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}	}

	/**
	 * Checking for valid mail id
	 */
	@Test
	public void email_valid() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateEmail("ankithakamath75@gmail.com");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Invalid email id check
	 */
	@Test
	public void email_invalid() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validatePassword("ankitha@.com");
			Assert.assertTrue(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Valid password check
	 */
	@Test
	public void password_valid() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validatePassword("abcdefG/1");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Checking for minimum one upper case letter
	 */
	@Test
	public void password_withoutUpperCase() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validatePassword("abcdefg/1");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Checking for minimum one numeric
	 */
	@Test
	public void password_withoutNumeric() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validatePassword("abcdefG/");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
	

	/**
	 * Checking for minimum one special character
	 */
	@Test
	public void password_withoutspecialcharacter() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validatePassword("abcdefG1");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}