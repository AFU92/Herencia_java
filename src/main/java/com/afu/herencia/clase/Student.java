package com.afu.herencia.clase;

public class Student extends User {

	private String semester;
	private String promedium;
	private String approvedCredits;

	public Student(String name, String lastName, String idNumber, String password, String semester, String promedium,
			String approvedCredits) {
		super(name, lastName, idNumber, password);

		this.semester = semester;
		this.promedium = promedium;
		this.approvedCredits = approvedCredits;
		// TODO Auto-generated constructor stub
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getPromedium() {
		return promedium;
	}

	public void setPromedium(String promedium) {
		this.promedium = promedium;
	}

	public String getApprovedCredits() {
		return approvedCredits;
	}

	public void setApprovedCredits(String approvedCredits) {
		this.approvedCredits = approvedCredits;
	}

}
