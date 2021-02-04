package com.jsp.springreferenceinjection.dependecycheck;

import org.springframework.beans.factory.annotation.Required;

public class User {
	
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	
	@Required
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
	
	

}
