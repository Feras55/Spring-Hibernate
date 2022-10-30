package com.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	private String firstName;
	
	//Add validation rules
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	
	@Min(value=0, message = " must be greater than or equal to zero")
	@Max(value=10, message = "must be less than or equal to ten")
	@NotNull(message="is required")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="Only five characters/digits")
	@NotNull(message="is required")
	private String postalCode;
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
