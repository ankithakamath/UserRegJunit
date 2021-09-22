package com.userreg;

import java.util.regex.Pattern;

public class UserRegistration {
	String name = "^[A-Z][a-z]{2}[a-z]*";

	String phone = "[1-9][0-9]\\s[1-9][0-9]{9}";

	String email = "^[a-zA-Z+_]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}+\\.?[a-zA-Z-_]*";

	String password = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+/=]).{8,}";

	public boolean validateFirstName(String firstname) {

		return Pattern.matches(name, firstname);
	}

	public boolean validateLastName(String lastname) {
		return Pattern.matches(name, lastname);
	}

	public boolean validatePhoneNumber(String phoneNumber) {
		return Pattern.matches(phone, phoneNumber);
	}

	public boolean validateEmail(String email1) {
		return Pattern.matches(email, email1);

	}

	public boolean validatePassword(String password1) {
		return Pattern.matches(password, password1);
	}

}