package com.adjecti.security.core.dto;

// for register 
public class UserDTO {

	private String userName;
	private String emailAddress;
	private String password_;
	private String firstName;
	private String middleName;
	private String lastName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword_() {
		return password_;
	}
	public void setPassword_(String password_) {
		this.password_ = password_;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public UserDTO(String userName, String emailAddress, String password_, String firstName, String middleName,
			String lastName) {
		super();
		this.userName = userName;
		this.emailAddress = emailAddress;
		this.password_ = password_;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
