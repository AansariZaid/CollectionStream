package com.stackroute.activitystream.model;

import org.springframework.stereotype.Component;

@Component
public class User {

	private int uId;

	private String firstName;

	private String lastName;

	private String userName;

	private String password;

	private String emailId;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getUId() {
		return uId;
	}

	public void setUid(int uId) {
		this.uId = uId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + ", emailId=" + emailId + "]";
	}

}
