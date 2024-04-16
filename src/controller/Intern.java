package controller;

import test.TestJDBCUtil;

public class Intern implements Employee{
	private int ID;
	private String FullName;

	private int BirthDay,Phone;
	private char Email, Employee_type;
	private int Employee_count;
	
	public Intern(int iD, String fullName, int birthDay, int phone, char email, char employee_type, int employee_count,
			String majors, int semester, int university_name) {
	
		ID = iD;
		FullName = fullName;
		BirthDay = birthDay;
		Phone = phone;
		Email = email;
		Employee_type = employee_type;
		Employee_count = employee_count;
		Majors = majors;
		Semester = semester;
		University_name = university_name;
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
	public String getMajors() {
		return Majors;
	}
	public void setMajors(String majors) {
		Majors = majors;
	}
	public int getSemester() {
		return Semester;
	}
	public void setSemester(int semester) {
		Semester = semester;
	}
	public int getUniversity_name() {
		return University_name;
	}
	public void setUniversity_name(int university_name) {
		University_name = university_name;
	}
	private String Majors;
	private int Semester;
	private int University_name;
	@Override
	public void ShowInfo() {
		
		
	}

	@Override
	public int count() {
		TestJDBCUtil test = new TestJDBCUtil();
		System.out.println();
	}
}
