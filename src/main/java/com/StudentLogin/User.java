package com.StudentLogin;

public class User {
	
	private String userName,Password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
//constructors
	public User(String userName, String password) {
		super();
		this.userName = userName;
		Password = password;
	}

	
	
}
