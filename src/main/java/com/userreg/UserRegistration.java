package com.userreg;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistration{
	String name = "^[A-Z][a-z]{2}[a-z]*";
	String phone = "[1-9][0-9]\\s[1-9][0-9]{9}";

	String email = "^[a-zA-Z+_]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}+\\.?[a-zA-Z-_]*";

	String password = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}";

	IValidateUserDetail validateFirstName = (firstName) -> Pattern.matches(name, firstName);
	IValidateUserDetail validateLastName = (lastName) -> Pattern.matches(name, lastName);
	IValidateUserDetail validatePhone = (phone1) -> Pattern.matches(phone, phone1);
	IValidateUserDetail validateEmail = (email1) -> Pattern.matches(email, email1);
	IValidateUserDetail validatePassword = (password1) -> Pattern.matches(password, password1);

	/**
	 * method to validate first name
	 * 
	 * @param firstName - firstname to validate
	 * @return result-true or false
	 * @throws InvalidUserDetailException
	 */
	public boolean validateFirstName(String firstName) throws InvalidUserException {

		boolean result = validateFirstName.validateUserDetail(firstName);
		if (result) {
			return true;
		} else {
			throw new InvalidUserException("Invalid First name");
		}
	}

	/**
	 * method to validate second name
	 * 
	 * @param secondName - secondName to validate
	 * @return result-true or false
	 * @throws InvalidUserDetailException
	 */
	public boolean validateLastName(String lastName) throws InvalidUserException {
		boolean result = validateLastName.validateUserDetail(lastName);
		if (result) {
			return true;
		} else {
			throw new InvalidUserException("Invalid last name");
		}
	}

	/**
	 * method to validate phone number
	 * 
	 * @param phoneNumber - phone number to validate
	 * @return result-true or false
	 * @throws InvalidUserDetailException
	 */
	public boolean validatePhoneNumber(String phoneNumber) throws InvalidUserException {
		boolean result = validatePhone.validateUserDetail(phoneNumber);
		if (result) {
			return true;
		} else {
			throw new InvalidUserException("Invalid phone number");
		}
	}

	/**
	 * method to validate email
	 * 
	 * @param email-email to validate
	 * @return result-true or false
	 * @throws InvalidUserDetailException
	 */
	public boolean validateEmail(String email1) throws InvalidUserException {
		boolean result = validateEmail.validateUserDetail(email1);
		if (result) {
			return true;
		} else {
			throw new InvalidUserException("Invalid email");
		}

	}

	/**
	 * method to validate password
	 * 
	 * @param password -password to validate
	 * @return result-true or false
	 * @throws InvalidUserDetailException
	 */
	public boolean validatePassword(String password1) throws InvalidUserException {
		boolean result = validatePassword.validateUserDetail(password1);
		if (result) {
			return true;
		} else {
			throw new InvalidUserException("Invalid First name");
		}
	}

}
