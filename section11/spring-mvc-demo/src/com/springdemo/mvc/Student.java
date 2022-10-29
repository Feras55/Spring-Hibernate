package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;	
	private String lastName;
	private String country;
	
	private LinkedHashMap<String,String>countries;
	
	public Student() {
		//populate countries map using ISO country code
		countries = new LinkedHashMap<>();
		countries.put("BR","Brazil");
		countries.put("FR","France");
		countries.put("DE","Germany");
		countries.put("IN","India");
		countries.put("EG","Egypt");
		
	}

	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

}
