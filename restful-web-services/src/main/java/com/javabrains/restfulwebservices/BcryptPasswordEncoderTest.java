package com.javabrains.restfulwebservices;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptPasswordEncoderTest {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder bCryptPasswordEncoder = new  BCryptPasswordEncoder();
		String encodedpassword = bCryptPasswordEncoder.encode("pawar");
		System.out.println(encodedpassword);

	}

}
