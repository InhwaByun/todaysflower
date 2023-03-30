package com.todaysflower.sign;

public interface SignService {
	SignUpResultDto signUp(String id, String password, String name, String role);
	
	SignInResultDto signIn(String id, String password) throws RuntimeException;
}