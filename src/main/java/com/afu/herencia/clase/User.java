package com.afu.herencia.clase;

public class User {
	
	protected String name;
	protected String lastName;
	protected String idNumber;
	protected String password;
		
	public User(String name, String lastName, String idNumber, String password) {

		this.name = name;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
