package controller;

import test.TestJDBCUtil;

public class Fresher implements Employee{
	private int ID;
	private String FullName;

	private int BirthDay,Phone;
	private char Email, Employee_type;
	private int Employee_count;

	private int Graduation_date;
	private String Graduation_rank;
	private String Education;
	public Fresher(int iD, String fullName, int birthDay, int phone, char email, char employee_type, int employee_count,
			int graduation_date, String graduation_rank, String education) {
	
		ID = iD;
		FullName = fullName;
		BirthDay = birthDay;
		Phone = phone;
		Email = email;
		Employee_type = employee_type;
		Employee_count = employee_count;
		Graduation_date = graduation_date;
		Graduation_rank = graduation_rank;
		Education = education;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public int getBirthDay() {
		return BirthDay;
	}
	public void setBirthDay(int birthDay) {
		BirthDay = birthDay;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public char getEmail() {
		return Email;
	}
	public void setEmail(char email) {
		Email = email;
	}
	public char getEmployee_type() {
		return Employee_type;
	}
	public void setEmployee_type(char employee_type) {
		Employee_type = employee_type;
	}
	public int getEmployee_count() {
		return Employee_count;
	}
	public void setEmployee_count(int employee_count) {
		Employee_count = employee_count;
	}
	public int getGraduation_date() {
		return Graduation_date;
	}
	public void setGraduation_date(int graduation_date) {
		Graduation_date = graduation_date;
	}
	public String getGraduation_rank() {
		return Graduation_rank;
	}
	public void setGraduation_rank(String graduation_rank) {
		Graduation_rank = graduation_rank;
	}
	public String getEducation() {
		return Education;
	}
	public void setEducation(String education) {
		Education = education;
	}
	@Override
	public void ShowInfo() {
		
	}

	@Override
	public int count() {
		TestJDBCUtil test = new TestJDBCUtil();
		System.out.println();
	}
}
