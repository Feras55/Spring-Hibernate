package com.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = CourseCodeConstraintValidator.class) //determine the constraint, Helper class that contains the validation logic
@Target ({ElementType.METHOD, ElementType.FIELD})  //where this validator shall be applied
@Retention (RetentionPolicy.RUNTIME)//how long will the mark annotation will be stored
public @interface CourseCode {

		// define default course code
		
	public String value() default "LUV";
	
	   // define default error message
	public String message() default "must start with LUV";
	  //define default groups
	public Class<?>[] groups() default{};
	 //define default payloads
	public Class<? extends Payload>[] payload() default{};
}
