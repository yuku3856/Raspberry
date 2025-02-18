package com.example.demo.domain;

import java.util.Map;

public class AccountSearchInfo {
	
	private String age;
	
	private Map<Integer, String> sex;
	
	private Map<Integer, String> language;
	
	private Map<Integer, String> EmploymentType;


	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Map<Integer, String> getSex() {
		return sex;
	}

	public void setSex(Map<Integer, String> sex) {
		this.sex = sex;
	}

	public Map<Integer, String> getLanguage() {
		return language;
	}

	public void setLanguage(Map<Integer, String> language) {
		this.language = language;
	}

	public Map<Integer, String> getEmploymentType() {
		return EmploymentType;
	}

	public void setEmploymentType(Map<Integer, String> employmentType) {
		EmploymentType = employmentType;
	}

}
