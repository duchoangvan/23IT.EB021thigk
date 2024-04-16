package controller;

import test.TestJDBCUtil;

public class Experience implements Employee{
	private int ID;
	private String FullName;

	private int BirthDay,Phone;
	private char Email, Employee_type;
	private int Employee_count;
	
	private int ExpInYear;
	private String ProSkill;
	
	public Experience(int iD, String fullName, int birthDay, int phone, char email, char employee_type,
			int employee_count, int expInYear, String proSkill) {
	
		ID = iD;
		FullName = fullName;
		BirthDay = birthDay;
		Phone = phone;
		Email = email;
		Employee_type = employee_type;
		Employee_count = employee_count;
		ExpInYear = expInYear;
		ProSkill = proSkill;
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

	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	public String getProSkill() {
		return ProSkill;
	}

	public void setProSkill(String proSkill) {
		ProSkill = proSkill;
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
