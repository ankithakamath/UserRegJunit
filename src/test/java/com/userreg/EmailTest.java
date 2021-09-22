package com.userreg;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.Assert;

@RunWith(Parameterized.class)
public class EmailTest {

	private String email;
	private boolean expectedResult;
	private UserRegistration user;

	public EmailTest(String email, boolean expectedResult) {
		super();
		this.email = email;
		this.expectedResult = expectedResult;

	}

	@Before
	public void initialise() {
		user = new UserRegistration();
	}

	/**
	 * @return Collections that contains all the email
	 */
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc.@gmail.com ", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false },
				{ "abc@gmail.com.aa.au", false } });
	}

	/**
	 * Tests user email from collection of email
	 */
	@Test
	public void emailtesting_withparameterized_approach() {
		Assert.assertEquals(expectedResult, user.validateEmail(email));
	}

}