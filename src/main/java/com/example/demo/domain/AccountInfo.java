package com.example.demo.domain;

public class AccountInfo {
	
	private int id;
	
	private String accountName;
	
	private String company;
	
	private String age;
	
	private String sex;
	
	private String language;
	
	private String EmploymentType;

	
	public int getId() {
		return id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getEmploymentType() {
		return EmploymentType;
	}

	public void setEmploymentType(String employmentType) {
		EmploymentType = employmentType;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}

