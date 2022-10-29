package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") //controller level mapping, all methods mapping is now relative to the controller mapping eg (/hello/showForm
public class HelloWorldController {
	
	//need a controller method to show initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller to process the  HTML form
	@RequestMapping ("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new controller method for processing param and data to the model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from the HTML form
		String name = request.getParameter("studentName");
				
		//convert data to uppercase
		name = name.toUpperCase();
		
		//create message
		String message = "Hey Yo! " + name;
		//add message to the model
		
		model.addAttribute("message", message);
		
		return "helloworld";
	}
	
	
	//same method as above except to the way the name parameter is retrieved from the request
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String name, Model model) { 	//assign name to value of request parameter
		
	
				
		//convert data to uppercase
		name = name.toUpperCase();
		
		//create message
		String message = "Hey Bro! from V3 " + name;
		//add message to the model
		
		model.addAttribute("message", message);
		
		return "helloworld";
	}
	

	

}

