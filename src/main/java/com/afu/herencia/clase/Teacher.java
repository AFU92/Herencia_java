package com.afu.herencia.clase;

public class Teacher extends User {

	private String scale;
	
	public Teacher(String name, String lastName, String idNumber, String password, String scale) {
		super(name, lastName, idNumber, password);
		
		this.scale=scale;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	@Override
	public void resetPassword() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String lastLogin() {
		// TODO Auto-generated method stub
		return "El profesor tiene " + super.lastLogin();
	}

	
	
}
