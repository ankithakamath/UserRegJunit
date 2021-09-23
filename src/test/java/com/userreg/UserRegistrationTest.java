package com.userreg;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
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
	 * Checking for first name
	 */
	@Test
	public void firstname_Incomplete() {
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
	*Checking for upper case
	 */
	@Test
	public void firstname_withoutUpperCase() {
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
	 * Checking for valid Lastname
	 */
	@Test
	public void lastname_valid() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateLastName("Kamath");
			Assert.assertTrue(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	/**
	 Checking for incomplete last name 
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
	Checking for Upper case
	 */
	@Test
	public void lastname_withoutcapitalcharacter() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateLastName("ankitha");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	/**
	 * checking for valid phone number is given
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
	 * Test should pass because we are checking invalid phone number that doesn't
	 * have all 10 digits
	 */
	@Test
	public void phone_short() {
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
	 * Test should pass because we are checking invalid phone number that starts
	 * with zero
	 */
	@Test
	public void phone_beginswithzero() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validatePhoneNumber("91 0974178889");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Test case will pass if given a valid email
	 */
	@Test
	public void email_valid() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateEmail("Kamathankitha76@gmail.com");
			Assert.assertTrue(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Test case will pass because we are checking for invalid email
	 */
	@Test
	public void email_invalid() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateEmail("ankitha@.com");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Test case will pass if a valid password is given
	 */
	@Test
	public void password_valid() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validatePassword("abcdefG/1");
			Assert.assertTrue(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Test case will pass as we are checking for invalid password without capital
	 * letter
	 */
	@Test
	public void password_withoutcapitalletter() {
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
	 * Test case will pass as we are checking for invalid password without digit
	 */
	@Test
	public void password_withoutdigit() {
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
	 * Test case will pass as we are checking for invalid password without special
	
	 */
	@Test
	public void password_withoutspecialchar() {
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
