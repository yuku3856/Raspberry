package com.example.demo.domain;

import java.util.ArrayList;

public class AccountSearchInfo {
	
	private String age;
	
	private ArrayList<String> sex;
	
	private ArrayList<String> language;
	
	private ArrayList<String> EmploymentType;


	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public ArrayList<String> getSex() {
		return sex;
	}

	public void setSex(ArrayList<String> sex) {
		this.sex = sex;
	}

	public ArrayList<String> getLanguage() {
		return language;
	}

	public void setLanguage(ArrayList<String> language) {
		this.language = language;
	}

	public ArrayList<String> getEmploymentType() {
		return EmploymentType;
	}

	public void setEmploymentType(ArrayList<String> employmentType) {
		EmploymentType = employmentType;
	}

}
