package com.TDD_Demo;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class ValidateEmail {
	
	EmailValidator email=new EmailValidator();
	
	@Test
	public void validate(String email) {
		String validemail="test@gmail.com";
		if(email.contains("@@")) {
			System.out.println("Invalid email...");
		}
	}
	
	@Test
	public void invalidEmail() {
		
	}
	public void validEmailWithoutValidEmail() {
		
	}
	public void lengthOutOfRange() {
		
	}

}
