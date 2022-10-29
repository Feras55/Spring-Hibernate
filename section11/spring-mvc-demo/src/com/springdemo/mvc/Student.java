package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;	
	private String lastName;
	private String country;
	private String favoriteLanguage;
	
	private LinkedHashMap<String,String>countries;
	private LinkedHashMap<String,String>languages;
	private LinkedHashMap<String,String>operatingSystems;
	private String[] favoriteOperatingSystems;
	
	
	public LinkedHashMap<String, String> getLanguages() {
		return languages;
	}

	public Student() {
		//populate countries map using ISO country code
		countries = new LinkedHashMap<>();
		countries.put("BR","Brazil");
		countries.put("FR","France");
		countries.put("DE","Germany");
		countries.put("IN","India");
		countries.put("EG","Egypt");
		
		languages = new LinkedHashMap<>();
		languages.put("Java", "Java");
		languages.put("C++", "C++");
		languages.put("C#", "C#");
		languages.put("Ruby", "Ruby");
		
		operatingSystems = new LinkedHashMap<>();
		operatingSystems.put("Linux","Linux");
		operatingSystems.put("Mac OS","Mac OS");
		operatingSystems.put("MS Windows","MS Windows");
		
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

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getFavoriteOperatingSystems() {
		return favoriteOperatingSystems;
	}

	public void setFavoriteOperatingSystems(String[] favoriteOperatingSystems) {
		this.favoriteOperatingSystems = favoriteOperatingSystems;
	}

	public LinkedHashMap<String,String> getOperatingSystems() {
		return operatingSystems;
	}
	

}
