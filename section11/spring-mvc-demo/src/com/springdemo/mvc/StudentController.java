package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/student")
public class StudentController {
	
	//method to show form
	@RequestMapping ("/showForm")
	public String showForm(Model theModel) {
		
		//create new student object
		Student student = new Student();
		//add student object to the model
		
		theModel.addAttribute("student", student);
		return "student-form";
	}
	
	
	//method to process form
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		student.setFirstName(student.getFirstName().toUpperCase());
		student.setLastName(student.getLastName().toUpperCase());
		System.out.println("Hello Mr. : " + student.getFirstName() + " " + student.getLastName());
		
		return "student-confirmation";
	}
	
}
