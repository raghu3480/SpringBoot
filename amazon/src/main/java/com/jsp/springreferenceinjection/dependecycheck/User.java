package com.jsp.springreferenceinjection.dependecycheck;

import org.springframework.beans.factory.annotation.Required;

public class User {
	
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	
	@Required// by defauly the required annotation will be disable and make it enable by passing the RequiredAnnaotationPost processor by passing fully qualifiedname
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
