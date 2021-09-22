package com.userreg;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void firstname_valid() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateFirstName("Panchami");
			Assert.assertTrue(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Test should pass because we are checking invalid first name that doesn't have
	 * atleast 3 characters
	 */
	@Test
	public void firstname_short() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateFirstName("Pa");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Test should pass because we are checking invalid first name that doesn't
	 * start with capital letter
	 * 
	 */
	@Test
	public void firstname_withoutcapitalcharacter() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateFirstName("panchami");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	/**
	 * This test case should pass if we provide a valid last name
	 */
	@Test
	public void lastname_valid() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateLastName("Shenoy");
			Assert.assertTrue(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Test should pass because we are checking invalid last name that doesn't have
	 * atleast 3 characters
	 */
	@Test
	public void lastname_short() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateLastName("Sh");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Test should pass because we are checking invalid last name that doesn't start
	 * with capital letter
	 */
	@Test
	public void lastname_withoutcapitalcharacter() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validateLastName("shenoy");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Test case pass if valid phone number is given
	 */
	@Test
	public void phone_valid() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validatePhoneNumber("91 9110689660");
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
			result = user.validatePhoneNumber("91 91106896");
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
			result = user.validatePhoneNumber("91 0110689660");
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
			result = user.validateEmail("panchamishenoy16@gmail.com");
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
			result = user.validateEmail("panchami.com");
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
			result = user.validatePassword("P1@abcdefhg");
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
			result = user.validatePassword("p1@abcdefgh");
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
			result = user.validatePassword("P@abcdefghi");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Test case will pass as we are checking for invalid password without special
	 * character
	 */
	@Test
	public void password_withoutspecialchar() {
		UserRegistration user = new UserRegistration();
		boolean result;
		try {
			result = user.validatePassword("Pabcdefgh1");
			Assert.assertFalse(result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
