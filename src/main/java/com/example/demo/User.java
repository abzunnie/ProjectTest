package com.example.demo;

public class User 
{
	private int userID;
	private String userName;
	private String userEmail;
	
	public User(int userID, String userName, String userEmail) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userEmail = userEmail;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
}
